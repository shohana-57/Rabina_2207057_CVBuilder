package com.example.rabina_2207057_cvbuilder;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;
import java.time.LocalDate;

public class page2_controller {
    public Button btnBack;
    public Button btnDelete;
    public Button btnUpdate;
    public TextField txtSearch;
    public ListView<CVNode> listUsers;
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

    @FXML private Button btnSave;
    @FXML private Label statusLabel;

    private final ObservableList<CVNode> samples= FXCollections.observableArrayList();
    private final CVRepository repository=new CVRepository();

    @FXML
    public void initialize(){
        listUsers.setItems(samples);
        listUsers.setCellFactory(list-> new ListCell<CVNode>(){
            protected void updateItem(CVNode item, boolean empty){
                super.updateItem(item,empty);
                setText(empty || item == null ? null :item.getFullName());
            }
        });

        listUsers.getSelectionModel().selectedItemProperty().addListener((obs,oldsel,newSel)-> {
                    if (newSel != null)
                        loadCVToForm((CVNode) newSel);

                }
                );
        loadAllCV();
    }


    private void loadAllCV(){
        setStatus("Loading record...");
        repository.getAllAsync(this::onLoadSuccess, this::onError);
    }

    private void setStatus(String s) {
        Platform.runLater(()->statusLabel.setText(s));
    }

    private void onLoadSuccess(List<CVNode> loaded){
        samples.setAll(loaded);
    }

    private void onError(Throwable throwable){
        throwable.printStackTrace();
        Alert alert=new Alert(Alert.AlertType.ERROR, throwable.getMessage(),ButtonType.OK);
        alert.setHeaderText(" An Error occured");
        alert.showAndWait();
    }

    private void loadCVToForm(CVNode cv) {
        txtFullName.setText(cv.getFullName());
        txtFather.setText(cv.getFatherName());
        txtMother.setText(cv.getMotherName());
        txtEmail.setText(cv.getEmail());
        txtAddress.setText(cv.getAddress());
        txtNumber.setText(cv.getContactNumber());
        txtBirth.setValue(cv.getDateofBirth());
        txtExam1.setText(cv.getExam1());
        txtB1.setText(cv.getB1());
        txtG1.setText(cv.getFG1());
        txtGPA1.setText(cv.getGPA1());
        txtY1.setText(cv.getY1());
        txtExam2.setText(cv.getExam2());
        txtB2.setText(cv.getB2());
        txtG2.setText(cv.getG2());
        txtGPA2.setText(cv.getGPA2());
        txtY2.setText(cv.getY2());
        txtExam3.setText(cv.getExam3());
        txtU1.setText(cv.getU1());
        txtD1.setText(cv.getD1());
        txtCGPA1.setText(cv.getCGPA1());
        txtY3.setText(cv.getY3());
        txtExam4.setText(cv.getExam4());
        txtU2.setText(cv.getU2());
        txtD2.setText(cv.getD2());
        txtCGPA2.setText(cv.getCGPA2());
        txtY4.setText(cv.getY4());
        txtSkills.setText(cv.getSkills());
        txtExperience.setText(cv.getExperience());
        txtProject.setText(cv.getProjects());


    }

    private CVNode getFormData(){
        return new CVNode(
                -1,
                txtFullName.getText().trim(),
                txtFather.getText().trim(),
                txtMother.getText().trim(),
                txtEmail.getText().trim(),
                txtAddress.getText().trim(),
                txtNumber.getText().trim(),
                txtBirth.getValue(),
                txtAddress.getText().trim(),
                txtExam1.getText().trim(),
                txtB1.getText().trim(),
                txtG1.getText().trim(),
                txtGPA1.getText().trim(),
                txtY1.getText().trim(),
                txtExam2.getText().trim(),
                txtB2.getText().trim(),
                txtG2.getText().trim(),
                txtGPA2.getText().trim(),
                txtY2.getText().trim(),
                txtExam3.getText().trim(),
                txtU1.getText().trim(),
                txtD1.getText().trim(),
                txtCGPA1.getText().trim(),
                txtY3.getText().trim(),
                txtExam4.getText().trim(),
                txtU2.getText().trim(),
                txtD2.getText().trim(),
                txtCGPA2.getText().trim(),
                txtY4.getText().trim(),
                txtSkills.getText().trim(),
                txtExperience.getText().trim(),
                txtProject.getText().trim()

        );

    }

    private void clearForm(){
        txtFullName.clear();
                txtFather.clear();
                txtMother.clear();
                txtEmail.clear();
                txtNumber.clear();
                txtBirth.setValue(null);
                txtAddress.clear();
                txtExam1.clear();
                txtB1.clear();
                txtG1.clear();
                txtGPA1.clear();
                txtY1.clear();
                txtExam2.clear();
                txtB2.clear();
                txtG2.clear();
                txtGPA2.clear();
                txtY2.clear();
                txtExam3.clear();
                txtU1.clear();
                txtD1.clear();
                txtCGPA1.clear();
                txtY3.clear();
                txtExam4.clear();
                txtU2.clear();
                txtD2.clear();
                txtCGPA2.clear();
                txtY4.clear();
                txtSkills.clear();
                txtExperience.clear();
                txtProject.clear();
    }


    @FXML
    void goToPreview(ActionEvent e) {
        if(!validate())
        { showError();
            return;}
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
           stage.setScene(new Scene(root, 900, 1000));

           showSuccess();
       }catch(Exception ex){ex.printStackTrace();}


    }
    private boolean validate(){
        return !txtFullName.getText().trim().isEmpty() || !txtFather.getText().trim().isEmpty() || !txtMother.getText().trim().isEmpty() || txtEmail.getText().matches("@") || txtFullName.getText().matches("\\d{10,11}");

    }

    private void showError(){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Input Error");
        alert.setContentText("Error!");
        alert.showAndWait();
    }

    private void showSuccess()
    {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("CV saved successfully!");
        alert.showAndWait();
    }


@FXML
    public void goTOPrev(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/rabina_2207057/cvbuilder/front_page.fxml")));
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,900,700));
        stage.show();
    }

    public void onSaveClicked(ActionEvent actionEvent) {
        if(!validate()){
            showError();
            return;
        }
        CVNode cv= getFormData();
        setStatus("Saving...");
        repository.getAllAsync(this::onLoadSuccess, this::onError);

    }

    @FXML
    private void onUpdateClicked() {
        CVNode selected = (CVNode) listUsers.getSelectionModel().getSelectedItem();
        if (selected == null){
            setStatus("Select a record to update.");
            return;
        }

        CVNode updated = new CVNode(
                selected.getId(),
                txtFullName.getText().trim(),
                txtFather.getText().trim(),
                txtMother.getText().trim(),
                txtEmail.getText().trim(),
                txtAddress.getText().trim(),
                txtNumber.getText().trim(),
                txtBirth.getValue(),
                txtAddress.getText().trim(),
                txtExam1.getText().trim(),
                txtB1.getText().trim(),
                txtG1.getText().trim(),
                txtGPA1.getText().trim(),
                txtY1.getText().trim(),
                txtExam2.getText().trim(),
                txtB2.getText().trim(),
                txtG2.getText().trim(),
                txtGPA2.getText().trim(),
                txtY2.getText().trim(),
                txtExam3.getText().trim(),
                txtU1.getText().trim(),
                txtD1.getText().trim(),
                txtCGPA1.getText().trim(),
                txtY3.getText().trim(),
                txtExam4.getText().trim(),
                txtU2.getText().trim(),
                txtD2.getText().trim(),
                txtCGPA2.getText().trim(),
                txtY4.getText().trim(),
                txtSkills.getText().trim(),
                txtExperience.getText().trim(),
                txtProject.getText().trim()
        );

        repository.updateAsync(updated, () -> {
            int index = samples.indexOf(selected);
            if (index >= 0) samples.set(index, updated);
            listUsers.getSelectionModel().select(updated);
        }, this::onError);
    }

    @FXML
    private void onDeleteClicked() {
        CVNode selected = listUsers.getSelectionModel().getSelectedItem();
        if (selected == null) {
            setStatus("Select a record to delete.");
            return;
        }

        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION,
                "Delete record #" + selected.getFullName() + "?",
                ButtonType.YES, ButtonType.NO);
        confirm.setHeaderText("Confirm delete");
        confirm.showAndWait().ifPresent(btn -> {
            if (btn == ButtonType.YES) {
                setStatus("Deleting...");
                repository.deleteAsync(selected.getId(), () -> {
                    samples.remove(selected);
                    clearFields();
                    setStatus("Record deleted.");
                }, this::onError);
                clearForm();
            }
        });

            }

    private void clearFields() {
    }



}
