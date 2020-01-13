/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.service;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import namle.helper.connector;
import namle.model.UngVien;

/**
 *
 * @author Nam Le
 */
public class UngVienService {

    public UngVien addNew(UngVien nv) throws SQLException, Exception {
//        Connection connection = connector.getConnection();
//        String sql = "INSERT INTO public.\"MIT_UngVien\" VALUES(?,?,?,?,?,?)";
//        PreparedStatement ps = connection.prepareCall(sql);
//        ps.setLong(1, nv.getMaUngVien());
//        ps.setString(2, nv.getTenUngVien());
//        ps.setString(3, nv.getEmailUngVien());
//        ps.setString(4, nv.getSdtUngVien());
//        ps.setString(5, nv.getDiaChiUngVien());
//        ps.setDate(6, (java.sql.Date) nv.getNgayNop());
//        ps.executeUpdate();
//        connection.close();
        return null;
    }

    public ResultSet danhSachUngVien() throws Exception {

//        Connection connection = connector.getConnection();
//        String sql = "SELECT * FROM public.\"MIT_UngVien\"";
//        Statement stm = connection.createStatement();
//        ResultSet rs = stm.executeQuery(sql);
//
//        connection.close();
        return null;
    }
    
}
