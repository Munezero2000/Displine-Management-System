package DAO;
import model.*;
import java.sql.*;

/**
 *
 * @author Munezero
 */
public class StudentDAO {
    private final String dbUrl = "jdbc:postgresql://localhost:5432/displine_management_system_db";
    private final String username = "postgres";
    private final String password = "Munezero25";
    
    public String createStudent(Student student) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "Insert into students (stid, stnames, class, \"guardianNames\", \"guardianNumber\", \"guardianEmail\", status) values(?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, student.getStudentId());
            pst.setString(2, student.getStudentNames());
            pst.setInt(3, student.getStudentClass());
            pst.setString(4, student.getGuardianNames());
            pst.setString(5, student.getGuardinaNumber());
            pst.setString(6, student.getGuardianEmail());
            pst.setInt(7, student.getStatus());
            int rowsAffected = pst.executeUpdate();
            conn.close();
            if(rowsAffected>= 1){
                return "Student succeffuly Added";
            }else{
                return "Student not Added";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }
    }
    
    public String updateStudent(Student student) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "update students set stnames=?, class=?, \"guardianNames\"=?, \"guardianNumber\"=?, \"guardianEmail\"=?, \"Marks\"=?, status=? where stid=? ";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, student.getStudentNames());
            pst.setInt(2, student.getStudentClass());
            pst.setString(3, student.getGuardianNames());
            pst.setString(4, student.getGuardinaNumber());
            pst.setString(5, student.getGuardianEmail());
            pst.setInt(6, student.getMarks());
            pst.setInt(7, student.getStatus());
            pst.setString(8, student.getStudentId());
            
            int rowsAffected = pst.executeUpdate();
            conn.close();
            if (rowsAffected >= 1) {
                return "Student Updated successfully";
            } else {
                return "Student not updated";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }
   }
    
    
    public String updateStudentMarksAndStatus(Student student) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "update students set \"Marks\"=?, status=? where stid=? ";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, student.getMarks());
            pst.setInt(2, student.getStatus());
            pst.setString(3, student.getStudentId());

            int rowsAffected = pst.executeUpdate();
            conn.close();
            if (rowsAffected >= 1) {
                return "Status and Marks Updates";
            } else {
                return "Status and Marks not Updated";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }
    }
    
    public String updateStudentUsingCalss(Student student) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "update students set \"Marks\"=?, status=? where class=? ";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, student.getMarks());
            pst.setInt(2, student.getStatus());
            pst.setInt(3, student.getStudentClass());

            int rowsAffected = pst.executeUpdate();
            conn.close();
            if (rowsAffected >= 1) {
                return "Status and Marks Updates";
            } else {
                return "Status and Marks not Updated";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }
    }
            

    public String deleteStudent(Student student) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "DELETE FROM STUDENTS WHERE stid =? ";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, student.getStudentId());
            int rowsAffected = pst.executeUpdate();
            conn.close();
            if (rowsAffected >= 1) {
                return "Student deleted successfully";
            } else {
                return "Student not deleted";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }
    }
    
    public Student getStudentById(Student student) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "Select * from Students where stid=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, student.getStudentId());
            ResultSet rs = pst.executeQuery();
            conn.close();

            Student std = null; // Initialize to null

            while (rs.next()) {
                std = new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            }

            return std; // Return the potentially null value

        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null in case of an exception
        }
    }

}
