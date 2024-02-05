package caseneww;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

public class DepartmentBASE extends AnchorPane {
// Method to refresh the TableView
private void refreshTableView() {
    try {
        ObservableList<Departments> depData = DataAccessLayer.getAllDepartments();
        tG.setItems(depData);
        ll1.setText(" refreshed successfully.");
    } catch (SQLException ex) {
        ll1.setText("Failed to refresh : " + ex.getMessage());
        ex.printStackTrace();  // Print the stack trace for debugging
    }
}

private void showAlert(String title, String content, String details) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        if (details != null) {
            alert.getDialogPane().setExpandableContent(new javafx.scene.control.TextArea(details));
        }
        alert.showAndWait();
    }


    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final VBox vBox;
    protected final HBox hBox;
    protected final VBox vBox0;
    protected final HBox hBox0;
    protected final Button studentBTN;
    protected final HBox hBox1;
    protected final Button departmentBTN;
    protected final HBox hBox2;
    protected final Button coursesBTN;
    protected final HBox hBox3;
    protected final Button gradesBTN;
    protected final HBox hBox4;
  //  protected final Button professourBTN;
    protected final HBox hBox5;
  
    protected final HBox hBox6;
    protected final AnchorPane gbaLabel;
    protected final Label label;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final Button insertBTN;
    protected final Button updateBTN;
    protected final Button deleteBTN;
    protected final TextField dep_ID_TF;
    protected final Label label0;
    protected final Label label1;
    protected final TextField depNameTF;
    protected final Label ll1;
    protected final Label label2;
    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane0;
    protected final TableView tG;
    protected final TableColumn C1;
    protected final TableColumn C2;

    public DepartmentBASE() throws SQLException {

        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        vBox = new VBox();
        hBox = new HBox();
        vBox0 = new VBox();
        hBox0 = new HBox();
        studentBTN = new Button();
        hBox1 = new HBox();
        departmentBTN = new Button();
        hBox2 = new HBox();
        coursesBTN = new Button();
        hBox3 = new HBox();
        gradesBTN = new Button();
        hBox4 = new HBox();
//        professourBTN = new Button();
        hBox5 = new HBox();
     
        hBox6 = new HBox();
        gbaLabel = new AnchorPane();
        label = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        insertBTN = new Button();
        updateBTN = new Button();
        deleteBTN = new Button();
        dep_ID_TF = new TextField();
        label0 = new Label();
        label1 = new Label();
        depNameTF = new TextField();
        ll1 = new Label();
        label2 = new Label();
        scrollPane = new ScrollPane();
        anchorPane0 = new AnchorPane();
        tG = new TableView();
        C1 = new TableColumn();
        C2 = new TableColumn();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(780.0);
        setPrefWidth(780.0);

        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane, 0.0);
        AnchorPane.setTopAnchor(borderPane, 0.0);
        borderPane.setPrefHeight(720.0);
        borderPane.setPrefWidth(720.0);
        borderPane.setStyle("-fx-background-color: #fffafa;");

        BorderPane.setMargin(anchorPane, new Insets(0.0));

        AnchorPane.setBottomAnchor(vBox, 0.0);
        AnchorPane.setLeftAnchor(vBox, 0.0);
        AnchorPane.setTopAnchor(vBox, 0.0);
        vBox.setPrefHeight(780.0);
        vBox.setPrefWidth(170.0);
        vBox.setSpacing(60.0);
        vBox.setStyle("-fx-background-color: #d2f8d2;");

        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setPrefHeight(100.0);
        hBox.setPrefWidth(170.0);

        vBox0.setPrefHeight(666.0);
        vBox0.setPrefWidth(170.0);
        vBox0.setSpacing(13.0);

        hBox0.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox0.setPrefHeight(60.0);
        hBox0.setPrefWidth(200.0);

        studentBTN.setMnemonicParsing(false);
        studentBTN.setPrefHeight(31.0);
        studentBTN.setPrefWidth(133.0);
        studentBTN.setStyle("-fx-background-color: #d2f8d2;");
        studentBTN.setText("students");
        studentBTN.setFont(new Font("System Bold", 16.0));

        hBox1.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox1.setLayoutX(10.0);
        hBox1.setLayoutY(10.0);
        hBox1.setPrefHeight(60.0);
        hBox1.setPrefWidth(200.0);

        departmentBTN.setMnemonicParsing(false);
        departmentBTN.setPrefHeight(31.0);
        departmentBTN.setPrefWidth(133.0);
        departmentBTN.setStyle("-fx-background-color: #d2f8d2;");
        departmentBTN.setText("departments");
        departmentBTN.setFont(new Font("System Bold", 16.0));

        hBox2.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox2.setLayoutX(10.0);
        hBox2.setLayoutY(156.0);
        hBox2.setPrefHeight(60.0);
        hBox2.setPrefWidth(200.0);

        coursesBTN.setMnemonicParsing(false);
        coursesBTN.setPrefHeight(31.0);
        coursesBTN.setPrefWidth(133.0);
        coursesBTN.setStyle("-fx-background-color: #d2f8d2;");
        coursesBTN.setText("courses");
        coursesBTN.setFont(new Font("System Bold", 16.0));

        hBox3.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox3.setLayoutX(10.0);
        hBox3.setLayoutY(229.0);
        hBox3.setPrefHeight(60.0);
        hBox3.setPrefWidth(200.0);

        gradesBTN.setMnemonicParsing(false);
        gradesBTN.setPrefHeight(31.0);
        gradesBTN.setPrefWidth(133.0);
        gradesBTN.setStyle("-fx-background-color: #d2f8d2;");
        gradesBTN.setText("grades");
        gradesBTN.setFont(new Font("System Bold", 16.0));

        hBox4.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox4.setLayoutX(10.0);
        hBox4.setLayoutY(302.0);
        hBox4.setPrefHeight(60.0);
        hBox4.setPrefWidth(200.0);
/*
        professourBTN.setMnemonicParsing(false);
        professourBTN.setPrefHeight(31.0);
        professourBTN.setPrefWidth(133.0);
        professourBTN.setStyle("-fx-background-color: #d2f8d2;");
        professourBTN.setText("Home");
        professourBTN.setFont(new Font("System Bold", 16.0));*/

        hBox5.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox5.setLayoutX(10.0);
        hBox5.setLayoutY(375.0);
        hBox5.setPrefHeight(60.0);
        hBox5.setPrefWidth(200.0);


        hBox6.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox6.setLayoutX(10.0);
        hBox6.setLayoutY(448.0);
        hBox6.setPrefHeight(60.0);
        hBox6.setPrefWidth(200.0);
        borderPane.setLeft(anchorPane);

        BorderPane.setAlignment(gbaLabel, javafx.geometry.Pos.CENTER);
        gbaLabel.setPrefHeight(780.0);
        gbaLabel.setPrefWidth(599.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(-2.0);
        label.setLayoutY(29.0);
        label.setPrefHeight(99.0);
        label.setPrefWidth(307.0);
        label.setText("Departments");
        label.setFont(new Font("System Italic", 45.0));

        gridPane.setLayoutX(161.0);
        gridPane.setLayoutY(285.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        insertBTN.setMnemonicParsing(false);
        insertBTN.setText("insert");

        GridPane.setColumnIndex(updateBTN, 1);
        updateBTN.setLayoutX(10.0);
        updateBTN.setLayoutY(10.0);
        updateBTN.setMnemonicParsing(false);
        updateBTN.setText("update");

        GridPane.setColumnIndex(deleteBTN, 2);
        deleteBTN.setLayoutX(160.0);
        deleteBTN.setLayoutY(10.0);
        deleteBTN.setMnemonicParsing(false);
        deleteBTN.setText("delete");

        dep_ID_TF.setLayoutX(170.0);
        dep_ID_TF.setLayoutY(153.0);
        dep_ID_TF.setPrefHeight(31.0);
        dep_ID_TF.setPrefWidth(206.0);

        label0.setLayoutX(26.0);
        label0.setLayoutY(158.0);
        label0.setText("Department ID");

        label1.setLayoutX(26.0);
        label1.setLayoutY(220.0);
        label1.setText("Department Name");

        depNameTF.setLayoutX(169.0);
        depNameTF.setLayoutY(215.0);
        depNameTF.setPrefHeight(31.0);
        depNameTF.setPrefWidth(208.0);

        ll1.setLayoutX(22.0);
        ll1.setLayoutY(337.0);
        ll1.setPrefHeight(44.0);
        ll1.setPrefWidth(566.0);

        label2.setLayoutX(177.0);
        label2.setLayoutY(493.0);
        label2.setPrefHeight(31.0);
        label2.setPrefWidth(303.0);

        scrollPane.setLayoutX(14.0);
        scrollPane.setLayoutY(386.0);
        scrollPane.setPrefHeight(352.0);
        scrollPane.setPrefWidth(436.0);
        
         tG.setLayoutX(-5.0);
        tG.setLayoutY(-1.0);
        tG.setPrefHeight(363.0);
        tG.setPrefWidth(450.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(360.0);
        anchorPane0.setPrefWidth(446.0);

       

        C1.setPrefWidth(133.0);
        C1.setText("Department ID");

        C2.setPrefWidth(293.0);
        C2.setText("Department Name");
        scrollPane.setContent(anchorPane0);
        borderPane.setCenter(gbaLabel);

        vBox.getChildren().add(hBox);
        hBox0.getChildren().add(studentBTN);
        vBox0.getChildren().add(hBox0);
        hBox1.getChildren().add(departmentBTN);
        vBox0.getChildren().add(hBox1);
        hBox2.getChildren().add(coursesBTN);
        vBox0.getChildren().add(hBox2);
        hBox3.getChildren().add(gradesBTN);
        vBox0.getChildren().add(hBox3);
       // hBox4.getChildren().add(professourBTN);
        vBox0.getChildren().add(hBox4);
       
        vBox0.getChildren().add(hBox5);
        vBox0.getChildren().add(hBox6);
        vBox.getChildren().add(vBox0);
        anchorPane.getChildren().add(vBox);
        gbaLabel.getChildren().add(label);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(insertBTN);
        gridPane.getChildren().add(updateBTN);
        gridPane.getChildren().add(deleteBTN);
        gbaLabel.getChildren().add(gridPane);
        gbaLabel.getChildren().add(dep_ID_TF);
        gbaLabel.getChildren().add(label0);
        gbaLabel.getChildren().add(label1);
        gbaLabel.getChildren().add(depNameTF);
        gbaLabel.getChildren().add(ll1);
        gbaLabel.getChildren().add(label2);
        tG.getColumns().add(C1);
        tG.getColumns().add(C2);
        anchorPane0.getChildren().add(tG);
        gbaLabel.getChildren().add(scrollPane);
        getChildren().add(borderPane);
        
        
        
        
        coursesBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    // Create a new scene with couselistBase and switch to it
                    Parent root = new CoursesBASE();
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
             
              gradesBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    // Create a new scene with couselistBase and switch to it
                    Parent root = new  GradesBASE();
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
  
        
         studentBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new scene with couselistBase and switch to it
                Parent root = new  StudentsBase();
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }
        });
        
        
        
        
        
      
        
        insertBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String Depid = dep_ID_TF.getText();
            String Depname = depNameTF.getText();
           
          

            StringBuilder errorMessage = new StringBuilder("One or more fields are empty: ");

            boolean hasEmptyField = false;

            if (Depid == null || Depid.isEmpty()) {
                errorMessage.append("Department ID, ");
                hasEmptyField = true;
            }

            if (Depname == null || Depname.isEmpty()) {
                errorMessage.append("Department Name, ");
                hasEmptyField = true;
            }


            if (hasEmptyField) {
                // Remove the trailing comma and space
                errorMessage.delete(errorMessage.length() - 2, errorMessage.length());
                ll1.setText(errorMessage.toString());
                return; // Exit the function if any field is empty
            }

         

            Departments department = new Departments(
                Integer.parseInt(Depid),Depname);

            int result = DataAccessLayer.insertDep(department);

           if (result > 0) {
                    showAlert("Success", "The data has been successfully inserted.", null);
                    refreshTableView();
                } else {
                    showAlert("Error", "Data insertion failed", null);
                }

            } catch (NumberFormatException e) {
                showAlert("Error", "Invalid number format. Please enter valid numeric values.", null);
            } catch (SQLException ex) {
                showAlert("Error", "Data Insertion Failed", ex.getMessage());
            }
    }
});

        
//end of insert

     
        deleteBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String Depid = dep_ID_TF.getText();
            String Depname = depNameTF.getText();
           
          

            StringBuilder errorMessage = new StringBuilder("One or more fields are empty: ");

            boolean hasEmptyField = false;

            if (Depid == null || Depid.isEmpty()) {
                errorMessage.append("Department ID, ");
                hasEmptyField = true;
            }

            if (Depname == null || Depname.isEmpty()) {
                errorMessage.append("Department Name, ");
                hasEmptyField = true;
            }


            if (hasEmptyField) {
                // Remove the trailing comma and space
                errorMessage.delete(errorMessage.length() - 2, errorMessage.length());
                ll1.setText(errorMessage.toString());
                return; // Exit the function if any field is empty
            }

         

            Departments department = new Departments(
                Integer.parseInt(Depid),Depname);

            int result = DataAccessLayer.deleteDep(department);

           if (result > 0) {
            showAlert("Success", "The data has been successfully deleted.", null);
            refreshTableView();
        } else {
            showAlert("Error", "Data delete failed", null);
        }

    } catch (NumberFormatException e) {
        showAlert("Error", "Invalid number format. Please enter valid numeric values.", null);
    } catch (SQLException ex) {
        showAlert("Error", "Data delete Failed", ex.getMessage());
    }
    }
});
        
        //end od delete 
        
        updateBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String Depid = dep_ID_TF.getText();
            String Depname = depNameTF.getText();
           
          

            StringBuilder errorMessage = new StringBuilder("One or more fields are empty: ");

            boolean hasEmptyField = false;

            if (Depid == null || Depid.isEmpty()) {
                errorMessage.append("Department ID, ");
                hasEmptyField = true;
            }

            if (Depname == null || Depname.isEmpty()) {
                errorMessage.append("Department Name, ");
                hasEmptyField = true;
            }


            if (hasEmptyField) {
                // Remove the trailing comma and space
                errorMessage.delete(errorMessage.length() - 2, errorMessage.length());
                ll1.setText(errorMessage.toString());
                return; // Exit the function if any field is empty
            }

         

            Departments department = new Departments(
                Integer.parseInt(Depid),Depname);

            int result = DataAccessLayer.updateDEP(department);

          if (result > 0) {
            showAlert("Success", "The data has been successfully updated.", null);
            refreshTableView();
        } else {
            showAlert("Error", "Data update failed", null);
        }

    } catch (NumberFormatException e) {
        showAlert("Error", "Invalid number format. Please enter valid numeric values.", null);
    } catch (SQLException ex) {
        showAlert("Error", "Data update Failed", ex.getMessage());
    }
    }
});
        
        //start of table view handling 
        ObservableList<Departments> depData = DataAccessLayer.getAllDepartments();
             tG.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Get the selected department from the TableView
                Departments selectedDepartment = (Departments) newValue;

                // Set the values to the text fields
                dep_ID_TF.setText(String.valueOf(selectedDepartment.getDep_id()));
                depNameTF.setText(selectedDepartment.getName());
            }
        });
             
C1.setCellValueFactory(new PropertyValueFactory<>("dep_id")); // Assuming your property names are "dep_id" and "dep_name"
C2.setCellValueFactory(new PropertyValueFactory<>("name")); // No change
tG.setItems(depData);


//start of styling
     borderPane.setStyle("-fx-background-color: linear-gradient(to bottom,#F8FAE5,#F8FAE5,#55837a ,#43766C);");      
     insertBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");

updateBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
deleteBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
coursesBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");

studentBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
gradesBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
departmentBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
label.setFont(new Font("System Italic", 45.0));
// professourBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");

dep_ID_TF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
depNameTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");

label.setTextFill(Color.web("#76453B"));
label0.setTextFill(Color.web("#76453B"));
label1.setTextFill(Color.web("#76453B"));
label2.setTextFill(Color.web("#76453B"));

vBox0.setStyle("-fx-background-color: linear-gradient(to bottom ,#F8FAE5,#F8FAE5,#F8FAE5,#F8FAE5,#55837a);");
vBox.setStyle("-fx-background-color: linear-gradient(to bottom, #F8FAE5, #F8FAE5);");
      
tG.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-inner-color: #F8FAE5; -fx-border-color: #76453B;");

// If you want to set the background, text color, and border color for individual columns
C1.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C2.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");



    }
}

