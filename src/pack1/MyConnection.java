/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author gaurav.sharma
 */
public class MyConnection {

   public static Connection con;
   public static PreparedStatement pst;

    public MyConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sfsbatch9;selectMethod=cursor", "sa", "abc123");
            pst = con.prepareStatement(" ");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
