/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.model;

/**
 *
 * @author Nam Le
 */
public class Phong {
    private long MaPhong;
    private String TenPhong;
    private String SdtPhong;
    private String DiachiPhong;

    public Phong(long MaPhong, String TenPhong, String SdtPhong, String DiachiPhong) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.SdtPhong = SdtPhong;
        this.DiachiPhong = DiachiPhong;
    }

    public long getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(long MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getSdtPhong() {
        return SdtPhong;
    }

    public void setSdtPhong(String SdtPhong) {
        this.SdtPhong = SdtPhong;
    }

    public String getDiachiPhong() {
        return DiachiPhong;
    }

    public void setDiachiPhong(String DiachiPhong) {
        this.DiachiPhong = DiachiPhong;
    }
}
