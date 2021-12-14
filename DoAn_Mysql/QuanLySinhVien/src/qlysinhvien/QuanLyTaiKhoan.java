/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tduy2
 */
public class QuanLyTaiKhoan {

    public PreparedStatement ps;
    public ResultSet rs;
    ArrayList<TaiKhoan> listTK = new ArrayList<TaiKhoan>();
     Connection con = ConnectDB.getConnect();
    public Boolean DangNhap(String tenDangNhap, String matKhau) {
        try {
           
            String sql = "SELECT * FROM taiKhoan Where TenDangNhap = ? and MatKhau = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            rs = ps.executeQuery();
            if (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setTenDangNhap(rs.getString("TenDangNhap"));
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setTenHienThi("TenHienThi");
                tk.setMaSV(rs.getString("MaSV"));
                tk.setQuyen(rs.getString("Quyen"));
                listTK.add(tk);
                return true;
            }
        } catch (Exception e) {
            System.out.println("" + e);
            return false;
        }
        return false;
    }
    public String layMaSVDangNhap(String taiKhoan){
           String res = "";
           try{
                String query = "SELECT MaSV FROM taikhoan WHERE TenDangNhap = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, taiKhoan);
                ps.execute();
                rs = ps.executeQuery();
                while(rs.next()){
                    res = rs.getString("MaSV");
                }
           }
           catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex);
           }
           return res;
    }
    public void ThemTaiKhoan(TaiKhoan tk) {//nay la cho admin
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO TaiKhoan VALUES (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, tk.getTenDangNhap());
            ps.setString(2, tk.getMatKhau());
            ps.setString(3, tk.getTenHienThi());
            ps.setString(4, tk.getMaSV());
            ps.setString(5, tk.getQuyen());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            System.out.println("Thêm Không Thành Công !!" + e);
        }
    }
    public boolean kiemTraTaiKhoan(TaiKhoan tk) {//nay la cho admin
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM taikhoan WHERE TenDangNhap = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, tk.getTenDangNhap());
            ps.execute();
            rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getString("TenDangNhap").equals(tk.getTenDangNhap())){
                    return false;
                }
            }
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            System.out.println("Thêm Không Thành Công !!" + e);
        }
        return true;
    }
    public void suaTaiKhoan(TaiKhoan tk) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE taikhoan set MatKhau = ?,TenHienThi = ?, Quyen = ?,taikhoan.MaSV = ? WHERE taikhoan.TenDangNhap = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, tk.getMatKhau());
            ps.setString(2, tk.getTenHienThi());
            ps.setString(3, tk.getQuyen());
            ps.setString(4, tk.getMaSV());
            ps.setString(5, tk.getTenDangNhap());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public void xoaTaiKhoan(TaiKhoan tk) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM TaiKhoan WHERE TenDangNhap = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, tk.getTenDangNhap());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Xóa Không Thành Công !!" + e);
        }
    }

    public ArrayList<TaiKhoan> xuatDanhSachTaiKhoanSV() {
        listTK.clear();
        Connection conn = ConnectDB.getConnect();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM TaiKhoan";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("Quyen").equals("SinhVien")) {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setTenDangNhap(rs.getString("TenDangNhap"));
                    tk.setMatKhau(rs.getString("MatKhau"));
                    tk.setTenHienThi(rs.getString("TenHienThi"));
                    tk.setMaSV(rs.getString("MaSV"));
                    tk.setQuyen(rs.getString("Quyen"));
                    listTK.add(tk);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTK;
    }
}
