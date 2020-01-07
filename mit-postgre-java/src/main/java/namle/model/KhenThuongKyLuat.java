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
public class KhenThuongKyLuat {
    private Integer MaLoaiKTKL;
    private String LoaiKTKL;

    public KhenThuongKyLuat(Integer MaLoaiKTKL, String LoaiKTKL) {
        this.MaLoaiKTKL = MaLoaiKTKL;
        this.LoaiKTKL = LoaiKTKL;
    }

    public Integer getMaLoaiKTKL() {
        return MaLoaiKTKL;
    }

    public void setMaLoaiKTKL(Integer MaLoaiKTKL) {
        this.MaLoaiKTKL = MaLoaiKTKL;
    }

    public String getLoaiKTKL() {
        return LoaiKTKL;
    }

    public void setLoaiKTKL(String LoaiKTKL) {
        this.LoaiKTKL = LoaiKTKL;
    }
}
