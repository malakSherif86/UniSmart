package caseneww;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class CoursesBASE extends AnchorPane {
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
    protected final HBox hBox5;
   
    protected final HBox hBox6;
    protected final AnchorPane gbaLabel;
    protected final Label label;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Button updateBTN;
    protected final Button insertBTN;
    protected final Button deleteBTN;
    protected final TextField courseIdTf;
    protected final Label label0;
    protected final Label label1;
    protected final TextField courseNameTF;
    protected final Label ll1;
    protected final Label label2;
    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane0;
    protected final TableView tG;
    protected final TableColumn C1;
    protected final TableColumn C2;
    protected final TableColumn C3;
    protected final TableColumn C4;
    protected final TableColumn C5;
    protected final TableColumn C6;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final TextField depIdTF;
    protected final TextField MaxTF;
    protected final Label label6;
    protected final TextField durationTF;
    protected final TextField descTF;

    public CoursesBASE() throws SQLException {

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
     //   button = new Button();
        hBox6 = new HBox();
        gbaLabel = new AnchorPane();
        label = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        updateBTN = new Button();
        insertBTN = new Button();
        deleteBTN = new Button();
        courseIdTf = new TextField();
        label0 = new Label();
        label1 = new Label();
        courseNameTF = new TextField();
        ll1 = new Label();
        label2 = new Label();
        scrollPane = new ScrollPane();
        anchorPane0 = new AnchorPane();
        tG = new TableView();
        C1 = new TableColumn();
        C2 = new TableColumn();
        C3 = new TableColumn();
        C4 = new TableColumn();
        C5 = new TableColumn();
        C6 = new TableColumn();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        depIdTF = new TextField();
        MaxTF = new TextField();
        label6 = new Label();
        durationTF = new TextField();
        descTF = new TextField();

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
        gbaLabel.setPrefWidth(599.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(-2.0);
        label.setLayoutY(29.0);
        label.setPrefHeight(99.0);
        label.setPrefWidth(307.0);
        label.setText("Courses");
        label.setFont(new Font("System Italic", 45.0));

        gridPane.setLayoutX(444.0);
        gridPane.setLayoutY(133.0);
        gridPane.setPrefHeight(240.0);
        gridPane.setPrefWidth(120.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(updateBTN, 4);
        updateBTN.setLayoutX(10.0);
        updateBTN.setLayoutY(10.0);
        updateBTN.setMnemonicParsing(false);
        updateBTN.setText("update");

        GridPane.setRowIndex(insertBTN, 3);
        insertBTN.setMnemonicParsing(false);
        insertBTN.setPrefHeight(31.0);
        insertBTN.setPrefWidth(67.0);
        insertBTN.setText("insert");

        GridPane.setRowIndex(deleteBTN, 2);
        deleteBTN.setMnemonicParsing(false);
        deleteBTN.setPrefHeight(31.0);
        deleteBTN.setPrefWidth(68.0);
        deleteBTN.setText("delete");

        courseIdTf.setLayoutX(162.0);
        courseIdTf.setLayoutY(138.0);
        courseIdTf.setPrefHeight(31.0);
        courseIdTf.setPrefWidth(206.0);

        label0.setLayoutX(26.0);
        label0.setLayoutY(143.0);
        label0.setText("Course ID");

        label1.setLayoutX(22.0);
        label1.setLayoutY(194.0);
        label1.setText("Course Name");

        courseNameTF.setLayoutX(161.0);
        courseNameTF.setLayoutY(189.0);
        courseNameTF.setPrefHeight(31.0);
        courseNameTF.setPrefWidth(208.0);

        ll1.setLayoutX(9.0);
        ll1.setLayoutY(415.0);
        ll1.setPrefHeight(21.0);
        ll1.setPrefWidth(603.0);

        label2.setLayoutX(177.0);
        label2.setLayoutY(493.0);
        label2.setPrefHeight(31.0);
        label2.setPrefWidth(303.0);

         scrollPane.setLayoutX(14.0);
        scrollPane.setLayoutY(462.0);
        scrollPane.setPrefHeight(286.0);
        scrollPane.setPrefWidth(579.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(287.0);
        anchorPane0.setPrefWidth(577.0);

        tG.setPrefHeight(296.0);
        tG.setPrefWidth(595.0);

        C1.setPrefWidth(76.0);
        C1.setText("course_id");

        C2.setPrefWidth(100.0);
        C2.setText("course_name");

        C3.setPrefWidth(115.0);
        C3.setText("Department ID");

        C4.setPrefWidth(87.0);
        C4.setText("max_grade");

        C5.setPrefWidth(68.0);
        C5.setText("duration");

        C6.setPrefWidth(126.0);
        C6.setText("discription");
        scrollPane.setContent(anchorPane0);

        label3.setLayoutX(22.0);
        label3.setLayoutY(242.0);
        label3.setText("Department");

        label4.setLayoutX(22.0);
        label4.setLayoutY(288.0);
        label4.setText("Max Grade");

        label5.setLayoutX(26.0);
        label5.setLayoutY(380.0);
        label5.setText("Description");

        depIdTF.setLayoutX(161.0);
        depIdTF.setLayoutY(237.0);
        depIdTF.setPrefHeight(31.0);
        depIdTF.setPrefWidth(208.0);

        MaxTF.setLayoutX(161.0);
        MaxTF.setLayoutY(283.0);
        MaxTF.setPrefHeight(31.0);
        MaxTF.setPrefWidth(208.0);

        label6.setLayoutX(24.0);
        label6.setLayoutY(332.0);
        label6.setPrefHeight(21.0);
        label6.setPrefWidth(68.0);
        label6.setText("Duration");

        durationTF.setLayoutX(161.0);
        durationTF.setLayoutY(327.0);
        durationTF.setPrefHeight(31.0);
        durationTF.setPrefWidth(208.0);

        descTF.setLayoutX(161.0);
        descTF.setLayoutY(375.0);
        descTF.setPrefHeight(31.0);
        descTF.setPrefWidth(208.0);
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
       
        vBox0.getChildren().add(hBox5);
        vBox0.getChildren().add(hBox6);
        vBox.getChildren().add(vBox0);
        anchorPane.getChildren().add(vBox);
        gbaLabel.getChildren().add(label);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getChildren().add(updateBTN);
        gridPane.getChildren().add(insertBTN);
        gridPane.getChildren().add(deleteBTN);
        gbaLabel.getChildren().add(gridPane);
        gbaLabel.getChildren().add(courseIdTf);
        gbaLabel.getChildren().add(label0);
        gbaLabel.getChildren().add(label1);
        gbaLabel.getChildren().add(courseNameTF);
        gbaLabel.getChildren().add(ll1);
        gbaLabel.getChildren().add(label2);
        tG.getColumns().add(C1);
        tG.getColumns().add(C2);
        tG.getColumns().add(C3);
        tG.getColumns().add(C4);
        tG.getColumns().add(C5);
        tG.getColumns().add(C6);
        anchorPane0.getChildren().add(tG);
        gbaLabel.getChildren().add(scrollPane);
        gbaLabel.getChildren().add(label3);
        gbaLabel.getChildren().add(label4);
        gbaLabel.getChildren().add(label5);
        gbaLabel.getChildren().add(depIdTF);
        gbaLabel.getChildren().add(MaxTF);
        gbaLabel.getChildren().add(label6);
        gbaLabel.getChildren().add(durationTF);
        gbaLabel.getChildren().add(descTF);
        getChildren().add(borderPane);
        
        
        //
        
        
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
  
        ObservableList<Courses> courseData = DataAccessLayer.getAllCourses();
        tG.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
    if (newValue != null) {
        // Get the selected course from the TableView
        Courses selectedCourse = (Courses) newValue;

        // Set the values to the text fields
        courseIdTf.setText(String.valueOf(selectedCourse.getCousreid()));
        courseNameTF.setText(selectedCourse.getCourse_name());
        depIdTF.setText(String.valueOf(selectedCourse.getDepartment_Id()));
        MaxTF.setText(String.valueOf(selectedCourse.getMaxGrade()));
            durationTF.setText(selectedCourse.getDuration());
       // durationTF.setText(String.valueOf(selectedCourse.getDuration()));
        descTF.setText(String.valueOf(selectedCourse.getDescription()));
    }
});
tG.setItems(courseData); 

// Set cell value factories for each column using PropertyValueFactory
C1.setCellValueFactory(new PropertyValueFactory<>("cousreid")); // Assuming your property name is "course_id"
C2.setCellValueFactory(new PropertyValueFactory<>("course_name")); // Assuming your property name is "course_name"
C3.setCellValueFactory(new PropertyValueFactory<>("department_Id")); // Assuming your property name is "department_Id"
C4.setCellValueFactory(new PropertyValueFactory<>("maxGrade")); // Assuming your property name is "max_grade"
C5.setCellValueFactory(new PropertyValueFactory<>("duration")); // Assuming your property name is "duration"
C6.setCellValueFactory(new PropertyValueFactory<>("description")); // Assuming your property name is "description"

// Assuming you have a method getAllCourses() that returns ObservableList<Courses> with appropriate data
insertBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            // Get input values
            String courseId = courseIdTf.getText();
            String courseName = courseNameTF.getText();
            String departmentId = depIdTF.getText();
            String maxGrade = MaxTF.getText();
            String duration = durationTF.getText();
            String description = descTF.getText();

            // Check if any of the required fields are empty
            if (courseId.isEmpty() || courseName.isEmpty() || departmentId.isEmpty() || maxGrade.isEmpty()) {
                showAlert("Error", "Please fill in all the required fields.", null);
                return; // Stop further execution if any field is empty
            }

            Courses course = new Courses(
                Integer.parseInt(courseId),
                courseName,
                duration,
                Integer.parseInt(maxGrade),
                Integer.parseInt(departmentId),
                description
            );

            // Insert the course
            int result = DataAccessLayer.insertCourse(course);

            // Check the result of the insertion
            if (result > 0) {
                showAlert("Success", "The data has been successfully inserted.", null);
                tG.setItems(DataAccessLayer.getAllCourses());
                // Clear input fields if needed
            } else {
                showAlert("Error", "Data Insertion Failed: Please check your input and try again.", null);
            }
        } catch (SQLException ex) {
            handleSQLException(ex);
        } catch (NumberFormatException ex) {
            showAlert("Error", "Please enter valid numeric values for 'Duration' and 'Max Grade'.", null);
        }
    }

    private void handleSQLException(SQLException ex) {
        if (ex.getMessage().contains("course_id_UNIQUE")) {
            showAlert("Error", "Duplicate value for course ID. This course ID already exists.", null);
        } else if (ex.getMessage().contains("fk_courses_departments")) {
            showAlert("Error", "Foreign key constraint violation. There is no such department ID.", null);
        } else if (ex.getMessage().contains("fk_courses_departments")) {
            showAlert("Error", "Foreign key constraint violation. There is no such department ID.", null);
        } else if (ex.getMessage().contains("departments_ibfk_1")) {
            showAlert("Error", "Foreign key constraint violation. There is no such department ID.", null);
        } else {
            showAlert("Error", "Data Insertion Failed: Please check your input and try again.", null);
        }
    }
});



        //end od insert 
 deleteBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        String courseId = courseIdTf.getText();

        // Check if courseId is empty
        if (courseId == null || courseId.isEmpty()) {
            showAlert("Error", "Course ID cannot be empty.", null);
            return;
        }

        try {
            int courseIdInt = Integer.parseInt(courseId);
            Courses courses = new Courses(courseIdInt);

            int result = DataAccessLayer.delete_courses(courses);

            if (result > 0) {
                showAlert("Success", "The data has been successfully deleted.", null);
                tG.setItems(DataAccessLayer.getAllCourses());
            } else {
                showAlert("Error", "No course with such ID.", null);
            }

        } catch (NumberFormatException e) {
            showAlert("Error", "Invalid number format for Course ID. Please enter a valid numeric value.", null);
        } catch (SQLException ex) {
            showAlert("Error", "There are students registered in that course. Deletion failed.", ex.getMessage());
        } finally {
            // Consume the event to prevent further propagation
            event.consume();
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
 
//end od delete

updateBTN.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            // Get input values
            String courseId = courseIdTf.getText().trim();
            String courseName = courseNameTF.getText().trim();
            String departmentId = depIdTF.getText().trim();
            String maxGrade = MaxTF.getText().trim();
            String duration = durationTF.getText().trim();
            String description = descTF.getText().trim();
            
            if (courseId.isEmpty()) {
                 showAlert("Error", "please enter  Course ID.", null);
                return;
            }

            // Create a map to hold the columns and their values to be updated
            Map<String, Object> updates = new HashMap<>();

            // Conditionally add each field to the updates map
            if (!courseName.isEmpty()) {
                updates.put("COURSE_NAME", courseName);
            }

            if (!duration.isEmpty()) {
                updates.put("DURATION", duration);
            }

            if (!maxGrade.isEmpty()) {
                updates.put("MAX_GRADE", Integer.parseInt(maxGrade));
            }

            if (!departmentId.isEmpty()) {
                updates.put("DEPARTMENT_ID", Integer.parseInt(departmentId));
            }

            if (!description.isEmpty()) {
                updates.put("DESCRIPTION", description);
            }

            // Update the course data
            int result = DataAccessLayer.updateCourse(Integer.parseInt(courseId), updates);

            if (result > 0) {
                 showAlert("success", "The data has been successfully updated.", null);

                tG.setItems(DataAccessLayer.getAllCourses());
            } else {
  showAlert("Error", "Invalid  Course ID.", null);
            }
        } catch (SQLException ex) {
           //Logger.getLogger(CoursesBASE.class.getName()).log(Level.SEVERE, null, ex);
             showAlert("Error", " Please check your input and try again.", null);

        }
    }
});

 
 
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

courseIdTf.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");


courseNameTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
depIdTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
MaxTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
durationTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
descTF.setStyle("-fx-font-family: 'Georgia'; -fx-background-radius: 12; -fx-text-fill: #76453B;");
label.setTextFill(Color.web("#76453B"));
label0.setTextFill(Color.web("#76453B"));
label1.setTextFill(Color.web("#76453B"));
label2.setTextFill(Color.web("#76453B"));
label3.setTextFill(Color.web("#76453B"));
label4.setTextFill(Color.web("#76453B"));
label5.setTextFill(Color.web("#76453B"));
vBox0.setStyle("-fx-background-color: linear-gradient(to bottom ,#F8FAE5,#F8FAE5,#F8FAE5,#F8FAE5,#55837a);");
vBox.setStyle("-fx-background-color: linear-gradient(to bottom, #F8FAE5, #F8FAE5);");
      
tG.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-inner-color: #F8FAE5; -fx-border-color: #76453B;");

// If you want to set the background, text color, and border color for individual columns
C1.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C2.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C3.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C4.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C5.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
C6.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");

    }}

