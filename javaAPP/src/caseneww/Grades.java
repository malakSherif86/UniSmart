/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseneww;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author hp
 */
public class Grades {
    

    private int courseId;
    private int studentId;
    private int studentScoredGrade;
    private Date enrollDate;
  
//private String student_name;
    private String course_name;
    /*
    private String studentId;
    private String studentScoredGrade;
    */
    
//THE FUNCATIONS ON GRADES CONSTRCTOUR
    public Grades(int courseId, int studentId, int studentScoredGrade, Date enrollDate) {
        this.courseId = courseId;
        this.studentId = studentId;
         this.studentScoredGrade = studentScoredGrade;
        this.enrollDate = enrollDate;
        
       
    }
    
    //
       public Grades(int courseId, int studentId,Date enrollDate) {
        this.courseId = courseId;
        this.studentId = studentId;
      //   this.studentScoredGrade = studentScoredGrade;
        this.enrollDate = enrollDate;
        
       
    }
    
    
    public Grades(int courseId, int studentId, int studentScoredGrade) {
        this.courseId = courseId;
        this.studentId = studentId;
         this.studentScoredGrade = studentScoredGrade;
    
       
       
    }
    
     public Grades(String course_name , int studentScoredGrade) {
       
        this.course_name = course_name;
         this.studentScoredGrade = studentScoredGrade;
         
       
       
    }
    
    

    // Getter and Setter methods
    public int getCourseId() {
        return courseId;
    }

    public void setCourse_name(int courseId) {
        this.courseId = courseId;
    }
    
    
     public String getCourse_name() {
        return course_name;
    }

    public void setCourseId(String courseId) {
        this.course_name = course_name;
    }
    

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getGrade() {
        return enrollDate;
    }

    public void setGrade(Date grade) {
        this.enrollDate = grade;
    }

    public int getStudentScoredGrade() {
        return studentScoredGrade;
    }

    public void setStudentScoredGrade(int studentScoredGrade) {
        this.studentScoredGrade = studentScoredGrade;
    }

    // Other methods if needed
  /*  public String getFormattedEnrollDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(enrollDate);
    }*/
    
  /*  public ObservableValue<String> getFormattedEnrollDateProperty() {
    return new SimpleStringProperty(getFormattedEnrollDate());
}*/
    
  /*  public String getFormattedEnrollDate() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.format(enrollDate);
}
*/
    
  /*  public ObservableValue<String> getFormattedEnrollDateProperty() {
    return new SimpleStringProperty(getFormattedEnrollDate());
}*/
    
   /* public ObjectProperty<Date> enrollDateProperty() {
    return new SimpleObjectProperty<>(enrollDate);
}

public ObservableValue<String> getFormattedEnrollDateProperty() {
    return new SimpleStringProperty(getFormattedEnrollDate());
}*/



}
    
