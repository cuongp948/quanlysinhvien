/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import qlysinhvien.MonHoc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class QLyMonHoc 
{
    ArrayList<MonHoc>listMh = new ArrayList<>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;
    public void themMonHoc(MonHoc mh) 
    {
        try {
            con = ConnectDB.getConnect();
            String sql = "INSERT INTO monhoc VALUES (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, mh.getMaMonHoc());
            ps.setString(2, mh.getTenMonHoc());  
            ps.setInt(3,mh.getSoTiet());
            ps.execute();
              JOptionPane.showMessageDialog(null,"Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Thêm Không Thành Công !!" + e);
        }
    }

    public void suaMonHoc(MonHoc mh) {
        try {
            con = ConnectDB.getConnect();
            String sql = "UPDATE monhoc set TenMonHoc = ? , SoTiet = ? " 
                    +"WHERE MaMonHoc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, mh.getTenMonHoc());
            ps.setInt(2, mh.getSoTiet());
            ps.setString(3,mh.getMaMonHoc());
            ps.execute();
             JOptionPane.showMessageDialog(null,"Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public void xoaMonHoc(MonHoc mh) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM monhoc WHERE MaMonHoc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, mh.getMaMonHoc());
            ps.execute();
             JOptionPane.showMessageDialog(null,"Đã xoá");
        } catch (Exception e) {
            System.out.println("Xóa Không Thành Công !!" + e);
        }
    }

    public ArrayList<MonHoc> hienThiList() {
        listMh.clear();
        Connection conn = ConnectDB.getConnect();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM monhoc";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {             
                    MonHoc mh = new MonHoc();
                    mh.setMaMonHoc(rs.getString("MaMonHoc"));
                    mh.setTenMonHoc(rs.getString("TenMonHoc"));  
                    mh.setSoTiet(rs.getInt("SoTiet"));
                    listMh.add(mh);              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMh;
    }
    public boolean timKiem(String maMonHoc){
        listMh.clear();
        Connection conn = ConnectDB.getConnect();      
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM monhoc WHERE MaMonHoc = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,maMonHoc);
            rs = ps.executeQuery();
            while (rs.next()) 
            {                                                 
                    MonHoc mh = new MonHoc();
                    mh.setMaMonHoc(rs.getString("MaMonHoc"));
                    mh.setTenMonHoc(rs.getString("TenMonHoc"));  
                    mh.setSoTiet(rs.getInt("SoTiet"));
                    listMh.add(mh);
                    return true;                   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Không tìm thấy !"+e);
        }
        return false;
    } 
}
