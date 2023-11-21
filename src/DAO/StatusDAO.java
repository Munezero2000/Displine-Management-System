
package DAO;

import java.sql.*;
import java.util.*;
import model.*;

/**
 *
 * @author Munezero
 */
public class StatusDAO {
    private final String dbUrl = "jdbc:postgresql://localhost:5432/displine_management_system_db";
    private final String username = "postgres";
    private final String password = "Munezero25";
    
    

    public ResultSet getStatuses() {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            String sql = "select * from \"Status\"";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
