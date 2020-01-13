/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.helper;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Nam Le
 */
public class connector {
    private static Connection conn = null;
    public static Connection getConnection(String host, String dbName, String user, String pwd) throws Exception {
        // String dbName = "mit", user = "mit", pwd = "!1234";
        Class.forName("org.postgresql.Driver");
        return conn=DriverManager.getConnection("jdbc:postgresql://" + host + "/" + dbName, user, pwd);
    }
    
    public static void resetConnection() {
        conn = null;
    }
    
}
