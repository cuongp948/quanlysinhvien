/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import qlysinhvien.JF_Admin;
import qlysinhvien.Khoa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlysinhvien.QlyKhoa;

/**
 *
 * @author Administrator
 */
public class JF_QuanLyKhoa extends javax.swing.JFrame {

    /**
     * Creates new form JF_Khoa
     */
    QlyKhoa listKhoa = new QlyKhoa();

    public JF_QuanLyKhoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaKhoa = new javax.swing.JTextField();
        txtTenKhoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_info = new javax.swing.JTable();
        btnHienThi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Mã khoa");

        jLabel2.setText("Tên khoa");

        btnThem.setBackground(java.awt.SystemColor.textHighlight);
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(java.awt.SystemColor.textHighlight);
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(java.awt.SystemColor.textHighlight);
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khoa", "Tên khoa"
            }
        ));
        table_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_infoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_info);

        btnHienThi.setBackground(java.awt.SystemColor.textHighlight);
        btnHienThi.setForeground(new java.awt.Color(255, 255, 255));
        btnHienThi.setText("Hiển thị");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(java.awt.SystemColor.textHighlight);
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThem))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSua)
                                    .addGap(46, 46, 46)
                                    .addComponent(btnXoa)
                                    .addGap(38, 38, 38)
                                    .addComponent(btnHienThi))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(txtMaKhoa))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnHienThi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Boolean ketQua = true;
        DefaultTableModel model = (DefaultTableModel) table_info.getModel();
        try {
            Khoa kh = new Khoa(txtMaKhoa.getText(), txtTenKhoa.getText());
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).equals(txtMaKhoa.getText())) {
                    ketQua = false;
                    break;
                }
            }
            if (ketQua == false) {
                JOptionPane.showMessageDialog(this, "Trùng Mã Khoa");
            } else {
                listKhoa.ThemKhoa(kh);
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        if (btnSua.getText() == "Sửa") {
            txtMaKhoa.setEnabled(false);
               btnSua.setText("Hủy Chế Độ Sửa");
        } else {
            if (table_info.getSelectedRowCount() > 0) {
                Khoa kh;
                try {
                    kh = new Khoa(txtMaKhoa.getText(), txtTenKhoa.getText());
                    listKhoa.suaKhoa(kh);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
                txtMaKhoa.setEnabled(true);
                btnSua.setText("Sửa");
            } else {
                JOptionPane.showMessageDialog(this, "Hãy chọn một bảng !");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void table_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_infoMouseClicked

        int row = table_info.getSelectedRow();
        String[] array = new String[]{
            table_info.getValueAt(row, 0).toString(), table_info.getValueAt(row, 1).toString()
        };
        txtMaKhoa.setText(array[0]);
        txtTenKhoa.setText(array[1]);
    }//GEN-LAST:event_table_infoMouseClicked

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed

        hienThi();
    }//GEN-LAST:event_btnHienThiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        DefaultTableModel dtmodel = (DefaultTableModel) table_info.getModel();
        if (btnXoa.getText() == "Xóa") {
            txtMaKhoa.setEnabled(false);
            btnXoa.setText("Hủy Chế Độ Xóa");
        } else {
            if (table_info.getSelectedRowCount() > 0) {
                Khoa kh;
                try {
                    int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ? ", "Hộp Thoại", JOptionPane.YES_NO_OPTION);
                    if (r == JOptionPane.YES_OPTION) {
                        kh = new Khoa(txtMaKhoa.getText(), txtTenKhoa.getText());
                        listKhoa.xoaKhoa(kh);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtMaKhoa.setEnabled(true);
                btnXoa.setText("Xóa");
            } else {
                JOptionPane.showMessageDialog(this, "Hãy chọn một bảng !");
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        JF_Admin jfad = new JF_Admin();
        jfad.show();
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listKhoa.hienThiList();
    }//GEN-LAST:event_formWindowOpened

    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) table_info.getModel();
        listKhoa.hienThiList();
        model.setRowCount(0);
        table_info.clearSelection();
        for (Khoa khoa : listKhoa.list) {
            String[] array = new String[]{khoa.getMaKhoa(), khoa.getTenKhoa()};
            model.addRow(array);
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
            java.util.logging.Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_QuanLyKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_info;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtTenKhoa;
    // End of variables declaration//GEN-END:variables
}
