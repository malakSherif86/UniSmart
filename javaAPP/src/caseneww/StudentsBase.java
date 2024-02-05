package caseneww;

import java.awt.MultipleGradientPaint.CycleMethod;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StudentsBase extends AnchorPane {
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
 
 
// Helper method to check if a string is numeric
private boolean isNumeric(String str) {
    return str.matches("\\d+");
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
 //   protected final Button professourBTN;
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
    protected final Button selectBTN;
   // protected final Button button0;
    protected final TextField student_lnameTF;
    protected final TextField student_fnameTF;
    protected final TextField emailTF;
    protected final TextField student_ID_TF;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final TextField stuDepITF;
    protected final Label ll1;
    protected final Label label5;

    public StudentsBase() {
Stop[] stops = new Stop[] {
    new Stop(0, Color.DARKSLATEGRAY),
    new Stop(1, Color.BLACK)
};



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
 //       professourBTN = new Button();
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
        selectBTN = new Button();
//        button0 = new Button();
        student_lnameTF = new TextField();
        student_fnameTF = new TextField();
        emailTF = new TextField();
        student_ID_TF = new TextField();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        stuDepITF = new TextField();
        ll1 = new Label();
        label5 = new Label();

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

        

        hBox1.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox1.setLayoutX(10.0);
        hBox1.setLayoutY(10.0);
        hBox1.setPrefHeight(60.0);
        hBox1.setPrefWidth(200.0);
  hBox3.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox3.setLayoutX(10.0);
        hBox3.setLayoutY(229.0);
        hBox3.setPrefHeight(60.0);
        hBox3.setPrefWidth(200.0);
        
        hBox2.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox2.setLayoutX(10.0);
        hBox2.setLayoutY(156.0);
        hBox2.setPrefHeight(60.0);
        hBox2.setPrefWidth(200.0);
        

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
        label.setText("STUDENTS");
        label.setFont(new Font("System Italic", 45.0));

        gridPane.setLayoutX(14.0);
        gridPane.setLayoutY(399.0);

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

        GridPane.setColumnIndex(selectBTN, 3);
        selectBTN.setLayoutX(10.0);
        selectBTN.setLayoutY(10.0);
        selectBTN.setMnemonicParsing(false);
        selectBTN.setText("select");

       /* GridPane.setColumnIndex(button0, 4);
        button0.setMnemonicParsing(false);
        button0.setText("report");*/

        student_lnameTF.setLayoutX(141.0);
        student_lnameTF.setLayoutY(245.0);

        student_fnameTF.setLayoutX(141.0);
        student_fnameTF.setLayoutY(202.0);

        emailTF.setLayoutX(141.0);
        emailTF.setLayoutY(287.0);

        student_ID_TF.setLayoutX(141.0);
        student_ID_TF.setLayoutY(158.0);

        label0.setLayoutX(26.0);
        label0.setLayoutY(158.0);
        label0.setText("Student_ID");

        label1.setLayoutX(12.0);
        label1.setLayoutY(207.0);
        label1.setText("student_Fname");

        label2.setLayoutX(12.0);
        label2.setLayoutY(250.0);
        label2.setText("student_Lname");

        label3.setLayoutX(42.0);
        label3.setLayoutY(302.0);
        label3.setText("EMAIL");

        label4.setLayoutX(13.0);
        label4.setLayoutY(354.0);
        label4.setText("Department_ID");

        stuDepITF.setLayoutX(141.0);
        stuDepITF.setLayoutY(349.0);
        stuDepITF.setPromptText("put 0 if you dont want to update the department id");
        stuDepITF.setText("0");

        ll1.setLayoutX(26.0);
        ll1.setLayoutY(440.0);
        ll1.setPrefHeight(31.0);
        ll1.setPrefWidth(348.0);

        label5.setLayoutX(177.0);
        label5.setLayoutY(493.0);
        label5.setPrefHeight(31.0);
        label5.setPrefWidth(303.0);
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
        gridPane.getChildren().add(selectBTN);
//        gridPane.getChildren().add(button0);
        gbaLabel.getChildren().add(gridPane);
        gbaLabel.getChildren().add(student_lnameTF);
        gbaLabel.getChildren().add(student_fnameTF);
        gbaLabel.getChildren().add(emailTF);
        gbaLabel.getChildren().add(student_ID_TF);
        gbaLabel.getChildren().add(label0);
        gbaLabel.getChildren().add(label1);
        gbaLabel.getChildren().add(label2);
        gbaLabel.getChildren().add(label3);
        gbaLabel.getChildren().add(label4);
        gbaLabel.getChildren().add(stuDepITF);
        gbaLabel.getChildren().add(ll1);
        gbaLabel.getChildren().add(label5);
        
     //   button area
     studentBTN.setMnemonicParsing(false);
        studentBTN.setPrefHeight(31.0);
        studentBTN.setPrefWidth(133.0);
       
        studentBTN.setText("students");
        studentBTN.setFont(new Font("System Bold", 16.0));
        
        coursesBTN.setMnemonicParsing(false);
        coursesBTN.setPrefHeight(31.0);
        coursesBTN.setPrefWidth(133.0);
      
        coursesBTN.setText("courses");
        coursesBTN.setFont(new Font("System Bold", 16.0));

        departmentBTN.setMnemonicParsing(false);
        departmentBTN.setPrefHeight(31.0);
        departmentBTN.setPrefWidth(133.0);
       
        departmentBTN.setText("departments");
        departmentBTN.setFont(new Font("System Bold", 16.0));

      

        gradesBTN.setMnemonicParsing(false);
        gradesBTN.setPrefHeight(31.0);
        gradesBTN.setPrefWidth(133.0);
       
        gradesBTN.setText("grades");
        gradesBTN.setFont(new Font("System Bold", 16.0));

        /* professourBTN.setMnemonicParsing(false);
        professourBTN.setPrefHeight(31.0);
        professourBTN.setPrefWidth(133.0);
       
        professourBTN.setText("Home");
        professourBTN.setFont(new Font("System Bold", 16.0));*/
      
//#e8be30,#b7f0df,#7dd2bd,#f2707a,f23a56,f2c2a9

     
    
        getChildren().add(borderPane);  
          Parent root;
     Stage stage;
     Scene scene;
        
          try {
            DataAccessLayer.connect();
        } catch (SQLException ex) {
       //     Logger.getLogger(StudentsBase.class.getName()).log(Level.SEVERE, null, ex);
                         System.out.println("Welcome1"); 

        }
          
          
          
          
                  
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
  
//start of the update 
 updateBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        String studentId = student_ID_TF.getText();

        // Check if studentId is empty
        if (studentId.trim().isEmpty()) {
            showAlert("Error", "Please enter a student ID.", null);
            return;
        }

        // Check if studentId is a numeric value
        if (!isNumeric(studentId)) {
            showAlert("Error", "Please enter a numeric value for student ID.", null);
            return;
        }

        String firstName = student_fnameTF.getText();
        String lastName = student_lnameTF.getText();
        String email = emailTF.getText();

        // Check if department ID is empty or not provided
        if (stuDepITF.getText() == null || stuDepITF.getText().trim().isEmpty()) {
            showAlert("Error", "Please enter a department ID.", null);
            return;
        }

        try {
            int departmentId = Integer.parseInt(stuDepITF.getText());

            Student updatedStudent = new Student(Integer.parseInt(studentId), firstName, lastName, email, departmentId);
            int result = DataAccessLayer.update_student(updatedStudent);

            if (result > 0) {
              //  ll1.setText("The data has been successfully updated.");
                   showAlert("sucess", "The data has been successfully updated..", null);
            } else {
             //   ll1.setText("Update failed: No student with such ID.");
                   showAlert("Error", "Please enter a student ID.", null);
            }
        } catch (NumberFormatException | SQLException ex) {
         
            showAlert("Error", "Please check your input and try again.", null);
       
        } finally {
            // Consume the event to prevent further propagation
            event.consume();
        }
    }
});


       
//end of the update 
// end offf om l btoon n                   
                
insertBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentId = student_ID_TF.getText();
            String firstName = student_fnameTF.getText();
            String lastName = student_lnameTF.getText();
            String email = emailTF.getText();
            String departmentId = stuDepITF.getText();

            // Check if required fields are empty
            StringBuilder errorMessage = new StringBuilder("Please fill in the following fields:\n");
            boolean hasEmptyField = false;

            if (studentId.isEmpty()) {
                errorMessage.append("- Student ID\n");
                hasEmptyField = true;
            }

            if (firstName.isEmpty()) {
                errorMessage.append("- First Name\n");
                hasEmptyField = true;
            }

            if (lastName.isEmpty()) {
                errorMessage.append("- Last Name\n");
                hasEmptyField = true;
            }

            if (departmentId.isEmpty() || departmentId.equals("0")) {
                errorMessage.append("- Department ID\n");
                hasEmptyField = true;
            }

            if (hasEmptyField) {
                showAlert("Error", errorMessage.toString(), null);
                return; // Stop further processing if there are empty fields
            }

            Student student = new Student(Integer.parseInt(studentId), firstName, lastName, email, Integer.parseInt(departmentId));
            int result = DataAccessLayer.insert(student);

            if (result > 0) {
                showAlert("Success", "The data has been successfully inserted", null);
            } else {
                showAlert("Error", "Data insertion failed", null);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentsBase.class.getName()).log(Level.SEVERE, null, ex);
            showAlert("Error", "Data insertion failed", null);
        }
    }
});

//enf=d of insert
deleteBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        String studentId = student_ID_TF.getText();

        // Check if studentId is empty
        if (studentId.trim().isEmpty()) {
            showAlert("Error", "Please enter a student ID.", null);
            return;
        }

        // Check if studentId is a numeric value
        if (!isNumeric(studentId)) {
            showAlert("Error", "Please enter a numeric value for student ID.", null);
            return;
        }

        int studentIdInt = Integer.parseInt(studentId);
        Student student = new Student(studentIdInt);

        try {
       

            int result = DataAccessLayer.delete_student(student);

            if (result > 0) {
                showAlert("Success", "The data has been successfully deleted", null);
            } else {
                showAlert("Error", "No student with such ID.", null);
            }

        } catch (SQLException ex) {
            showAlert("Error", "The student is registered in courses.", null);
        } finally {
            // Consume the event to prevent further propagation
            event.consume();
        }
    }
});

                     
           selectBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        String studentId = student_ID_TF.getText();

        // Check if studentId is empty
        if (studentId.trim().isEmpty()) {
            showAlert("Error", "Please enter a student ID.", null);
            return;
        }

        // Check if studentId is a numeric value
        if (!isNumeric(studentId)) {
            showAlert("Error", "Please enter a numeric value for student ID.", null);
            return;
        }

        int studentIdInt = Integer.parseInt(studentId);

        try {
            Student student = DataAccessLayer.select_student(studentIdInt);

            if (student != null) {
                student_fnameTF.setText(student.getFirstName());
                student_lnameTF.setText(student.getLastName());
                emailTF.setText(student.getEmail());
                stuDepITF.setText(String.valueOf(student.getDepartmentId()));
                // Handle date conversion if needed

                showAlert("Success", "Student data loaded successfully", null);
            } else {
                showAlert("Error", "No student with such ID", null);
            }

        } catch (SQLException ex) {
            showAlert("Error", "Data selection failed", null);
        } finally {
            // Consume the event to prevent further propagation
            event.consume();
        }
    }
});


          
             
             //start of styling
     borderPane.setStyle("-fx-background-color: linear-gradient(to bottom,#F8FAE5,#F8FAE5,#55837a ,#43766C);");      
     insertBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
selectBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
updateBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
deleteBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #284640, #76453B); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
coursesBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
 //professourBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
studentBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
gradesBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
departmentBTN.setStyle("-fx-background-color: linear-gradient(to bottom, #76453B, #43766c); -fx-font-family: 'Georgia'; -fx-background-radius: 22; -fx-text-fill: #F8FAE5;");
label.setFont(new Font("System Italic", 45.0));

student_ID_TF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
student_lnameTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
student_fnameTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
stuDepITF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
emailTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");

stuDepITF.setText("0");
label.setTextFill(Color.web("#76453B"));
label0.setTextFill(Color.web("#76453B"));
label1.setTextFill(Color.web("#76453B"));
label2.setTextFill(Color.web("#76453B"));
label3.setTextFill(Color.web("#76453B"));
label4.setTextFill(Color.web("#76453B"));
label5.setTextFill(Color.web("#76453B"));
vBox0.setStyle("-fx-background-color: linear-gradient(to bottom ,#F8FAE5,#F8FAE5,#F8FAE5,#F8FAE5,#55837a);");
vBox.setStyle("-fx-background-color: linear-gradient(to bottom, #F8FAE5, #F8FAE5);");
      
        
    
       
             

    }
}
