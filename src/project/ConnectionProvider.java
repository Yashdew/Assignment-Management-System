/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author yashd
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","1234");
             return con;
         }
         catch(Exception e)
         {
             return null;
         }
    }
}
