/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import model.Staff;
import java.sql.*;
import view.SessionManagement;

/**
 *
 * @author Munezero
 */
public class StaffDAO {
    private final String dbUrl = "jdbc:postgresql://localhost:5432/displine_management_system_db";
    private final String username = "postgres";
    private final String password = "Munezero25";
    
    public String createStaff(Staff staff){
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Staff getStaffByEmail(Staff staff){
        try {
            ResultSet rs;
            Staff member;
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
                String sql = "select * from users where email=? and password=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, staff.getEmail());
                pst.setString(2, staff.getPassword());
                rs = pst.executeQuery();
            while(rs.next()){
            member = new Staff(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            return member;
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        }
    
    public Staff getStaffById() {
        try {
            ResultSet rs;
            Staff member;
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            
            String sql = "select * from users where user_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, SessionManagement.id);
            rs = pst.executeQuery();
            while (rs.next()) {
                member = new Staff(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                return member;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
