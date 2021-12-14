/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlysinhvien;

import javax.naming.AuthenticationException;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
/**
 *
 * @author Administrator
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String noiSinh;
    private String diaChi;
    private String quan;
    private String maKhoa;
    private int hocBong;

    public int getHocBong() {
        return hocBong;
    }

    public void setHocBong(int hocBong) {
        this.hocBong = hocBong;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public SinhVien() {
        super();
    }

    public SinhVien(String maSV, String hoTen, String gioiTinh, String ngaySinh, String noiSinh, String diaChi, String quan, String maKhoa, int hocBong)  throws Exception{
         if(maSV.trim().length() == 0 || hoTen.trim().length() == 0 || ngaySinh.trim().length() == 0 || gioiTinh.trim().length() == 0 || diaChi.trim().length() == 0 || quan.trim().length() == 0 || maKhoa.trim().length() == 0){
                throw new IllegalArgumentException("Vui lòng không để trống");
        }
        else if(Pattern.matches("[^\\d-!@#$%^&*()_+=/*-+./?.,'\";:|{}]+", hoTen) == false){//so,cac ki tu dac biet
                throw new Exception("Vui lòng nhập họ tên không có số và các kí tự đặc biệt");
        }

        this.maSV = maSV;
        this.hoTen = hoTen;
          this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.diaChi = diaChi;
        this.quan = quan;
        this.maKhoa = maKhoa;
        this.hocBong = hocBong;
    }

    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
       
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public SinhVien(String maSV){
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", noiSinh=" + noiSinh + ", diaChi=" + diaChi + ", quan=" + quan + ", maKhoa=" + maKhoa + ", hocBong=" + hocBong + '}';
    }
    @Override
    public int compareTo(SinhVien sv){
        return this.getMaSV().compareTo(sv.getMaSV());
    }
    
}
