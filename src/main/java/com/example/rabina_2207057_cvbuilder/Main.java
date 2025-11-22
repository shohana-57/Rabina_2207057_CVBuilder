package com.example.rabina_2207057_cvbuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("front_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 250);
        stage.setTitle("HomePage");
        stage.setScene(scene);
        stage.show();
    }
}
