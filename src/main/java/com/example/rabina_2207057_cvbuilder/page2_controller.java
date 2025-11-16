package com.example.rabina_2207057_cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class page2_controller {
    public Button btnBack;
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
    void goToPreview(ActionEvent e) {
       try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("PreviewPage.fxml"));
           Parent root = loader.load();
           PreviewPageController controller = loader.getController();
           controller.setData(

                   txtFullName.getText(),
                   txtFather.getText(),
                   txtMother.getText(),
                   txtEmail.getText(),
                   txtNumber.getText(),
                   txtBirth.getTooltip(),
                   txtAddress.getText(),
                   txtExam1.getText(),
                   txtB1.getText(),
                   txtG1.getText(),
                   txtGPA1.getText(),
                   txtY1.getText(),
                   txtExam2.getText(),
                   txtB2.getText(),
                   txtG2.getText(),
                   txtGPA2.getText(),
                   txtY2.getText(),
                   txtExam3.getText(),
                   txtU1.getText(),
                   txtD1.getText(),
                   txtCGPA1.getText(),
                   txtY3.getText(),
                   txtExam4.getText(),
                   txtU2.getText(),
                   txtD2.getText(),
                   txtCGPA2.getText(),
                   txtY4.getText(),
                   txtSkills.getText(),
                   txtExperience.getText(),
                   txtProject.getText()
                   );
           Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root, 900, 700));
       }catch(Exception ex){ex.printStackTrace();}


    }


@FXML
    public void goTOPrev(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/rabina_2207057/cvbuilder/front_page.fxml")));
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,900,700));
        stage.show();
    }
}
