/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2Exercise1;

/**
 *
 * @author tom
 */

import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Histogram {
    
    public static void main(String[] args) {
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        InputStream stream = Histogram.class.getResourceAsStream("grades.txt");
        Scanner scanner = new Scanner(stream);
        
    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MyNewDB","t3clifford", "testpassword"); 
// replace your user name with <user> and your password with <passwd> 
        } catch (SQLException ex) {
            Logger.getLogger(MyJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        try {
            int id = 1;
            int grade = 0;
            while (scanner.hasNext()) {
                grade = scanner.nextInt();
                statement = con.createStatement();
                String sql = "INSERT INTO students (studentID, grade) VALUES (" + id + ", " + grade + ")";
                id++;
                statement.executeUpdate(sql);
                //ResultSetMetaData metaData =  resultSet.getMetaData();
            }
        }
        catch (SQLException s){
            System.out.println("SQL statement is not executed!");
            s.printStackTrace();
        }
    }
    
}
