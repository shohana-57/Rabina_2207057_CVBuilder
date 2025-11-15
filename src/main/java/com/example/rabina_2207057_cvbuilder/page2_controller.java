package com.example.rabina_2207057_cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class page2_controller {
private Parent parent;
private Scene scene;
private Stage stage;
private PreviewPageController preview;
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtB1;

    @FXML
    private TextField txtB2;

    @FXML
    private DatePicker txtBirth;

    @FXML
    private TextField txtCGPA1;

    @FXML
    private TextField txtCGPA2;

    @FXML
    private TextField txtD1;

    @FXML
    private TextField txtD2;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtExam1;

    @FXML
    private TextField txtExam2;

    @FXML
    private TextField txtExam3;

    @FXML
    private TextField txtExam4;

    @FXML
    private TextArea txtExperience;

    @FXML
    private TextField txtFather;

    @FXML
    private TextField txtFullName;

    @FXML
    private TextField txtG1;

    @FXML
    private TextField txtG2;

    @FXML
    private TextField txtGPA1;

    @FXML
    private TextField txtGPA2;

    @FXML
    private TextField txtMother;

    @FXML
    private TextField txtNumber;

    @FXML
    private TextArea txtProject;

    @FXML
    private TextArea txtSkills;

    @FXML
    private TextField txtU1;

    @FXML
    private TextField txtU2;

    @FXML
    private TextField txtY1;

    @FXML
    private TextField txtY2;

    @FXML
    private TextField txtY3;

    @FXML
    private TextField txtY4;

    @FXML
    void goTOPrev(ActionEvent event)  throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("/com/example/rabina_2207057_cvbuilder/front_page.fxml"));
//
//        Scene scene = new Scene(root);
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        stage.setScene(scene);
//        //stage.setTitle("CV Information");
//        stage.show();

    }
public page2_controller()
{
    FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/com/example/rabina_2207057_cvbuilder/page-2.fxml"));
    fxmlLoader.setController(this);
    try {
        parent = (Parent) fxmlLoader.load();
        scene = new Scene(parent, 600, 800);
    }  catch(IOException e){
        e.printStackTrace();
    }
}
    @FXML
    void goToPreview(ActionEvent event)  throws IOException{
//        Parent root = FXMLLoader.load(getClass().getResource("/com/example/rabina_2207057_cvbuilder/preview_page.fxml"));
//
//        Scene scene = new Scene(root);
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        stage.setScene(scene);
//        stage.setTitle("CV Preview");
//        stage.show();
        System.out.println(txtFullName.getText());
        preview =new PreviewPageController();
        preview.redirectView(stage,txtFullName.getText().trim());


    }



}
