/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax_calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ak875
 */
public class MysqlConnect {
    
    
    Connection conn=null;
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://my-java-project.cpnnjboqzqhz.ap-south-1.rds.amazonaws.com/ramu","admin","Abhishek");
            
            return conn;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
