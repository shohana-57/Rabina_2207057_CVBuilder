package com.example.rabina_2207057_cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class PreviewPageController {
    public javafx.scene.control.Label lblFullName;
    public javafx.scene.control.Label lblFather;
    public javafx.scene.control.Label lblMother;
    public javafx.scene.control.Label lblEmail;
    public javafx.scene.control.Label lblPhone;
    public javafx.scene.control.Label lblDOB;
    public javafx.scene.control.Label lblAddress;
    public javafx.scene.control.Label lblExam1;
    public javafx.scene.control.Label lblYear1;
    public javafx.scene.control.Label lblResult1;
    public javafx.scene.control.Label lblExam2;
    public javafx.scene.control.Label lblYear2;
    public javafx.scene.control.Label lblResult2;
    public javafx.scene.control.Label lblExam3;
    public javafx.scene.control.Label lblYear3;
    public javafx.scene.control.Label lblResult3;
    public javafx.scene.control.Label lblExam4;
    public javafx.scene.control.Label lblYear4;
    public javafx.scene.control.Label lblResult4;
    public javafx.scene.control.Label lblSkills;
    public javafx.scene.control.Label lblProject;
    public javafx.scene.control.Label lblExperience;
    public Label lblBoard1;
    public Label lblGroup1;
    public Label lblBoard2;
    public Label lblGroup2;
    public Label lblBoard3;
    public Label lblGroup3;
    public Label lblBoard4;
    public Label lblGroup4;
    public Label lblCV;


    public void setData(String text, String text1, String text2, String text3, String text4, Tooltip tooltip, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12, String text13, String text14, String text15, String text16, String text17, String text18, String text19, String text20, String text21, String text22, String text23, String text24, String text25, String text26, String text27, String text28) {
        lblFullName.setText(text);
        lblFather.setText(text1);
        lblMother.setText(text2);
        lblEmail.setText(text3);
        lblPhone.setText(text4);
        lblDOB.setText(String.valueOf(tooltip));
        lblAddress.setText(text5);
        lblExam1.setText(text6);
        lblBoard1.setText(text7);
        lblGroup1.setText(text8);
        lblResult1.setText(text9);
        lblYear1.setText(text10);
        lblExam2.setText(text11);
        lblBoard2.setText(text12);
        lblGroup2.setText(text13);
        lblResult2.setText(text14);
        lblYear2.setText(text15);
        lblExam3.setText(text16);
        lblBoard3.setText(text17);
        lblGroup3.setText(text18);
        lblResult3.setText(text19);
        lblYear3.setText(text20);
        lblExam4.setText(text21);
        lblBoard4.setText(text22);
        lblGroup4.setText(text23);
        lblResult4.setText(text24);
        lblYear4.setText(text25);
        lblSkills.setText(text26);
        lblExperience.setText(text27);
        lblProject.setText(text28);



    }

    public void goBack(ActionEvent actionEvent) throws IOException {
        Parent root =FXMLLoader.load(Objects.requireNonNull(getClass().getResource("page-2.fxml")));
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,900,700));
    }

    public void exitApp(ActionEvent actionEvent) {
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
