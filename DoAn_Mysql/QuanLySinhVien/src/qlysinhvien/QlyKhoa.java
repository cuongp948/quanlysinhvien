/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;


import qlysinhvien.Khoa;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class QlyKhoa {

    ArrayList<Khoa> list = new ArrayList<Khoa>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;

    public void ThemKhoa(Khoa kh) {
        try {
            con = ConnectDB.getConnect();
            String sql = "INSERT INTO khoa VALUES (?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, kh.getMaKhoa());
            ps.setString(2, kh.getTenKhoa());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm Không Thành Công !!" + e);
        }
    }

    public String layMaKhoa(String tenKhoa) {
        String res = "";
        try {
            con = ConnectDB.getConnect();
            String query = "SELECT MaKhoa FROM khoa WHERE TenKhoa = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, tenKhoa);
            ps.execute();
            rs = ps.executeQuery();
            while (rs.next()) {
                res = rs.getString("MaKhoa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }
    public String layTenKhoa(String maKhoa) {
        String res = "";
        try {
            con = ConnectDB.getConnect();
            String query = "SELECT TenKhoa FROM khoa WHERE MaKhoa = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, maKhoa);
            ps.execute();
            rs = ps.executeQuery();
            while (rs.next()) {
                res = rs.getString("TenKhoa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }

    public void suaKhoa(Khoa kh) {
        try {
            con = ConnectDB.getConnect();
            String sql = "UPDATE khoa set TenKhoa = ?"
                    + "WHERE MaKhoa = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, kh.getTenKhoa());
            ps.setString(2, kh.getMaKhoa());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public void xoaKhoa(Khoa kh) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM khoa WHERE MaKhoa = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, kh.getMaKhoa());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            System.out.println("Xóa Không Thành Công !!" + e);
        }
    }

    public ArrayList<Khoa> hienThiList() {
        list.clear();
        Connection conn = ConnectDB.getConnect();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM khoa";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Khoa kh = new Khoa();
                kh.setMaKhoa(rs.getString("MaKhoa"));
                kh.setTenKhoa(rs.getString("TenKhoa"));
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean timKiem(Khoa kh) {
        for (Khoa khoa : list) {
            if (khoa.getMaKhoa().equals(kh.getMaKhoa())) {
                return true;
            }
        }
        return false;
    }
}
