package com.example.rabina_2207057_cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import java.awt.*;
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
@FXML private Label lblReceived;
    public void setData(String s) {
        lblReceived.setText(s);
    }

    public void setData(String text, String text1, String text2, String text3, String text4, Tooltip tooltip, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12, String text13, String text14, String text15, String text16, String text17, String text18, String text19, String text20, String text21, String text22, String text23, String text24, String text25, String text26, String text27, String text28) {
    }
}
