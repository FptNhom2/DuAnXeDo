/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ui;

/**
 *
 * @author pc
 */
public class QuanLyLichTrinhForm extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyLichTrinh
     */
    public QuanLyLichTrinhForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMaLichTrinh = new javax.swing.JLabel();
        txtMaLichTrinh = new javax.swing.JTextField();
        lblTenTuyenDuong = new javax.swing.JLabel();
        txtTenTuyenDuong = new javax.swing.JTextField();
        lblNgayXuatPhat = new javax.swing.JLabel();
        txtNgayXuatPhat = new javax.swing.JTextField();
        lblThoiGianDuKien = new javax.swing.JLabel();
        lblChiPhiBanDau = new javax.swing.JLabel();
        lblChiPhiPhatSinh = new javax.swing.JLabel();
        lblGhiChu = new javax.swing.JLabel();
        lblMaPhuongTien = new javax.swing.JLabel();
        lblTinhTrang = new javax.swing.JLabel();
        lblSoVe = new javax.swing.JLabel();
        txtThoiGianDuKien = new javax.swing.JTextField();
        txtChiPhiBanDau = new javax.swing.JTextField();
        txtChiPhiPhatSinh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        cboMaPhuongTien = new javax.swing.JComboBox<>();
        rdoChuaXuatPhat = new javax.swing.JRadioButton();
        rdoDaXuatPhat = new javax.swing.JRadioButton();
        txtSoVe = new javax.swing.JTextField();
        lblTongDoanhThu = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnTaoLichTrinh = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLichTrinh1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ LỊCH TRÌNH");
        jPanel1.add(jLabel1);

        lblMaLichTrinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMaLichTrinh.setText("Mã lịch trình:");

        txtMaLichTrinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaLichTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLichTrinhActionPerformed(evt);
            }
        });

        lblTenTuyenDuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTenTuyenDuong.setText("Tên tuyến đường:");

        txtTenTuyenDuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenTuyenDuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTuyenDuongActionPerformed(evt);
            }
        });

        lblNgayXuatPhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNgayXuatPhat.setText("Ngày xuất phát:");

        txtNgayXuatPhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayXuatPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayXuatPhatActionPerformed(evt);
            }
        });

        lblThoiGianDuKien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblThoiGianDuKien.setText("Thời gian dự kiến:");

        lblChiPhiBanDau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChiPhiBanDau.setText("Chi phí ban đầu:");

        lblChiPhiPhatSinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChiPhiPhatSinh.setText("Chi phí phát sinh:");

        lblGhiChu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGhiChu.setText("Ghi chú:");

        lblMaPhuongTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMaPhuongTien.setText("Mã phương tiện:");

        lblTinhTrang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTinhTrang.setText("Tình trạng:");

        lblSoVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSoVe.setText("Số vé:");
        lblSoVe.setToolTipText("");

        txtThoiGianDuKien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtThoiGianDuKien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThoiGianDuKienActionPerformed(evt);
            }
        });

        txtChiPhiBanDau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtChiPhiBanDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChiPhiBanDauActionPerformed(evt);
            }
        });

        txtChiPhiPhatSinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtChiPhiPhatSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChiPhiPhatSinhActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        cboMaPhuongTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboMaPhuongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdoChuaXuatPhat);
        rdoChuaXuatPhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoChuaXuatPhat.setText("Chưa xuất phát");

        buttonGroup1.add(rdoDaXuatPhat);
        rdoDaXuatPhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoDaXuatPhat.setText("Đã xuất phát");

        txtSoVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSoVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoVeActionPerformed(evt);
            }
        });

        lblTongDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongDoanhThu.setText("Tổng doanh thu:");

        lblTong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTong.setForeground(new java.awt.Color(255, 0, 0));
        lblTong.setText("Tổng");

        btnSua.setBackground(new java.awt.Color(192, 227, 149));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSua.setText("Sửa");

        btnXoa.setBackground(new java.awt.Color(192, 227, 149));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(192, 227, 149));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnTaoLichTrinh.setBackground(new java.awt.Color(192, 227, 149));
        btnTaoLichTrinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTaoLichTrinh.setText("Tạo lịch trình");

        tblLichTrinh1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Lịch Trình", "Tên Tuyến Đường", "Ngày Xuất Phát", "Thời Gian Dự Kiến", "Chi Phí Ban Đầu", "Chi Phí Phát Sinh", "Ghi Chú", "Mã Phương Tiện", "Tình Trạng", "Số Vé", "Tổng Doanh Thu"
            }
        ));
        jScrollPane3.setViewportView(tblLichTrinh1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaoLichTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGhiChu)
                                    .addComponent(lblChiPhiBanDau)
                                    .addComponent(lblMaLichTrinh)
                                    .addComponent(lblSoVe)
                                    .addComponent(lblNgayXuatPhat))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoVe)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtMaLichTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayXuatPhat)
                                    .addComponent(txtChiPhiBanDau, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(171, 171, 171)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTenTuyenDuong)
                                    .addComponent(lblThoiGianDuKien)
                                    .addComponent(lblChiPhiPhatSinh)
                                    .addComponent(lblTinhTrang)
                                    .addComponent(lblMaPhuongTien)
                                    .addComponent(lblTongDoanhThu))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdoChuaXuatPhat)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoDaXuatPhat))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenTuyenDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtChiPhiPhatSinh)
                                        .addComponent(txtThoiGianDuKien)
                                        .addComponent(cboMaPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTong))
                                .addGap(0, 70, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTenTuyenDuong)
                                .addGap(18, 18, 18)
                                .addComponent(lblThoiGianDuKien)
                                .addGap(18, 18, 18)
                                .addComponent(lblChiPhiPhatSinh))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTenTuyenDuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtThoiGianDuKien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtChiPhiPhatSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboMaPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaPhuongTien))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTinhTrang)
                            .addComponent(rdoChuaXuatPhat)
                            .addComponent(rdoDaXuatPhat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaLichTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaLichTrinh))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayXuatPhat)
                            .addComponent(txtNgayXuatPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChiPhiBanDau)
                            .addComponent(txtChiPhiBanDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGhiChu)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoVe)
                            .addComponent(lblTongDoanhThu)
                            .addComponent(lblTong))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTaoLichTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtChiPhiPhatSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChiPhiPhatSinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChiPhiPhatSinhActionPerformed

    private void txtChiPhiBanDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChiPhiBanDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChiPhiBanDauActionPerformed

    private void txtThoiGianDuKienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThoiGianDuKienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThoiGianDuKienActionPerformed

    private void txtNgayXuatPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayXuatPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayXuatPhatActionPerformed

    private void txtTenTuyenDuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTuyenDuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTuyenDuongActionPerformed

    private void txtMaLichTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLichTrinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLichTrinhActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtSoVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoVeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoLichTrinh;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboMaPhuongTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChiPhiBanDau;
    private javax.swing.JLabel lblChiPhiPhatSinh;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblMaLichTrinh;
    private javax.swing.JLabel lblMaPhuongTien;
    private javax.swing.JLabel lblNgayXuatPhat;
    private javax.swing.JLabel lblSoVe;
    private javax.swing.JLabel lblTenTuyenDuong;
    private javax.swing.JLabel lblThoiGianDuKien;
    private javax.swing.JLabel lblTinhTrang;
    private javax.swing.JLabel lblTong;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JRadioButton rdoChuaXuatPhat;
    private javax.swing.JRadioButton rdoDaXuatPhat;
    private javax.swing.JTable tblLichTrinh1;
    private javax.swing.JTextField txtChiPhiBanDau;
    private javax.swing.JTextField txtChiPhiPhatSinh;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtMaLichTrinh;
    private javax.swing.JTextField txtNgayXuatPhat;
    private javax.swing.JTextField txtSoVe;
    private javax.swing.JTextField txtTenTuyenDuong;
    private javax.swing.JTextField txtThoiGianDuKien;
    // End of variables declaration//GEN-END:variables
}