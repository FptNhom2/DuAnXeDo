package com.ui;

import com.dao.LichTrinhDAO;
import com.dao.PhuongTienDAO;
import com.dao.ThongKeDAO;
import com.dao.TuyenDuongDAO;
import com.entity.LichTrinh;
import com.entity.PhuongTien;
import com.entity.TuyenDuong;
import com.utils.FormatHelper;
import com.utils.MsgBox;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ThongKeForm extends javax.swing.JPanel {

    public ThongKeForm() {
        initComponents();
        DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
        headerCellRenderer.setBackground(new Color(192, 227, 149));
        for (int i = 0; i < tblDoanhThu.getModel().getColumnCount(); ++i) {
            tblDoanhThu.getColumnModel().getColumn(i).setHeaderRenderer(headerCellRenderer);
        }
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboThongKeTheoNam = new javax.swing.JComboBox<>();
        cboThongKeTheoThang = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTongDoanhThu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(248, 250, 254));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(192, 227, 149));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Theo năm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Theo tháng:");

        cboThongKeTheoNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm 2022", "Năm 2023" }));
        cboThongKeTheoNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboThongKeTheoNamMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboThongKeTheoNamMouseReleased(evt);
            }
        });

        cboThongKeTheoThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        cboThongKeTheoThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboThongKeTheoThangMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboThongKeTheoThangMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThongKeTheoNam, 0, 297, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboThongKeTheoThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboThongKeTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThongKeTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ Tên", "SDT", "Email", "Tổng vé"
            }
        ));
        tblKhachHang.setSelectionBackground(new java.awt.Color(35, 166, 97));
        jScrollPane2.setViewportView(tblKhachHang);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khách Hàng", jPanel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("TỔNG:");

        lblTongDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongDoanhThu.setForeground(new java.awt.Color(255, 0, 0));
        lblTongDoanhThu.setText("12.000.000VND");

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên tuyến đường", "Mã lịch trình", "Số vé", "Mã phương tiện", "Tổng doanh thu"
            }
        ));
        tblDoanhThu.setSelectionBackground(new java.awt.Color(35, 166, 97));
        jScrollPane1.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblTongDoanhThu)
                    .addGap(16, 16, 16))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblTongDoanhThu))
                    .addGap(2, 2, 2)))
        );

        jTabbedPane1.addTab("Doanh Thu", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(712, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThongKeTheoThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThongKeTheoThangMouseClicked
        // TODO add your handling code here:
//        fillTableDoanhThuThang();
    }//GEN-LAST:event_cboThongKeTheoThangMouseClicked

    private void cboThongKeTheoNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThongKeTheoNamMouseClicked
        // TODO add your handling code here:
//        fillTableDoanhThuNam();
    }//GEN-LAST:event_cboThongKeTheoNamMouseClicked

    private void cboThongKeTheoNamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThongKeTheoNamMouseReleased
        // TODO add your handling code here:
        fillTableDoanhThuNam();
    }//GEN-LAST:event_cboThongKeTheoNamMouseReleased

    private void cboThongKeTheoThangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThongKeTheoThangMouseReleased
        // TODO add your handling code here:
        fillTableDoanhThuThang();
    }//GEN-LAST:event_cboThongKeTheoThangMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboThongKeTheoNam;
    private javax.swing.JComboBox<String> cboThongKeTheoThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblKhachHang;
    // End of variables declaration//GEN-END:variables

    private LichTrinhDAO ltDao = new LichTrinhDAO();
    private TuyenDuongDAO tdDao = new TuyenDuongDAO();
    private PhuongTienDAO ptDao = new PhuongTienDAO();
    private ThongKeDAO tkDao = new ThongKeDAO();

    private void init() {
        // design giao diện
        // combobox theo năm
        cboThongKeTheoNam.setBackground(new Color(235, 235, 235)); // background
        cboThongKeTheoNam.setForeground(Color.decode("#7A8C8D"));
        cboThongKeTheoNam.setFont(new java.awt.Font("sansserif", 0, 13));
        // combobox theo tháng
        cboThongKeTheoThang.setBackground(new Color(235, 235, 235)); // background
        cboThongKeTheoThang.setForeground(Color.decode("#7A8C8D"));
        cboThongKeTheoThang.setFont(new java.awt.Font("sansserif", 0, 13));
//        fillTableThongKe();
//        fillTableDoanhThuNam();
        fillCboDoanhThuNam();
        fillCboDoanhThuThang();
        fillTableDoanhThuNam();
    }

    void fillTableDoanhThuNam() {
        LichTrinh lt = new LichTrinh();
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int nam = (Integer) cboThongKeTheoNam.getSelectedItem();
        List<Object[]> list = tkDao.getDoanhThuNam(nam);
        double tong = 0.0;
        for (Object[] row : list) {
            Object[] r = {row[0], row[1], row[2], row[3], FormatHelper.formatMoney((double) row[4])};
            model.addRow(r);
            tong += (double) row[4];
        }
        lblTongDoanhThu.setText(FormatHelper.formatMoney(tong));
    }

    void fillTableDoanhThuThang() {
        LichTrinh lt = new LichTrinh();
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int Thang = (Integer) cboThongKeTheoThang.getSelectedItem();
        int nam = (Integer) cboThongKeTheoNam.getSelectedItem();
        List<Object[]> list = tkDao.getDoanhThuThang(Thang, nam);
        double tong = 0.0;
        for (Object[] row : list) {
            Object[] r = {row[0], row[1], row[2], row[3], FormatHelper.formatMoney((double) row[4])};
            model.addRow(r);
            tong += (double) row[4];
        }
        lblTongDoanhThu.setText(FormatHelper.formatMoney(tong));

    }

    void fillCboDoanhThuNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThongKeTheoNam.getModel();
        model.removeAllElements();
        List<Integer> list = ltDao.selectYears();
        for (Integer years : list) {
            model.addElement(years);
        }
    }

    void fillCboDoanhThuThang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThongKeTheoThang.getModel();
        model.removeAllElements();
        List<Integer> lists = ltDao.selectMonth();
        for (Integer month : lists) {
            model.addElement(month);
        }
    }
}
