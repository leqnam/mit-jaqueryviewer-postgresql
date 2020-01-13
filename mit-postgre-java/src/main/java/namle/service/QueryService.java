/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import namle.helper.connector;

/**
 *
 * @author leqna
 */
public class QueryService {
    public ResultSet query(String host, String db, String us, String pw, String sql) throws Exception {

        Connection connection = connector.getConnection(host, db, us, pw);
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        connection.close();
        return rs;
    }
}
