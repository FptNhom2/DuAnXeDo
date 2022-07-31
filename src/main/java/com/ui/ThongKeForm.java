package com.ui;

import com.dao.LichTrinhDAO;
import com.dao.PhuongTienDAO;
import com.dao.ThongKeDAO;
import com.dao.TuyenDuongDAO;
import com.entity.LichTrinh;
import com.entity.PhuongTien;
import com.entity.TuyenDuong;
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
        headerCellRenderer.setBackground(new Color(192,227,149));
        for(int i = 0; i < tblThongKe.getModel().getColumnCount(); ++i)
        {
            tblThongKe.getColumnModel().getColumn(i).setHeaderRenderer(headerCellRenderer);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
        });

        cboThongKeTheoThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        cboThongKeTheoThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboThongKeTheoThangMouseClicked(evt);
            }
        });

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên tuyến đường", "Mã lịch trình", "Số vé", "Mã phương tiện", "Tổng doanh thu"
            }
        ));
        tblThongKe.setSelectionBackground(new java.awt.Color(35, 166, 97));
        jScrollPane1.setViewportView(tblThongKe);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("TỔNG:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("12.000.000VND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboThongKeTheoNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboThongKeTheoThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 25, Short.MAX_VALUE)))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThongKeTheoThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThongKeTheoThangMouseClicked
        // TODO add your handling code here:
        fillCboDoanhThuThang();
    }//GEN-LAST:event_cboThongKeTheoThangMouseClicked

    private void cboThongKeTheoNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThongKeTheoNamMouseClicked
        // TODO add your handling code here:
        fillTableDoanhThuNam();
    }//GEN-LAST:event_cboThongKeTheoNamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboThongKeTheoNam;
    private javax.swing.JComboBox<String> cboThongKeTheoThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblThongKe;
    // End of variables declaration//GEN-END:variables
    
    private LichTrinhDAO ltDao = new LichTrinhDAO();
    private TuyenDuongDAO tdDao = new TuyenDuongDAO();
    private PhuongTienDAO ptDao = new PhuongTienDAO();
    private ThongKeDAO tkDao = new ThongKeDAO();
    
    
    private void init() {
        // design giao diện
        // combobox theo năm
        cboThongKeTheoNam.setBackground(new Color(235,235,235)); // background
        cboThongKeTheoNam.setForeground(Color.decode("#7A8C8D"));
        cboThongKeTheoNam.setFont(new java.awt.Font("sansserif", 0, 13));
        // combobox theo tháng
        cboThongKeTheoThang.setBackground(new Color(235,235,235)); // background
        cboThongKeTheoThang.setForeground(Color.decode("#7A8C8D"));
        cboThongKeTheoThang.setFont(new java.awt.Font("sansserif", 0, 13));
//        fillTableThongKe();
        
        fillCboDoanhThuNam();
        fillCboDoanhThuThang();
//        fillTableDoanhThuNam();
//        fillTableDoanhThuThang();
    }
    
//    void fillTableThongKe(){
//       DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
//        model.setRowCount(0);
//        try {
//
//            List<LichTrinh> list = ltDao.selectAll();
//            for (LichTrinh lt : list) {
//                PhuongTien pt = ptDao.selectById(lt.getMaPT());
//                TuyenDuong td = tdDao.selectById(lt.getMaTD());
//                Object[] row = {td.getTenTD(), lt.getMaLT(), lt.getTongVe(), pt.getBangXoSe(), lt.getTongDoanhThu(),
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            MsgBox.alert(this, "Loi truy van du lieu");
//            e.printStackTrace();
//        } 
//    }
    
    void fillTableDoanhThuNam(){
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        int nam = (Integer) cboThongKeTheoNam.getSelectedItem();
        List<Object[]> list = tkDao.getDoanhThuNam(nam);
        for (Object[] row : list) {
            model.addRow(row);
        } 
    }
    void fillTableDoanhThuThang(){
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        int Thang = (Integer) cboThongKeTheoNam.getSelectedItem();
        List<Object[]> list = tkDao.getDoanhThuNam(Thang);
        for (Object[] row : list) {
            model.addRow(row);
        } 
    }
    
    void fillCboDoanhThuNam(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThongKeTheoNam.getModel();
        model.removeAllElements();
        List<Integer> list=ltDao.selectYears();
        for(Integer years: list){
            model.addElement(years);
        }
    }
    
    void fillCboDoanhThuThang(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThongKeTheoThang.getModel();
        model.removeAllElements();
        List<Integer> lists=ltDao.selectMonth();
        for(Integer month: lists){
            model.addElement(month);
        }
    }
}
