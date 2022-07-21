package com.main;

import com.event.MenuEvent;
import com.ui.ChaoJDialog;
import com.ui.DangNhapFormJDialog;
import com.ui.DoiMatKhauForm;
import com.ui.QuanLyTuyenDuongForm;
import com.ui.QuanLyTaiXeForm;
import com.ui.ShowMessage;
import com.ui.GioiThieuForm;
import com.ui.QuanLyKhachHangForm;
import com.ui.QuanLyLichTrinhForm;
import com.ui.QuanLyNhanVienForm;
import com.ui.QuanLyPhuongTienForm;
import com.ui.ThongKeForm;
import com.utils.Auth;
import com.utils.MsgBox;
import java.awt.Color;
import java.awt.Component;

public class ATBusMain extends javax.swing.JFrame {

    /**
     * Creates new form ATBusMain
     */
    public ATBusMain() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new com.component.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ATBusMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATBusMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATBusMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATBusMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATBusMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private com.component.Menu menu;
    // End of variables declaration//GEN-END:variables
    private void init() {
        this.setLocationRelativeTo(null);
        // cửa sổ chào chạy trước
        new ChaoJDialog(this, true).setVisible(true);
        // kế tiếp đến cửa sổ đăng nhập
        new DangNhapFormJDialog(this, true).setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(63, 109, 217));
        MenuEvent event = new MenuEvent() {
            @Override
            public void menuSelected(int index) {
                if (index == 0) {
                    showForm(new GioiThieuForm());
                } else if (index == 1) {
                    showForm(new QuanLyTuyenDuongForm());
                } else if (index == 2) {
                    showForm(new QuanLyLichTrinhForm());
                } else if (index == 3) {
                    showForm(new QuanLyNhanVienForm());
                } else if (index == 4) {
                    showForm(new QuanLyKhachHangForm());
                } else if (index == 5) {
                    showForm(new QuanLyPhuongTienForm());
                } else if (index == 6) {
                    showForm(new QuanLyTaiXeForm());
                } else if (index == 7) {
                    if (Auth.isManager()) {
                        showForm(new ThongKeForm());
                    } else {
                        MsgBox.alert(jPanel1, "Bạn không có quyền xem chức năng này");
                        menu.setSelected(0);
                    }

                } else if (index == 8) {
//                    showForm(new QuanLyTuyenDuong(index + ""));
                } else if (index == 9) {
                    if (Auth.isManager()) {
                        showForm(new DoiMatKhauForm());
                    } else {
                        MsgBox.alert(jPanel1, "Bạn không có quyền xem chức năng này");
                        menu.setSelected(0);
                    }

                } else if (index == 10) {
                    closeApp();
                    menu.setSelected(0);
                }
            }
        };
        menu.initMenu(event);
        menu.setSelected(0); // app khởi động sẽ chọn tab 0 làm mặc định
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }

    private void closeApp() {
        ShowMessage showMess = new ShowMessage(null, rootPaneCheckingEnabled);
        showMess.setVisible(true);
    } // đóng ứng dụng
}
