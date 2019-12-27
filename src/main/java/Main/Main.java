package Main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.*;

import java.io.IOException;

public class Main extends Application {
    private static final String ROOT_URL = "https://www.googleapis.com";
    private static final String KEY = "AIzaSyDsxIyAMEYNxF5s4KqcP2hA0trTYzi5ZaU";
    private static final int HEIGHT = 500;
    private static final int WIDTH = 650;
    private static ObjectMapper mapper = new ObjectMapper();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        setupUI(root);

        setupWindow(primaryStage);
    }

    private void setupWindow(Stage stage) {
        stage.setMaxWidth(WIDTH);
        stage.setMaxHeight(HEIGHT);

        stage.setMinWidth(WIDTH);
        stage.setMinHeight(HEIGHT);
        stage.setTitle("YouTube Search");
    }

    private void setupUI(Group root) {
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


        search.setOnMouseClicked(event -> {

            OkHttpClient client = new OkHttpClient();

        searchButton.setOnMouseClicked(event -> {
            try {
                Response response = client.newCall(new Request.Builder().
                        url(buildHttpUrl(searchText.getText()))
                        .get()
                        .build())
                        .execute();
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

    private HttpUrl buildHttpUrl(String searchText) {
        return buildHttpUrl(searchText ,"25");
    }

    private HttpUrl buildHttpUrl(String searchText, String maxResults) {
        return HttpUrl.parse(ROOT_URL).newBuilder()
                .addPathSegment("youtube")
                .addPathSegment("v3")
                .addPathSegment("search")
                .addQueryParameter("part","snippet")
                .addQueryParameter("MaxResults",maxResults)
                .addQueryParameter("q",searchText)
                .addQueryParameter("","")
                .addQueryParameter("key",KEY)
                .build();
    }
//        Название видео
//        Название канала
//        Дата публикации
//        Кнопка - View. При нажатии на которую воспроизводиться видео в окне программы.
//        изображение из видео
//        Кол-во дней. Если видео было опубликовано раньше чем Х дней назад, значит его не надо отображать в поиске.
//
//        Аватарка канала
//        Название канала
//        Описание канала

    public static void main(String[] args) {
        launch(args);
    }
}
