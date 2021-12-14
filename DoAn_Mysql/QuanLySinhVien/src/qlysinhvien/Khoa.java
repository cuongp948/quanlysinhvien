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
public class Khoa {
        private String maKhoa;
        private String tenKhoa;

    public Khoa() {
    }

    public Khoa(String maKhoa, String tenKhoa) throws Exception {
        if(maKhoa.trim().length() == 0 || tenKhoa.trim().length() == 0){
            throw new IllegalArgumentException("Vui lòng không để trống");
        }
          if(Pattern.matches("[^\\d-!@#$%^&*()_+=/*-+./?.,'\";:|{}]+", tenKhoa) == false){
            throw new Exception("Tên khoa không có số và kí tự đặc biệt");
        }
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
}
