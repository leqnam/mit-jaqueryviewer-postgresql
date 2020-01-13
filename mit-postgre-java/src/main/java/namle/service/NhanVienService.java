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
import namle.helper.connector;

/**
 *
 * @author Nam Le
 */
public class NhanVienService {
    
    public ResultSet khenThuongKyLuat() throws Exception {

//        Connection connection = connector.getConnection();
//        String sql = "SELECT * FROM public.\"MIT_KhenThuongKyLuat\"";
//        Statement stm = connection.createStatement();
//        ResultSet rs = stm.executeQuery(sql);
//        connection.close();
        return null;
    }
    
    public ResultSet danhSachkhenThuongKyLuat(String id) throws Exception {

//        Connection connection = connector.getConnection();
//        String sql = "SELECT a.\"MaNhanVien\", a.ho, a.ten, b.\"NoiDungKTKL\" FROM \"MIT_NhanVien\" a, \"MIT_KhenThuongKyLuat_CaNhan\" b, \"MIT_KhenThuongKyLuat\" c WHERE a.\"MaNhanVien\" = b.\"MaNhanVien\" AND b.\"MaLoaiKTKL\" = c.\"MaLoaiKTKL\" AND c.\"MaLoaiKTKL\" = " + id;
//        Statement stm = connection.createStatement();
//        ResultSet rs = stm.executeQuery(sql);
//
//        connection.close();
return null;
    }
    
}
