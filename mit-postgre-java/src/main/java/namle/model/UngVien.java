/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.model;

import java.util.Date;

/**
 *
 * @author Nam Le
 */
public class UngVien {

    private long MaUngVien;
    private String TenUngVien;
    private String EmailUngVien;
    private String SdtUngVien;
    private String DiaChiUngVien;
    private Date NgayNop;

    public UngVien(long MaUngVien, String TenUngVien, String EmailUngVien, String SdtUngVien, String DiaChiUngVien, Date NgayNop) {
        this.MaUngVien = MaUngVien;
        this.TenUngVien = TenUngVien;
        this.EmailUngVien = EmailUngVien;
        this.SdtUngVien = SdtUngVien;
        this.DiaChiUngVien = DiaChiUngVien;
        this.NgayNop = NgayNop;
    }

    public long getMaUngVien() {
        return MaUngVien;
    }

    public void setMaUngVien(long MaUngVien) {
        this.MaUngVien = MaUngVien;
    }

    public String getTenUngVien() {
        return TenUngVien;
    }

    public void setTenUngVien(String TenUngVien) {
        this.TenUngVien = TenUngVien;
    }

    public String getEmailUngVien() {
        return EmailUngVien;
    }

    public void setEmailUngVien(String EmailUngVien) {
        this.EmailUngVien = EmailUngVien;
    }

    public String getSdtUngVien() {
        return SdtUngVien;
    }

    public void setSdtUngVien(String SdtUngVien) {
        this.SdtUngVien = SdtUngVien;
    }

    public String getDiaChiUngVien() {
        return DiaChiUngVien;
    }

    public void setDiaChiUngVien(String DiaChiUngVien) {
        this.DiaChiUngVien = DiaChiUngVien;
    }

    public Date getNgayNop() {
        return NgayNop;
    }

    public void setNgayNop(Date NgayNop) {
        this.NgayNop = NgayNop;
    }
    
}
