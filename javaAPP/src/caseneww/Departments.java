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
public class Departments {
    
    private int dep_id;
    private String dep_name;
 

    public Departments(int dep_id, String dep_name) {
        this.dep_id = dep_id;
        this.dep_name = dep_name;}

  
    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getName() {
        return dep_name;
    }

    public void setName(String dep_name) {
        this.dep_name = dep_name;
    }

 
    // Other methods if needed
}

