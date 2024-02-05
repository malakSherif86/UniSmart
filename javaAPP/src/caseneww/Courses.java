/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseneww;

/**
 *
 * @author hp
 */
public class Courses {
    
    
    
    
    
    
    private int cousreid;
    private int studentId;
  //  private String name;
    private String duration;
    private double cost;
    private int maxGrade;
    private String description;
    private String student_fname;
    private String course_name;
  
  private int department_Id;
    private int   studentScoredGrade;
    
    
   //fav for courses table  
    public Courses(int cousreid,String course_name, String duration, int maxGrade,int department_Id, String description) {
        this.cousreid = cousreid;
        this.department_Id = department_Id;
        this.course_name = course_name;
        this.duration = duration;
      
        this.maxGrade = maxGrade;
        this.description = description;
    }
    
    public Courses(int cousreid, int studentId, String student_fname, String duration, double cost, int maxGrade, String description) {
        this.cousreid = cousreid;
        this.studentId = studentId;
        this.student_fname = student_fname;
        this.duration = duration;
        this.cost = cost;
        this.maxGrade = maxGrade;
        this.description = description;
    }

    // Courses course = new Courses(courseId, courseName, duration,  max_grade, departmentId, description);
    
        
    public Courses(int cousreid) {
        this.cousreid = cousreid;
     
    }

    Courses(int courseIdInt, String courseName, int departmentIdInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public int getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(int department_Id) {
        this.department_Id = department_Id;
    }
    
    
     
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    
    
    
    
    
    public Courses(String student_fname , int studentScoredGrade) {
       
        this.student_fname = student_fname;
         this.studentScoredGrade = studentScoredGrade;
         
      
       
    }
    // Getter and Setter methods
    public int getCousreid() {
        return cousreid;
    }

    public void setCousreid(int id) {
        this.cousreid = cousreid;
    }
    
    
    
    //
     public int getStudentScore() {
        return studentScoredGrade;
    }

    public void setStudentScore(int studentScoredGrade) {
        this.studentScoredGrade = studentScoredGrade;
    }

    public String getNamecourse() {
        return student_fname;
    }

    public void setNamecourse(String student_fname) {
        this.student_fname = student_fname;
    }
    
    
    
    //

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

   

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Other methods if needed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
