package caseneww;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import oracle.jdbc.OracleDriver;

public class DataAccessLayer {
    public static Connection con = null;

    static int delete_student(Courses courses) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ResultSet rs = null;

    public static void connect() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "CASE", "case");
    }
    
    
    public static int update_student_DEP(Student student) throws SQLException {
    int result = -1;

    // Initialize the update query
    StringBuilder updateQuery = new StringBuilder("UPDATE students SET");

    // ArrayList to store the values that need to be updated
    List<Object> updateValues = new ArrayList<>();

    // Check and append each field if it is not null or empty
    if (student.getFirstName() != null && !student.getFirstName().isEmpty()) {
        updateQuery.append(" student_fname = ?,");
        updateValues.add(student.getFirstName());
    }

    if (student.getLastName() != null && !student.getLastName().isEmpty()) {
        updateQuery.append(" student_lname = ?,");
        updateValues.add(student.getLastName());
    }

    if (student.getEmail() != null && !student.getEmail().isEmpty()) {
        updateQuery.append(" email = ?,");
        updateValues.add(student.getEmail());
    }
    
    
     if (student.getDepartmentIds() != null && !student.getDepartmentIds().isEmpty()) {
        updateQuery.append(" department_id = ?,");
        updateValues.add(student.getDepartmentIds());
    }


    updateQuery.append(" WHERE student_id = ?");
    
    // Add the student ID to the list of values
    updateValues.add(student.getId());

    // Execute the dynamic update query
    try (PreparedStatement updateStudent = con.prepareStatement(updateQuery.toString())) {
        // Set values in the prepared statement
        for (int i = 0; i < updateValues.size(); i++) {
            if (updateValues.get(i) instanceof java.sql.Date) {
                // If the value is java.sql.Date, use setDate
                updateStudent.setDate(i + 1, (java.sql.Date) updateValues.get(i));
            } else {
                // Otherwise, use setObject
                updateStudent.setObject(i + 1, updateValues.get(i));
            }
        }

        result = updateStudent.executeUpdate();
    }

    return result;
}

    
    

    //new update 
public static int update_student(Student student) throws SQLException {
    int result = -1;

    // Initialize the update query
    StringBuilder updateQuery = new StringBuilder("UPDATE students SET");

    // ArrayList to store the values that need to be updated
    List<Object> updateValues = new ArrayList<>();

    // Check and append each field if it is not null or empty
    if (student.getFirstName() != null && !student.getFirstName().isEmpty()) {
        updateQuery.append(" student_fname = ?,");
        updateValues.add(student.getFirstName());
    }

    if (student.getLastName() != null && !student.getLastName().isEmpty()) {
        updateQuery.append(" student_lname = ?,");
        updateValues.add(student.getLastName());
    }

    if (student.getEmail() != null && !student.getEmail().isEmpty()) {
        updateQuery.append(" email = ?,");
        updateValues.add(student.getEmail());
    }
    
 if (student.getDepartmentId() != 0 && !String.valueOf(student.getDepartmentId()).isEmpty()) {
    updateQuery.append(" department_id = ?,");
    updateValues.add(student.getDepartmentId());}

    if (updateQuery.charAt(updateQuery.length() - 1) == ',') {
        updateQuery.setLength(updateQuery.length() - 1);
    }

    updateQuery.append(" WHERE student_id = ?");
    
    // Add the student ID to the list of values
    updateValues.add(student.getId());

    // Execute the dynamic update query
    try (PreparedStatement updateStudent = con.prepareStatement(updateQuery.toString())) {
        // Set values in the prepared statement
        for (int i = 0; i < updateValues.size(); i++) {
            if (updateValues.get(i) instanceof java.sql.Date) {
                // If the value is java.sql.Date, use setDate
                updateStudent.setDate(i + 1, (java.sql.Date) updateValues.get(i));
            } else {
                // Otherwise, use setObject
                updateStudent.setObject(i + 1, updateValues.get(i));
            }
        }

        result = updateStudent.executeUpdate();
    }

    return result;
}



   // end of new update
    
    
   /*     int result = -1;

        try (PreparedStatement updateStudent = con.prepareStatement(
                "UPDATE students SET student_fname = ?, student_lname = ?, email = ?, join_date = ?, department_id = ? WHERE student_id = ?")) {

            updateStudent.setString(1, student.getFirstName());
            updateStudent.setString(2, student.getLastName());
            updateStudent.setString(3, student.getEmail());
       
            updateStudent.setInt(5, student.getDepartmentId());
            updateStudent.setInt(6, student.getId());

            result = updateStudent.executeUpdate();
        }

        return result;
    }
    
    */
    
    
     public static Student select_student(int studentId) throws SQLException {
        Student student = null;

        try (PreparedStatement selectStudent = con.prepareStatement(
                "SELECT * FROM students WHERE student_id = ?")) {

            selectStudent.setInt(1, studentId);

            try (ResultSet resultSet = selectStudent.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("student_id");
                    String fname = resultSet.getString("student_fname");
                    String lname = resultSet.getString("student_lname");
                    String email = resultSet.getString("email");
                   // Date joinDate = resultSet.getDate("join_date");
                    int departmentId = resultSet.getInt("department_id");

                    student = new Student(id, fname, lname, email,  departmentId);
                }
            }
        }

        return student;
    }
     
    
public static int delete_student(Student student) throws SQLException {
   
    int result = -1;

    try (PreparedStatement deleteStudent = con.prepareStatement("DELETE FROM students WHERE student_id = ? "))
    {
        

        deleteStudent.setInt(1, student.getId());
        //  con.commit();

        result = deleteStudent.executeUpdate();
    }
    

    return result;
}


      //to insert in the students table
       public static int insert(Student student) throws SQLException {
    int result = -1;

    try (PreparedStatement insertStudent = con.prepareStatement(
            "INSERT INTO students (student_id, student_fname, student_lname, email,  department_id) VALUES (?, ?, ?, ?, ?)"))
    {

        insertStudent.setInt(1, student.getId());
        insertStudent.setString(2, student.getFirstName());
    insertStudent.setString(3, student.getLastName());
       insertStudent.setString(4, student.getEmail());
    //    insertStudent.setDate(5, new java.sql.Date(student.getJoinDate().getTime()));
     
       insertStudent.setInt(5, student.getDepartmentId());

        result = insertStudent.executeUpdate();
    }
    

    return result;
}
  
       
           
//end of student table funcations *******************************************************************************************************************************************************************************************
//start of grades table funcations *************************************************************************************************************************************************************************************
 
   //student report funcation lists     
       public static ArrayList<Grades> getGrades(int studentId) throws SQLException {
    ArrayList<Grades> grades = new ArrayList<>();
    PreparedStatement pst = con.prepareStatement("SELECT c.course_name, g.STUDENT_SCORED_GRADE FROM grades g JOIN courses c ON g.course_id = c.course_id WHERE student_id = ?");

    pst.setInt(1, studentId);

    try (ResultSet rs = pst.executeQuery()) {
        while (rs.next()) {
            // Retrieve the columns in the correct order
            String courseName = rs.getString("course_name");
            int studentScoredGrade = rs.getInt("STUDENT_SCORED_GRADE");

            // Create Grades object with the correct order of parameters
            Grades GrdOBJ = new Grades(courseName, studentScoredGrade);
            grades.add(GrdOBJ);
        }
        return grades;
    }
}
  
     //  course report funcation lists********************************
public static ArrayList<Courses> getCourses(int courseId) throws SQLException {
    ArrayList<Courses> courses = new ArrayList<>();
    PreparedStatement pst = con.prepareStatement("SELECT  s.student_fname || ' ' || s.student_lname AS student_fname, g.STUDENT_SCORED_GRADE FROM grades g JOIN students s ON s.student_id = g.student_id WHERE course_id = ?");

    pst.setInt(1, courseId);

    try (ResultSet rs = pst.executeQuery()) {
        while (rs.next()) {
            String student_fname = rs.getString("student_fname");
            int studentScoredGrade = rs.getInt("STUDENT_SCORED_GRADE");

            Courses coursedOBJ = new Courses(student_fname, studentScoredGrade);
            courses.add(coursedOBJ);
        }
        return courses;
    } catch (SQLException e) {
        e.printStackTrace(); // Add logging to see if there's an exception
        throw e; // Rethrow the exception after logging
    }
}

  

  //gba funcatopn for student 
   public static double callCaseGBAFunction(int studentId) {
        double gpa = 0;

        // SQL query to call the PL/SQL function
        String query = "{ ? = call caseGBA(?) }";

        try (CallableStatement callableStatement = con.prepareCall(query)) {
            // Register the output parameter
            callableStatement.registerOutParameter(1, Types.NUMERIC);

            // Set the input parameter
            callableStatement.setInt(2, studentId);

            // Execute the function call
            callableStatement.execute();

            // Retrieve the result from the output parameter
            gpa = callableStatement.getDouble(1);

            System.out.println("GPA calculated successfully: " + gpa);
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }

        return gpa;
    }
   
   //gbA FUncation for course 
             
   public static double callCaseGBACourse(int courseId) {
        double gpa = 0;

        String query = "{ ? = call calculate_course_gba(?) }";

        try (CallableStatement callableStatement = con.prepareCall(query)) {

            callableStatement.registerOutParameter(1, Types.NUMERIC);

            callableStatement.setInt(2, courseId);

           
            callableStatement.execute();

            gpa = callableStatement.getDouble(1);

            System.out.println("GPA calculated successfully: " + gpa);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gpa;
    }
           
   /////////end of the reports funcation but still in the grades table 
   
            //to insert in the GRADES table
       public static int insertG(Grades grades) throws SQLException {
    int result = -1;

    try (PreparedStatement insertStudent = con.prepareStatement(
            "INSERT INTO grades( course_id,student_id, STUDENT_SCORED_GRADE, ENROLL_DATE) VALUES (?, ?, ?, ?)"))
    {

                insertStudent.setInt(1, grades.getCourseId());
        insertStudent.setInt(2, grades.getStudentId());

        insertStudent.setInt(3, grades.getStudentScoredGrade());
       insertStudent.setDate(4, new java.sql.Date(grades.getGrade().getTime()));
     
       
        result = insertStudent.executeUpdate();
    }
    

    return result;
}
           
       public static int insertGWithoutScore(Grades grades) throws SQLException {
    int result = -1;

    try (PreparedStatement insertStudent = con.prepareStatement(
            "INSERT INTO grades(course_id, student_id, ENROLL_DATE) VALUES (?, ?, ?)")) {

        insertStudent.setInt(1, grades.getCourseId());
        insertStudent.setInt(2, grades.getStudentId());
        insertStudent.setDate(3, new java.sql.Date(grades.getGrade().getTime()));

        result = insertStudent.executeUpdate();
    }

    return result;
}
       

           //end of insert in grades table 
  
       //start of delete feom grades table 
       public static int deleteGrade(Grades grades) throws SQLException {
    int result = -1;

    try (PreparedStatement deleteStatement = con.prepareStatement(
            "DELETE FROM grades WHERE course_id = ? AND student_id = ? AND enroll_date = ?")) {

        deleteStatement.setInt(1, grades.getCourseId());
        deleteStatement.setInt(2, grades.getStudentId());
        deleteStatement.setDate(3, new java.sql.Date(grades.getGrade().getTime()));

        result = deleteStatement.executeUpdate();
    }

    return result;
}


       public static int updateScoredGrade(Grades grades) throws SQLException {
    int result = -1;

    try (PreparedStatement updateStatement = con.prepareStatement(
            "UPDATE grades SET student_scored_grade = ? WHERE course_id = ? AND student_id = ? AND enroll_date = ?")) {

        updateStatement.setInt(1, grades.getStudentScoredGrade());
        updateStatement.setInt(2, grades.getCourseId());
        updateStatement.setInt(3, grades.getStudentId());
        updateStatement.setDate(4, new java.sql.Date(grades.getGrade().getTime()));

        result = updateStatement.executeUpdate();
    }

    return result;
}

       
       
       public static ObservableList<Grades> getAllGrades() throws SQLException {
    ObservableList<Grades> gradesList = FXCollections.observableArrayList();

    try (Statement statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT * FROM grades")) {

        while (resultSet.next()) {
            int courseId = resultSet.getInt("course_id");
            int studentId = resultSet.getInt("student_id");
            int studentScoredGrade = resultSet.getInt("STUDENT_SCORED_GRADE");
            Date enrollDate = resultSet.getDate("ENROLL_DATE");

            Grades grades = new Grades(courseId, studentId, studentScoredGrade, enrollDate);
            gradesList.add(grades);
        }
    }

    return gradesList;
}
// end of all grades funcations *****************************************************************************************************************
       
  //start of department funcations **************************************************************************************************************************************
           
 
         public static ObservableList<Departments> getAllDepartments() throws SQLException {
    ObservableList<Departments> depList = FXCollections.observableArrayList();

    try (Statement statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT * FROM departments")) {

        while (resultSet.next()) {
            int dep_id = resultSet.getInt("DEPARTMENT_ID");
           String dep_name = resultSet.getString("DEPARTMENT_NAME"); // Match the case of the column name

        

            Departments departments = new Departments(dep_id ,dep_name);
            depList.add(departments);
        }
    }

    return depList;
}
             
       public static int insertDep(Departments departments) throws SQLException {
    int result = -1;

    try (PreparedStatement insertDep = con.prepareStatement(
            "INSERT INTO Departments(DEPARTMENT_ID, DEPARTMENT_NAME) VALUES (?, ?)")) {

        insertDep.setInt(1, departments.getDep_id());
        insertDep.setString(2, departments.getName());
       

        result = insertDep.executeUpdate();
    }

    return result;
}
    
              public static int deleteDep(Departments departments) throws SQLException {
    int result = -1;

    try (PreparedStatement deleteDEP = con.prepareStatement(
            "DELETE FROM Departments WHERE DEPARTMENT_ID = ? AND DEPARTMENT_NAME = ? ")) {
         deleteDEP.setInt(1, departments.getDep_id());
        deleteDEP.setString(2, departments.getName());
        result = deleteDEP.executeUpdate();
    }

    return result;
}

       
       public static int updateDEP(Departments departments) throws SQLException {
    int result = -1;

    try (PreparedStatement updateDep = con.prepareStatement(
            "UPDATE Departments SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID = ? ")) {
 updateDep.setInt(2, departments.getDep_id());
        updateDep.setString(1, departments.getName());
        result = updateDep.executeUpdate();
    }

    return result;
}

       
    //END OF THE DEPARTEMNTS AND START OF THE COURSES 
       
    public static ObservableList<Courses> getAllCourses() throws SQLException {
        ObservableList<Courses> courseList = FXCollections.observableArrayList();

        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM courses")) {

            while (resultSet.next()) {
                int courseId = resultSet.getInt("COURSE_ID");
                String courseName = resultSet.getString("COURSE_NAME");
                String duration = resultSet.getString("DURATION");
               
                String description = resultSet.getString("DESCRIPTION");
                int max_grade = resultSet.getInt("MAX_GRADE");
                int departmentId = resultSet.getInt("DEPARTMENT_ID");

                Courses course = new Courses(courseId, courseName, duration,  max_grade, departmentId, description);
                courseList.add(course);
            }
        }

        return courseList;
    }
    
    public static int delete_courses(Courses courses) throws SQLException {
   
    int result = -1;

    try (PreparedStatement deleteStudent = con.prepareStatement("DELETE FROM courses WHERE course_id = ? "))
    {
     deleteStudent.setInt(1, courses.getCousreid());
        result = deleteStudent.executeUpdate();
    }
    return result;
}
    
    
  public static int insertCourse(Courses course) throws SQLException {  
    int result = -1;

    try (PreparedStatement stmt = con.prepareStatement(
            "INSERT INTO courses (course_id,course_name, department_Id, max_grade, duration, description) VALUES (?, ?, ?,?, ?, ?)"))
    {

        
stmt.setInt(1, course.getCousreid());
            stmt.setString(2, course.getCourse_name());
            stmt.setInt(3, course.getDepartment_Id());
            stmt.setDouble(4, course.getMaxGrade());
            stmt.setString(5, course.getDuration());
            stmt.setString(6, course.getDescription());
        result = stmt.executeUpdate();
    }
    
    return result;
}
  /* public static int updateCourse(Courses course) throws SQLException {
        int result = -1;

       

            // Create the base update query
            String updateQuery = "UPDATE COURSES SET ";

            // Create a StringBuilder to dynamically add SET clauses
            StringBuilder setClauses = new StringBuilder();

            // Create a flag to check if any updates were specified
            boolean hasUpdates = false;

            // Conditionally add each field to the SET clauses
            if (course.getCourse_name() != null) {
                setClauses.append("COURSE_NAME = ?, ");
                hasUpdates = true;
            }

            if (course.getDuration() != null) {
                setClauses.append("DURATION = ?, ");
                hasUpdates = true;
            }

            if (course.getMaxGrade() >= 0) {
                setClauses.append("MAX_GRADE = ?, ");
                hasUpdates = true;
            }

            if (course.getDepartment_Id() >= 0) {
                setClauses.append("DEPARTMENT_ID = ?, ");
                hasUpdates = true;
            }

            if (course.getDescription() != null) {
                setClauses.append("DESCRIPTION = ?, ");
                hasUpdates = true;
            }

            // Remove the trailing comma and space if updates were specified
            if (hasUpdates) {
                setClauses.delete(setClauses.length() - 2, setClauses.length());
            } else {
                // No updates specified
                return result;
            }

            // Add the SET clauses to the update query
            updateQuery += setClauses.toString();

            // Add the WHERE clause
            updateQuery += " WHERE COURSE_ID = ?";

            // Prepare the statement with the dynamic update query
            try (PreparedStatement updateStatement = con.prepareStatement(updateQuery)) {

                // Set the parameter values based on the specified updates
                int parameterIndex = 1;

                if (course.getCourse_name() != null) {
                    updateStatement.setString(parameterIndex++, course.getCourse_name());
                }
                if (course.getDuration() != null) {
                    updateStatement.setString(parameterIndex++, course.getDuration());
                }
                if (course.getMaxGrade() >= 0) {
                    updateStatement.setInt(parameterIndex++, course.getMaxGrade());
                }
                if (course.getDepartment_Id() >= 0) {
                    updateStatement.setInt(parameterIndex++, course.getDepartment_Id());
                }
                if (course.getDescription() != null) {
                    updateStatement.setString(parameterIndex++, course.getDescription());
                }

                // Set the WHERE clause parameter
                updateStatement.setInt(parameterIndex, course.getCousreid());

                // Execute the update
                result = updateStatement.executeUpdate();
            }
        

        return result;
    }
  */
  
 /* public static int updateCourse(Courses course) throws SQLException {
    int result = -1;
ss
    try (CallableStatement stmt = con.prepareCall(
            "{CALL update_courses(?, ?, ?, ?, ?, ?)}")) {

        stmt.setInt(1, course.getCousreid());
        stmt.setString(2, course.getCourse_name());
        stmt.setInt(3, course.getDepartment_Id());
        stmt.setDouble(4, course.getMaxGrade());
        stmt.setString(5, course.getDuration());
        stmt.setString(6, course.getDescription());

        result = stmt.executeUpdate();
    }

    return result;
}

*/
  public static int updateCourse(int courseId, Map<String, Object> updates) throws SQLException {
    int result = -1;

    if (updates.isEmpty()) {
        // No updates specified
        return result;
    }

    // Create the base update query
    String updateQuery = "UPDATE COURSES SET ";

    // Create a StringBuilder to dynamically add SET clauses
    StringBuilder setClauses = new StringBuilder();

    // Add SET clauses dynamically based on the columns to be updated
    for (Map.Entry<String, Object> entry : updates.entrySet()) {
        setClauses.append(entry.getKey()).append(" = ?, ");
    }

    // Remove the trailing comma and space
    setClauses.delete(setClauses.length() - 2, setClauses.length());

    // Add the SET clauses to the update query
    updateQuery += setClauses.toString();

    // Add the WHERE clause
    updateQuery += " WHERE COURSE_ID = ?";

    try (PreparedStatement updateStatement = con.prepareStatement(updateQuery)) {
        // Set the parameter values based on the specified updates
        int parameterIndex = 1;
        for (Object value : updates.values()) {
            if (value instanceof Integer) {
                updateStatement.setInt(parameterIndex++, (Integer) value);
            } else if (value instanceof String) {
                updateStatement.setString(parameterIndex++, (String) value);
            }
        }

        // Set the WHERE clause parameter
        updateStatement.setInt(parameterIndex, courseId);

        // Execute the update
        result = updateStatement.executeUpdate();
    }

    return result;
}

      
}  
    