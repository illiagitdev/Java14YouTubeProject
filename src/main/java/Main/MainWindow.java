package main.java.core_project;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainWindow extends Application {
    private static final String URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=5&q=";
    private static final String KEY = "&key=AIzaSyDsxIyAMEYNxF5s4KqcP2hA0trTYzi5ZaU";
    private static final int HEIGHT = 500;
    private static final int WIDTH = 650;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        windowSetUp(stage);

        uiSetup(root);
    }

    private void uiSetup(Group root) {
        TextField searchText = new TextField();
        OkHttpClient client = new OkHttpClient();

        Button searchButton = new Button("Search");
        HBox searchBox = new HBox(searchText, searchButton);
        searchBox.setSpacing(15);
        searchBox.setLayoutX(35);
        searchBox.setLayoutY(25);

        TextArea text = new TextArea();
        text.setWrapText(true);
        VBox vBox = new VBox(searchBox, text);

        searchButton.setOnMouseClicked(event -> {
            try {
                Response response = client.newCall(new Request.
                        Builder().url(String.
                        format("%s%s%s", URL, searchText.getText(),  KEY)).
                        get().
                        build()).
                        execute();
                String str = searchText.getText();
                ObjectMapper mapper = new ObjectMapper();
//                List<YoutubeResponse> list = mapper.
//                        readValue(response.body().bytes(), new TypeReference<List<YoutubeResponse>>(){});
                YoutubeResponse responseYoutube = mapper.readValue(response.body().bytes(), new TypeReference<YoutubeResponse>() {});
//                text.appendText(new String(response.body().bytes()));
                text.appendText(str + "\n" + response.code() + "\n" + responseYoutube.toString() + "\n");

                Call call;
//                call.enqueue();
            } catch (IOException e) {
                e.printStackTrace();
                text.setText(e.getMessage());
            }

        });
        root.getChildren().addAll(vBox);
    }

    private void windowSetUp(Stage stage) {
        stage.setTitle("YouTube API(core)");
        stage.setMinHeight(HEIGHT);
        stage.setMinWidth(WIDTH);

        stage.setMinHeight(HEIGHT);
        stage.setMinHeight(WIDTH);
    }
}
