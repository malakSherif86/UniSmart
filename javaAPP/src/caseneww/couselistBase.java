package caseneww;

import java.sql.SQLException;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class couselistBase extends AnchorPane {
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
    protected final AnchorPane ClearAllNBTN;
    protected final ScrollPane itemScrollPane;
    protected final AnchorPane anchorPane0;
    protected final TableView t1;
    protected final TableColumn c1;
    protected final TableColumn c3;
    protected final Label label;
    protected final Label gbaL;
   private  int studentId;
    public couselistBase(int studentId) {
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        ClearAllNBTN = new AnchorPane();
        itemScrollPane = new ScrollPane();
        anchorPane0 = new AnchorPane();
        t1 = new TableView();
        c1 = new TableColumn();
        c3 = new TableColumn();
        label = new Label();
        gbaL = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(604.0);
        setPrefWidth(578.0);

        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane, 0.0);
        AnchorPane.setTopAnchor(borderPane, 0.0);
        borderPane.setPrefHeight(604.0);
        borderPane.setPrefWidth(578.0);
        borderPane.setStyle("-fx-background-color: #fffafa;");

        BorderPane.setMargin(anchorPane, new Insets(0.0));
        borderPane.setLeft(anchorPane);

        BorderPane.setAlignment(ClearAllNBTN, javafx.geometry.Pos.CENTER);
        ClearAllNBTN.setPrefHeight(604.0);
        ClearAllNBTN.setPrefWidth(578.0);

        itemScrollPane.setLayoutY(167.0);
        itemScrollPane.setPrefHeight(431.0);
        itemScrollPane.setPrefWidth(548.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(427.0);
        anchorPane0.setPrefWidth(550.0);

        t1.setPrefHeight(539.0);
        t1.setPrefWidth(580.0);

        c1.setPrefWidth(276.0);
        c1.setText("couse name ");

        c3.setPrefWidth(350.0);
        c3.setText("grade ");
        itemScrollPane.setContent(anchorPane0);

        label.setLayoutX(14.0);
        label.setLayoutY(46.0);
        label.setPrefHeight(67.0);
        label.setPrefWidth(268.0);
        label.setText("Student GBA:");

        
        label.setFont(new Font("System Italic", 25.0));
        gbaL.setFont(new Font("System Italic", 20.0));
        
        gbaL.setLayoutX(170.0);
        gbaL.setLayoutY(53.0);
        gbaL.setPrefHeight(57.0);
        gbaL.setPrefWidth(239.0);
        borderPane.setTop(ClearAllNBTN);

        t1.getColumns().add(c1);
        t1.getColumns().add(c3);
        anchorPane0.getChildren().add(t1);
        ClearAllNBTN.getChildren().add(itemScrollPane);
        ClearAllNBTN.getChildren().add(label);
        ClearAllNBTN.getChildren().add(gbaL);
        getChildren().add(borderPane);
        
       
     
    
        
          double gpa = DataAccessLayer.callCaseGBAFunction(studentId);
     gbaL.setText( String.valueOf(gpa));
        
       
          

       // Set cell value factories for each column
       // c1.setCellValueFactory(new PropertyValueFactory<>("courseId"));
        c1.setCellValueFactory(new PropertyValueFactory<>("course_name"));
        c3.setCellValueFactory(new PropertyValueFactory<>("studentScoredGrade"));

        try {
            DataAccessLayer.connect();

            // Assuming you have an instance of DataAccessLayer named "dataAccessLayer"
            ArrayList<Grades> gradesList = DataAccessLayer.getGrades(studentId);
                System.out.println(gradesList);
                System.out.println(1);
            // ClegradesListar existing items before adding new ones
            t1.getItems().clear();

            // Add data to the TableView
            t1.getItems().addAll(gradesList);
        } catch (SQLException ex) {
             
             showAlert("Error", "connection failed", ex.getMessage());
        }
       
        
        //start of styling
     borderPane.setStyle("-fx-background-color: linear-gradient(to bottom,#43766C,#F8FAE5,#F8FAE5,#55837a ,#43766C, #76453B,#76453B);");      
     
//label.setFont(new Font("System Italic", 45.0));


label.setTextFill(Color.web("#76453B"));



      
t1.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-inner-color: #F8FAE5; -fx-border-color: #76453B;");

// If you want to set the background, text color, and border color for individual columns
c1.setStyle("-fx-control-inner-background: #F8FAE5; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
c3.setStyle("-fx-control-inner-background: #AFC8AD; -fx-text-fill: #A94438; -fx-border-color: #76453B;");
        
   
        
        
    }
}
