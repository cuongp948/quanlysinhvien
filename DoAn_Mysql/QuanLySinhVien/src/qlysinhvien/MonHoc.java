/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class MonHoc 
{
        private String maMonHoc;
        private String tenMonHoc;
        private int soTiet;

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc, int soTiet) throws Exception{
        if(maMonHoc.trim().length() == 0 || tenMonHoc.trim().length() == 0){
            throw new IllegalArgumentException("Vui lòng nhập đầy đủ");
        }
         if(Pattern.matches("[^\\d-!@#$%^&*()_+=/*-+./?.,'\";:|{}]+", tenMonHoc) == false){
            throw new Exception("Tên môn học không có số và kí tự đặc biệt");
        }
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTiet = soTiet;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMonHoc=" + maMonHoc + ", tenMonHoc=" + tenMonHoc + ", soTiet=" + soTiet + '}';
    }
        
}
