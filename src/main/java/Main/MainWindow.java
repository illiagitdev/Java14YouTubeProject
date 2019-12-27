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

}
