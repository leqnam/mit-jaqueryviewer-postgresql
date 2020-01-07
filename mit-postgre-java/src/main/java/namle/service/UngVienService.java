/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.service;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import namle.helper.connector;
import namle.model.UngVien;

/**
 *
 * @author Nam Le
 */
public class UngVienService {
    
    public UngVien addNew(UngVien nv) throws SQLException, Exception {
        Connection connection = connector.getConnection();
        String sql = "INSERT INTO public.\"UngVien\" VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, nv.getMaUngVien());
        ps.setString(2, nv.getTenUngVien());
        ps.setString(3, nv.getEmailUngVien());
        ps.setString(4, nv.getSdtUngVien());
        ps.setString(5, nv.getDiaChiUngVien());
        ps.setDate(6, (java.sql.Date) nv.getNgayNop());
        ps.executeUpdate();
        connection.close();
        return nv;
    }
    
    
}
