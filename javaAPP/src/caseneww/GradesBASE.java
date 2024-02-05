package caseneww;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableCell;
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

public class GradesBASE extends AnchorPane {

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
   // protected final Button professourBTN;
    protected final HBox hBox5;
 //   protected final Button button;
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
    protected final TextField student_ID_TF;
    protected final Label label0;
    protected final Label label1;
    protected final TextField courseIdTF;
    protected final Label ll1;
    protected final Label label2;
    protected final Button reportbtn;
    protected final Button reportbtn11;
    protected final TextField ScoreTF;
    protected final DatePicker eDateTF;
    protected final Label label3;
    protected final Label label4;
    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane0;
    protected final TableView tG;
    protected final TableColumn C1;
    protected final TableColumn C2;
    protected final TableColumn C3;
    protected final TableColumn C4;
    private void showAlert(String title, String content, String details) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        if (details != null) {
            alert.getDialogPane().setExpandableContent(new javafx.scene.control.TextArea(details));
        }
        alert.showAndWait();
    }

    public GradesBASE() throws SQLException {

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
      
        hBox5 = new HBox();
//        button = new Button();
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
        student_ID_TF = new TextField();
        label0 = new Label();
        label1 = new Label();
        courseIdTF = new TextField();
        ll1 = new Label();
        label2 = new Label();
        reportbtn = new Button();
        reportbtn11 = new Button();
        ScoreTF = new TextField();
        eDateTF = new DatePicker();
        label3 = new Label();
        label4 = new Label();
        scrollPane = new ScrollPane();
        anchorPane0 = new AnchorPane();
        tG = new TableView();
        C1 = new TableColumn();
        C2 = new TableColumn();
        C3 = new TableColumn();
        C4 = new TableColumn();

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
        gbaLabel.setPrefWidth(635.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(-2.0);
        label.setLayoutY(29.0);
        label.setPrefHeight(99.0);
        label.setPrefWidth(307.0);
        label.setText("grades");
        label.setFont(new Font("System Italic", 45.0));

        gridPane.setLayoutX(127.0);
        gridPane.setLayoutY(360.0);

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

        student_ID_TF.setLayoutX(141.0);
        student_ID_TF.setLayoutY(158.0);
        student_ID_TF.setPrefHeight(31.0);
        student_ID_TF.setPrefWidth(206.0);

        label0.setLayoutX(26.0);
        label0.setLayoutY(158.0);
        label0.setText("Student_ID");

        label1.setLayoutX(30.0);
        label1.setLayoutY(220.0);
        label1.setText("course_ID");

        courseIdTF.setLayoutX(141.0);
        courseIdTF.setLayoutY(215.0);
        courseIdTF.setPrefHeight(31.0);
        courseIdTF.setPrefWidth(208.0);

        ll1.setLayoutX(32.0);
        ll1.setLayoutY(398.0);
        ll1.setPrefHeight(44.0);
        ll1.setPrefWidth(566.0);

        label2.setLayoutX(177.0);
        label2.setLayoutY(493.0);
        label2.setPrefHeight(31.0);
        label2.setPrefWidth(303.0);

        reportbtn.setLayoutX(392.0);
        reportbtn.setLayoutY(158.0);
        reportbtn.setMnemonicParsing(false);
        reportbtn.setPrefHeight(31.0);
        reportbtn.setPrefWidth(141.0);
        reportbtn.setText("Student Report");

        reportbtn11.setLayoutX(391.0);
        reportbtn11.setLayoutY(215.0);
        reportbtn11.setMnemonicParsing(false);
        reportbtn11.setPrefHeight(31.0);
        reportbtn11.setPrefWidth(143.0);
        reportbtn11.setText("Course Report");

        ScoreTF.setLayoutX(141.0);
        ScoreTF.setLayoutY(311.0);
        ScoreTF.setPrefHeight(31.0);
        ScoreTF.setPrefWidth(208.0);

        eDateTF.setLayoutX(141.0);
        eDateTF.setLayoutY(264.0);
        eDateTF.setPrefHeight(31.0);
        eDateTF.setPrefWidth(210.0);

        label3.setLayoutX(34.0);
        label3.setLayoutY(269.0);
        label3.setText("Enroll date");

        label4.setLayoutX(34.0);
        label4.setLayoutY(316.0);
        label4.setText("Student Score");

        scrollPane.setLayoutX(14.0);
        scrollPane.setLayoutY(462.0);
        scrollPane.setPrefHeight(286.0);
        scrollPane.setPrefWidth(579.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(287.0);
        anchorPane0.setPrefWidth(577.0);

        tG.setPrefHeight(286.0);
        tG.setPrefWidth(590.0);

        C1.setPrefWidth(114.0);
        C1.setText("Course ID");

        C2.setPrefWidth(124.0);
        C2.setText("Student ID");

        C3.setPrefWidth(143.0);
        C3.setText("Student Grade");

        C4.setPrefWidth(177.0);
        C4.setText("Enroll Date");
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
      
        vBox0.getChildren().add(hBox4);
//        hBox5.getChildren().add(button);
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
        gbaLabel.getChildren().add(student_ID_TF);
        gbaLabel.getChildren().add(label0);
        gbaLabel.getChildren().add(label1);
        gbaLabel.getChildren().add(courseIdTF);
        gbaLabel.getChildren().add(ll1);
        gbaLabel.getChildren().add(label2);
        gbaLabel.getChildren().add(reportbtn);
        gbaLabel.getChildren().add(reportbtn11);
        gbaLabel.getChildren().add(ScoreTF);
        gbaLabel.getChildren().add(eDateTF);
        gbaLabel.getChildren().add(label3);
        gbaLabel.getChildren().add(label4);
        tG.getColumns().add(C1);
        tG.getColumns().add(C2);
        tG.getColumns().add(C3);
        tG.getColumns().add(C4);
        anchorPane0.getChildren().add(tG);
        gbaLabel.getChildren().add(scrollPane);
        getChildren().add(borderPane);

        
        
          try {
            DataAccessLayer.connect();
        } catch (SQLException ex) {
    
                         System.out.println("Welcome1"); 

        }
         
          
          
          reportbtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        // Validate if the text in the TextField is not empty when the button is clicked
        String stu_id = student_ID_TF.getText().trim(); // Trim any leading or trailing whitespaces
        if (!stu_id.isEmpty()) {
            try {
                int studentId = Integer.parseInt(stu_id);

                // Create a new scene with couselistBase and switch to it
                Parent root = new couselistBase(studentId);
                Scene scene = new Scene(root);
                Stage stage = new Stage();  // Create a new stage
                stage.setScene(scene);
                stage.show();
            } catch (NumberFormatException e) {
              //  System.out.println("Invalid input for Student ID: " + stu_id);
                ll1.setText("Invalid input for Student ID: " + stu_id);
                  showAlert("Error", "Invalid input for Student ID", null);
            }
        } else {
      //      System.out.println("Student ID is empty");
             
               showAlert("Error", "Student ID is empty", null);
            //    ll1.setText("One or more fields are empty. Please fill in all the fields.");
        }
    }
});

        
        reportbtn11.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        // Validate if the text in the TextField is not empty when the button is clicked
        String cur_id = courseIdTF.getText().trim(); // Trim any leading or trailing whitespaces
        if (!cur_id.isEmpty()) {
            try {
                int cousreid = Integer.parseInt(cur_id);

                // Create a new scene with couselistBase and switch to it
                Parent root = new CouselistBase2(cousreid);
                Scene scene = new Scene(root);
                Stage stage = new Stage();  // Create a new stage
                stage.setScene(scene);
                stage.show();
            } catch (NumberFormatException e) {
        
                 ll1.setText("Invalid input for Student ID: " + cur_id);
                  showAlert("Error", "Invalid input for Course ID", null);
            }
        } else {
          //  System.out.println("COURSE ID is empty");
              showAlert("Error", "COURSE ID is empty", null);
        }
    }
});
        
           
                    departmentBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    // Create a new scene with couselistBase and switch to it
                    Parent root = new DepartmentBASE();
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
  
                       
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
        
         
//end of reports***********************************************************************************************************

insertBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentid = student_ID_TF.getText();
            String courseid = courseIdTF.getText();
            String score = ScoreTF.getText();
            LocalDate enrolldate = eDateTF.getValue();

            if (studentid != null && !studentid.isEmpty() &&
                courseid != null && !courseid.isEmpty() &&
                enrolldate != null) {

                Date sqlEnrollDate = Date.valueOf(enrolldate);

                if (score != null && !score.isEmpty()) {
                    // Insert with score funacation
                    Grades grades = new Grades(
                        Integer.parseInt(courseid),
                        Integer.parseInt(studentid),
                        Integer.parseInt(score),
                        sqlEnrollDate
                    );
                    int result = DataAccessLayer.insertG(grades);

                    if (result > 0) {
                        showAlert("Success", "The data has been successfully inseerted.", null);
                      
ObservableList<Grades> updatedGradesData = DataAccessLayer.getAllGrades();
tG.setItems(updatedGradesData);

                    } else {
                      
                        showAlert("Error", "Invalid number format. Data Insertion Failed: Please check your input and try again..", null);
                    }
                } else { //end of insert score
                    
                    // Insert without score
                    Grades gradesWithoutScore = new Grades(
                        Integer.parseInt(courseid),
                        Integer.parseInt(studentid),
                        sqlEnrollDate
                    );
                    int result = DataAccessLayer.insertGWithoutScore(gradesWithoutScore);

                    if (result > 0) {
                    //    ll1.setText("The data has been successfully inserted without a score.");
                         showAlert("warning", "The data has been successfully inserted without a score.", null);
                        
                    } else {
                         showAlert("Error", "Data insertion failed", null);
                      //  ll1.setText("Data Insertion Failed: Please check your input and try again.");
                    }
                }
            } else {
                  showAlert("Error", "Data insertion failed", null);
                ll1.setText("One or more fields are empty. Please fill in all the fields.");
            }

        } catch (NumberFormatException e) {
             showAlert("Error", "Invalid number format. Please enter valid numeric values.", null);
        } catch (SQLException ex) {
        
             showAlert("Error", "Data Insertion Failed, you can't insert dublicate pk", ex.getMessage());
        }
    }
});
//end of insert 
//start of delete 

  
  deleteBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentid = student_ID_TF.getText();
            String courseid = courseIdTF.getText();
           
            LocalDate enrolldate = eDateTF.getValue();

            StringBuilder errorMessage = new StringBuilder("One or more fields are empty: ");

            boolean hasEmptyField = false;

            if (studentid == null || studentid.isEmpty()) {
                errorMessage.append("Student ID, ");
                hasEmptyField = true;
            }

            if (courseid == null || courseid.isEmpty()) {
                errorMessage.append("Course ID, ");
                hasEmptyField = true;
            }


            if (enrolldate == null) {
                errorMessage.append("Enroll Date, ");
                hasEmptyField = true;
            }

            if (hasEmptyField) {
                // Remove the trailing comma and space
                errorMessage.delete(errorMessage.length() - 2, errorMessage.length());
                ll1.setText(errorMessage.toString());
                  showAlert("Error", "fill all the required fileds .", null);
                return; // Exit the function if any field is empty
            }

            Date sqlEnrollDate = Date.valueOf(enrolldate);

            Grades grades = new Grades(
                Integer.parseInt(courseid),
                Integer.parseInt(studentid),
               
                sqlEnrollDate
            );

            int result = DataAccessLayer.deleteGrade(grades);

            if (result > 0) {
            
ObservableList<Grades> updatedGradesData = DataAccessLayer.getAllGrades();
tG.setItems(updatedGradesData);

            showAlert("Success", "The data has been successfully deleted.", null);
           
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

//end of delete 

//start of update funcation 
updateBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentid = student_ID_TF.getText();
            String courseid = courseIdTF.getText();
            String score = ScoreTF.getText();
            LocalDate enrolldate = eDateTF.getValue();

            StringBuilder errorMessage = new StringBuilder("One or more fields are empty: ");

            boolean hasEmptyField = false;

            if (studentid == null || studentid.isEmpty()) {
                errorMessage.append("Student ID, ");
                hasEmptyField = true;
            }

            if (courseid == null || courseid.isEmpty()) {
                errorMessage.append("Course ID, ");
                hasEmptyField = true;
            }

            if (score == null || score.isEmpty()) {
                errorMessage.append("Score, ");
                hasEmptyField = true;
            }

            if (enrolldate == null) {
                errorMessage.append("Enroll Date, ");
                hasEmptyField = true;
            }

            if (hasEmptyField) {
                // Remove the trailing comma and space
                errorMessage.delete(errorMessage.length() - 2, errorMessage.length());
                ll1.setText(errorMessage.toString());
                  showAlert("Success", "The data has been successfully deleted.", null);
                return; // Exit the function if any field is empty
            }

            Date sqlEnrollDate = Date.valueOf(enrolldate);

            Grades grades = new Grades(
                Integer.parseInt(courseid),
                Integer.parseInt(studentid),
                Integer.parseInt(score),
                sqlEnrollDate
            );

            int result = DataAccessLayer.updateScoredGrade(grades);

            if (result > 0) {
                // Add this code at the end of the insertBTN, deleteBTN, and updateBTN event handlers

// Refresh the TableView with the latest data
ObservableList<Grades> updatedGradesData = DataAccessLayer.getAllGrades();
tG.setItems(updatedGradesData);
 showAlert("Success", "The data has been successfully updated.", null);
              //  ll1.setText("The data has been successfully updated.");
            } else {
                 showAlert("error", "grade update Failed: Please check your input and try again..", null);
            //    ll1.setText("grade update Failed: Please check your input and try again.");
            }

        } catch (NumberFormatException e) {
             showAlert("error", "Invalid number format. Please enter valid numeric values.", null);
           
        } catch (SQLException ex) {
          
           showAlert("error", "student grade excedes the max grade.", null);
        }
    }
});




// Add this method in your GradesBASE class

ObservableList<Grades> gradesData = DataAccessLayer.getAllGrades();
 tG.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Get the selected grade from the TableView
                Grades selectedGrade = (Grades) newValue;

                // Set the values to the text fields
                courseIdTF.setText(String.valueOf(selectedGrade.getCourseId()));
                student_ID_TF.setText(String.valueOf(selectedGrade.getStudentId()));
                ScoreTF.setText(String.valueOf(selectedGrade.getStudentScoredGrade()));
                eDateTF.setValue(selectedGrade.getGrade().toLocalDate());
            }
        });

C1.setCellValueFactory(new PropertyValueFactory<>("courseId"));
C2.setCellValueFactory(new PropertyValueFactory<>("studentId"));
C3.setCellValueFactory(new PropertyValueFactory<>("studentScoredGrade"));
// C4.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFormattedEnrollDate()));
C4.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Grades, Date>, ObservableValue<Date>>() {
    @Override
    public ObservableValue<Date> call(TableColumn.CellDataFeatures<Grades, Date> param) {
        return new SimpleObjectProperty<Date>(param.getValue().getGrade());
    }
});

tG.setItems(gradesData);

//start of styling
     borderPane.setStyle("-fx-background-color: linear-gradient(to bottom,#F8FAE5,#F8FAE5,#55837a ,#43766C);");      
     insertBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");

        
        reportbtn11.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
reportbtn.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");

updateBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
deleteBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
coursesBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");

studentBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
gradesBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
departmentBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
label.setFont(new Font("System Italic", 45.0));

student_ID_TF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
courseIdTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
ScoreTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
//eDateTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");

label.setTextFill(Color.web("#76453B"));
label0.setTextFill(Color.web("#76453B"));
label1.setTextFill(Color.web("#76453B"));
label2.setTextFill(Color.web("#76453B"));
label3.setTextFill(Color.web("#76453B"));
label4.setTextFill(Color.web("#76453B"));

vBox0.setStyle("-fx-background-color: linear-gradient(to bottom ,#F8FAE5,#F8FAE5,#F8FAE5,#F8FAE5,#55837a);");
vBox.setStyle("-fx-background-color: linear-gradient(to bottom, #F8FAE5, #F8FAE5);");
      
tG.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-inner-color: #F8FAE5; -fx-border-color: #76453B;");

// If you want to set the background, text color, and border color for individual columns
C1.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C2.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C3.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C4.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");

 


    }
}
