/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import namle.helper.connector;
import namle.model.Phong;

/**
 *
 * @author Nam Le
 */
public class PhongService {
    
    public Phong addNew(Phong p) throws SQLException, Exception {
        Connection connection = connector.getConnection();
        String sql = "INSERT INTO public.\"Phong\"(\"MaPhong\", \"TenPhong\", \"SdtPhong\", \"DiachiPhong\") VALUES(?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, p.getMaPhong());
        ps.setString(2, p.getTenPhong());
        ps.setString(3, p.getSdtPhong());
        ps.setString(4, p.getDiachiPhong());
        ps.executeUpdate();
        connection.close();
        return p;
    }
    
    public ResultSet danhSachPhong() throws Exception {

        Connection connection = connector.getConnection();
        String sql = "SELECT * FROM public.\"Phong\"";
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        connection.close();
        return rs;
    }
}
