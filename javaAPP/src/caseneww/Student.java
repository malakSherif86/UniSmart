/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseneww;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Student {
    
  
    private int id;
    private String fname;
    private String lname;
 //   private str joinDate;
    private String email;

    private int departmentId;
private String departmentIds;
    public Student(int id, String fname, String lname,String email , int departmentId) {
        this.id = id;
        this.fname = fname;
           this.lname = lname;
    //    this.joinDate = joinDate;
        this.email = email;
    
        this.departmentId = departmentId;
    }
    
  /*  public Student(int id, String fname, String lname,String email ) {
        this.id = id;
        this.fname = fname;
           this.lname = lname;
    //    this.joinDate = joinDate;
        this.email = email;
    
        //this.departmentId = departmentId;
    }*/

    public Student(int id) {
        this.id = id;
     
    }
     //update constractor
      public Student(int id, String fname, String lname,String email,String departmentIds) {
        this.id = id;
        this.fname = fname;
           this.lname = lname;
       
        this.email = email;
     this.departmentIds = departmentIds;
     
     
    }
    

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return fname;
    }

    public void setFirstName(String fname) {
        this.fname = fname;
    }
    
     public String getLastName() {
        return lname;
    }

    public void setLastName(String lname) {
        this.lname = lname;
    }
    
    

   /* public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    
    
     public String getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(String departmentIds) {
        this.departmentIds = departmentIds;
    }

  
}
    

