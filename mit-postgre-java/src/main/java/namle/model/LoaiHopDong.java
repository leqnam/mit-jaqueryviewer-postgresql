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
public class LoaiHopDong {
    private String MaLoaiHopDong;
    private String LoaiHopDong;
    private String ThoiHan;

    public LoaiHopDong(String MaLoaiHopDong, String LoaiHopDong, String ThoiHan) {
        this.MaLoaiHopDong = MaLoaiHopDong;
        this.LoaiHopDong = LoaiHopDong;
        this.ThoiHan = ThoiHan;
    }

    public String getMaLoaiHopDong() {
        return MaLoaiHopDong;
    }

    public void setMaLoaiHopDong(String MaLoaiHopDong) {
        this.MaLoaiHopDong = MaLoaiHopDong;
    }

    public String getLoaiHopDong() {
        return LoaiHopDong;
    }

    public void setLoaiHopDong(String LoaiHopDong) {
        this.LoaiHopDong = LoaiHopDong;
    }

    public String getThoiHan() {
        return ThoiHan;
    }

    public void setThoiHan(String ThoiHan) {
        this.ThoiHan = ThoiHan;
    }
}
