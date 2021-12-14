/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.util.logging.Level;
import java.util.logging.Logger;
import qlysinhvien.MonHoc;
import qlysinhvien.KetQua;
import qlysinhvien.SinhVien;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlysinhvien.QLyKetQua;
import qlysinhvien.QLyMonHoc;
import qlysinhvien.QLySinhVien;

/**
 *
 * @author Administrator
 */
public class JF_KetQua extends javax.swing.JFrame {

    QLyKetQua listKQ = new QLyKetQua();
    QLyMonHoc listMH = new QLyMonHoc();
    
    /**
     * Creates new form JF_KetQua
     */
    public JF_KetQua() {
        initComponents();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboMSV = new javax.swing.JComboBox<>();
        cboMaMonHoc = new javax.swing.JComboBox<>();
        txtDiem = new javax.swing.JTextField();
        btnGhiDiem = new javax.swing.JButton();
        btnSuaDiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_info = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnXoaDiem = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("KẾT QUẢ");

        jLabel2.setText("Mã sinh viên");

        jLabel3.setText("Mã môn học");

        jLabel4.setText("Điểm");

        btnGhiDiem.setText("Ghi điểm");
        btnGhiDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiDiemActionPerformed(evt);
            }
        });

        btnSuaDiem.setText("Sửa điểm");
        btnSuaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDiemActionPerformed(evt);
            }
        });

        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Mã môn học", "Điểm"
            }
        ));
        jScrollPane1.setViewportView(table_info);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXoaDiem.setText("Xóa Điểm");
        btnXoaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDiemActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm Theo Mã Sinh Viên");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnHienThi.setText("Hiển thị ");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnThoat)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(btnGhiDiem))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboMaMonHoc, 0, 257, Short.MAX_VALUE)
                                            .addComponent(cboMSV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDiem)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSuaDiem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnXoaDiem)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHienThi)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cboMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboMaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhiDiem)
                    .addComponent(btnSuaDiem)
                    .addComponent(btnXoaDiem)
                    .addComponent(btnTimKiem)
                    .addComponent(btnHienThi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        listMH.hienThiList();
        QLySinhVien listSV = new QLySinhVien();
        QLyMonHoc listMH = new QLyMonHoc();
        listSV.hienThiList();
        listMH.hienThiList();
        for (SinhVien sv : listSV.list) {
            cboMSV.addItem(sv.getMaSV());
        }
        for (MonHoc mh : listMH.listMh) {
            cboMaMonHoc.addItem(mh.getTenMonHoc());
        }
        hienThi();
    }//GEN-LAST:event_formWindowOpened

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        JF_Admin jfad = new JF_Admin();
        jfad.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDiemActionPerformed
       DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        if (btnXoaDiem.getText() == "Xóa") {
            cboMaMonHoc.setEnabled(false);
            btnXoaDiem.setText("Hủy Chế Độ Xóa");
        } else {
            if (table_info.getSelectedRowCount() > 0) {
                KetQua kq;
                try {
                    int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ? ", "Hộp Thoại", JOptionPane.YES_NO_OPTION);
                    if (r == JOptionPane.YES_OPTION) 
                    {
                        kq = new KetQua(cboMSV.getSelectedItem().toString()
                                ,cboMaMonHoc.getSelectedItem().toString(),Float.parseFloat(txtDiem.getText()));
                        listKQ.xoaKetQua(kq);
                           hienThi();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                cboMaMonHoc.setEnabled(true);
                btnXoaDiem.setText("Xóa");
            } else {
                JOptionPane.showMessageDialog(this, "Hãy chọn một bảng !");
            }
        }
    }//GEN-LAST:event_btnXoaDiemActionPerformed

    private void btnGhiDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiDiemActionPerformed
       
        DefaultTableModel tbmodel = (DefaultTableModel)table_info.getModel();
        Boolean ketQua = true;
        KetQua kq = new KetQua();
        kq.setMaSV(cboMSV.getSelectedItem().toString());
        String maMH = listKQ.layMaMH(cboMaMonHoc.getSelectedItem().toString());
        kq.setMaMonHoc(maMH);
        kq.setDiem(Float.parseFloat(txtDiem.getText()));      
        for (int i = 0; i < tbmodel.getRowCount(); i++) 
        {           
            if(tbmodel.getValueAt(i, 1).equals(maMH))
            {
                ketQua = false;
                break;
            }
        }
        if(ketQua == false)
        {
            JOptionPane.showMessageDialog(this,"Trùng Mã Môn Học");
        }
        else 
        {
            listKQ.themKetQua(kq);
            hienThi();
        }
    }//GEN-LAST:event_btnGhiDiemActionPerformed

    private void btnSuaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDiemActionPerformed
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        if (btnSuaDiem.getText() == "Sửa") {
            cboMaMonHoc.setEnabled(false);
            btnSuaDiem.setText("Hủy Chế Độ Sửa");
        } else {
            if (table_info.getSelectedRowCount() > 0) {
                KetQua kq;
                try {
                    kq = new KetQua(cboMSV.getSelectedItem().toString()
                            ,cboMaMonHoc.getSelectedItem().toString(),Float.parseFloat(txtDiem.getText()));
                    listKQ.suaKetQua(kq);
                       hienThi();
                } catch (Exception ex) {
                    Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                cboMaMonHoc.setEnabled(true);
                btnSuaDiem.setText("Sửa");
            } else {
                JOptionPane.showMessageDialog(this, "Hãy chọn một bảng !");
            }
        }
    }//GEN-LAST:event_btnSuaDiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
       DefaultTableModel dtmodel = (DefaultTableModel)table_info.getModel();
       if(listKQ.timKiem(cboMSV.getSelectedItem().toString()) == false)
       {
           JOptionPane.showMessageDialog(this,"Không tìm thấy !");
       }
       else
       {
           for (KetQua kq : listKQ.list) 
           {
               String [] arr = new String[]{kq.getMaSV(),kq.getMaMonHoc(),String.valueOf(kq.getDiem())};
               dtmodel.addRow(arr);
           }
       }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnHienThiActionPerformed
   
    public void hienThi() {
        DefaultTableModel modelTable = (DefaultTableModel) table_info.getModel();       
        modelTable.setRowCount(0);
        listKQ.hienThiList();
        try {
            //SinhVien sv1 = new SinhVien(txt_maSV.getText(),txt_hoTen.getText(),txt_Lop.getText());
            String[] array = new String[]{};
            for (KetQua kq : listKQ.list) {
                array = new String[]{
                    kq.getMaSV(), kq.getMaMonHoc(), String.valueOf(kq.getDiem())
                };
                modelTable.addRow(array);
            }
        } catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(this,""+ex);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhiDiem;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSuaDiem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaDiem;
    private javax.swing.JComboBox<String> cboMSV;
    private javax.swing.JComboBox<String> cboMaMonHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_info;
    private javax.swing.JTextField txtDiem;
    // End of variables declaration//GEN-END:variables
}
