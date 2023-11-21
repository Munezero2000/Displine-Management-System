/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import model.*;


/**
 *
 * @author Munezero
 */
public class PermissionDAO {
    private final String dbUrl = "jdbc:postgresql://localhost:5432/displine_management_system_db";
    private final String username = "postgres";
    private final String password = "Munezero25";
    
    public String AddStudentPunishment(Permission perm) {
    
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String query = "INSERT INTO permissions (student, \"Reason\", \"daysofpunishment\", \"marksDeducted\", \"datedone\", \"InCharge\", status) VALUES (?, ?, ?, ?, LOCALTIMESTAMP, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, perm.getStudent());
            pst.setString(2, perm.getReason());
            pst.setInt(3, perm.getDaysofPunishment());
            pst.setInt(4, punishment.getMarksDeducted());
            pst.setInt(5, SessionManagement.id);
            pst.setInt(6, punishment.getStatus());
            int rowsAffected = pst.executeUpdate();
            conn.close();
            if (rowsAffected >= 1) {
                return "Student with id " + punishment.getStudent() + " has been punished";
            } else {
                return "Student has not been recorded";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }
    
}
