/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.util.*;
import model.*;

/**
 *
 * @author Munezero
 */
public class ClassesDAO {
    private final String dbUrl = "jdbc:postgresql://localhost:5432/displine_management_system_db";
    private final String username = "postgres";
    private final String password = "Munezero25";
    
    private LinkedList<Classes> classList  =new LinkedList<Classes>();
    
    public ResultSet getAvailableClasses() {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String sql = "select * from class";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
  }

