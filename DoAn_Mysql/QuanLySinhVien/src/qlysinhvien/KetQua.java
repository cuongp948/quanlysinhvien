/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

/**
 *
 * @author Administrator
 */
public class KetQua {
        private String maSV;
        private String maMonHoc;
        private float diem = 0.0f;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public KetQua() {
    }

    public KetQua(String maSV, String maMonHoc, float diem) {
        
        this.maSV = maSV;
        this.maMonHoc = maMonHoc;
        this.diem = diem;
    }
        
}
