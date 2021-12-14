/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import qlysinhvien.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class QLySinhVien {

    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;

    public void themSinhVien(SinhVien sv) {
        try {
            con = ConnectDB.getConnect();
            String sql = "INSERT INTO sinhvien VALUES (?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getNgaySinh());
            ps.setString(4, sv.getGioiTinh());
            ps.setString(5, sv.getNoiSinh());
            ps.setString(6, sv.getDiaChi());
            ps.setString(7, sv.getQuan());
            ps.setString(8, sv.getMaKhoa());
            ps.setInt(9, sv.getHocBong());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm Không Thành Công !!" + e);
        }
    }

    public void suaSinhVien(SinhVien sv) {
        try {
            con = ConnectDB.getConnect();
            String sql = "UPDATE sinhvien set TenSV = ? , NgaySinh = ? , GioiTinh = ?, NoiSinh = ?,DiaChi = ?,Quan = ?,MaKhoa = ?,HocBong = ? "
                    + "WHERE MaSV = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getNgaySinh());
            ps.setString(3, sv.getGioiTinh());
            ps.setString(4, sv.getNoiSinh());
            ps.setString(5, sv.getDiaChi());
            ps.setString(6, sv.getQuan());

            ps.setString(7, sv.getMaKhoa());
            ps.setInt(8, sv.getHocBong());
            ps.setString(9, sv.getMaSV());

            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public void xoaSinhVien(SinhVien sv) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM sinhvien WHERE MaSV = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Xóa Không Thành Công !!" + e);
        }
    }

    public ArrayList<SinhVien> hienThiList() {
        list.clear();
        Connection conn = ConnectDB.getConnect();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM sinhvien";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoTen(rs.getString("TenSV"));
                sv.setNgaySinh(rs.getString("NgaySinh"));
                sv.setGioiTinh(rs.getString("GioiTinh"));
                sv.setNoiSinh(rs.getString("NoiSinh"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setQuan(rs.getString("Quan"));
                sv.setMaKhoa(rs.getString("MaKhoa"));
                sv.setHocBong(rs.getInt("HocBong"));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean timKiem(String maSinhVien) {
        list.clear();
        Connection conn = ConnectDB.getConnect();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM sinhvien WHERE MaSV = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, maSinhVien);
            rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoTen(rs.getString("TenSV"));
                sv.setNgaySinh(rs.getString("NgaySinh"));
                sv.setGioiTinh(rs.getString("GioiTinh"));
                sv.setNoiSinh(rs.getString("NoiSinh"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setQuan(rs.getString("Quan"));
                sv.setMaKhoa(rs.getString("MaKhoa"));
                sv.setHocBong(rs.getInt("HocBong"));
                list.add(sv);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy !" + e);
        }
        return false;
    }

    public void sapXep() {

    }
}
