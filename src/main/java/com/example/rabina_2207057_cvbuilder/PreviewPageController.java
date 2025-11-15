package com.example.rabina_2207057_cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PreviewPageController {
    public void addToTable(ActionEvent actionEvent) {
    }

    private Parent parent;
    private Scene scene;
    private Stage stage;
    @FXML
    private TextField txtFullName;
    public PreviewPageController()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/rabina_2207057_cvbuilder/PreviewPage.fxml"));
        fxmlLoader.setController(this);
        try{
            parent = (Parent)fxmlLoader.load();
            scene=new Scene(parent,600,800);
        }  catch(IOException e){
            e.printStackTrace();
        }
    }

    public void redirectView(Stage stage, String name){
        stage.setTitle("PreView CV");
        stage.setScene(scene);
        txtFullName.setText(name);
        stage.hide();
        stage.show();

    }
}
