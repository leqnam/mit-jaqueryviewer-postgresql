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
public class NhanVien {

    private String MaNhanVien;
    private String ho;
    private String ten;
    private String diachi;
    private String sodienthoai;
    private String isActive;

    public NhanVien(String MaNhanVien, String ho, String ten, String diachi, String sodienthoai, String isActive) {
        this.MaNhanVien = MaNhanVien;
        this.ho = ho;
        this.ten = ten;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.isActive = isActive;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    
}
