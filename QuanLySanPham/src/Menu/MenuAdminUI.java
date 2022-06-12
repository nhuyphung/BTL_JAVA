/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import DangNhap.DangNhapUI;
import QuanLiDanhMuc.QuanLyDanhMucUI;
import QuanLiNhanVien.QuanLyNhanVienUI;
import QuanLiSanPham.QuanLySanPhamUI;
import ThongKe.ThongKeUI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MD-03092021 Check point
 */
public class MenuAdminUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdminUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnQLNV = new javax.swing.JButton();
        btnQLSP = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnQLDM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MỜI BẠN CHỌN CHỨC NĂNG");

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/logout.png"))); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(btnDangXuat)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnQLNV.setBackground(new java.awt.Color(188, 210, 112));
        btnQLNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLNV.setText("QUẢN LÍ NHÂN VIÊN");
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });

        btnQLSP.setBackground(new java.awt.Color(188, 210, 112));
        btnQLSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLSP.setText("QUẢN LÍ SẢN PHẨM");
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(188, 210, 112));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnQLDM.setBackground(new java.awt.Color(188, 210, 112));
        btnQLDM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLDM.setText("QUẢN LÍ DANH MỤC");
        btnQLDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLDM, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLDM, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        // TODO add your handling code here:
        QuanLySanPhamUI QLSP = new QuanLySanPhamUI();
        QLSP.setVisible(true);
        QLSP.pack();
        this.dispose();

    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnQLDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDMActionPerformed
        // TODO add your handling code here:
        QuanLyDanhMucUI QLDM = new QuanLyDanhMucUI();
        QLDM.setVisible(true);
        QLDM.pack();
        this.dispose();
    }//GEN-LAST:event_btnQLDMActionPerformed

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        try {
            // TODO add your handling code here:
            QuanLyNhanVienUI QLNV = new QuanLyNhanVienUI();
            QLNV.setVisible(true);
            QLNV.pack();
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        try {
            DangNhapUI dangNhapUI = new DangNhapUI();
            dangNhapUI.setVisible(true);
            dangNhapUI.pack();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        try {
            // TODO add your handling code here:
            ThongKeUI ThongKe=new ThongKeUI();
            ThongKe.setVisible(true);
            ThongKe.pack();
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnThongKeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnQLDM;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
