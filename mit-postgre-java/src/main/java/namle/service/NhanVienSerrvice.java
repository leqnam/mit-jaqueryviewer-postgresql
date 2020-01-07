/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import namle.helper.connector;
import namle.model.NhanVien;

/**
 *
 * @author Nam Le
 */
public class NhanVienSerrvice {
    
    public NhanVien addNew(NhanVien nv) throws SQLException, Exception {
        Connection connection = connector.getConnection();
        String sql = "INSERT INTO public.\"NhanVien\"(\"MaNhanVien\", ho, ten, diachi, sodienthoai, \"isActive\") VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, nv.getMaNhanVien());
        ps.setString(2, nv.getHo());
        ps.setString(3, nv.getTen());
        ps.setString(4, nv.getDiachi());
        ps.setString(5, nv.getSodienthoai());
        ps.setString(6, nv.getIsActive());
        ps.executeUpdate();
        connection.close();
        return nv;
    }
    
    
}
