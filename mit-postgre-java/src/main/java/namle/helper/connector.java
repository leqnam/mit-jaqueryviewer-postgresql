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
    public static Connection getConnection() throws Exception {
        String dbName = "mit", user = "mit", pwd = "!1234";
        Class.forName("org.postgresql.Driver");
        return (conn==null) ? conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, user, pwd) : conn;
    }
    
    public static void resetConnection() {
        conn = null;
    }
    
}
