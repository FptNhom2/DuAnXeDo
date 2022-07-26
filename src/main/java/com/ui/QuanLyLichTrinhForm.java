package com.ui;

import com.utils.MsgBox;
import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;

public class QuanLyLichTrinhForm extends javax.swing.JPanel {

    public QuanLyLichTrinhForm() {
        initComponents();
        DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
        headerCellRenderer.setBackground(new Color(192,227,149));
        for(int i = 0; i < tblLichTrinh.getModel().getColumnCount(); ++i)
        {
            tblLichTrinh.getColumnModel().getColumn(i).setHeaderRenderer(headerCellRenderer);
        }
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelBorderForGioiThieuForm1 = new com.ui.PanelBorderForGioiThieuForm();
        jLabel2 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaLichTrinh = new javax.swing.JTextField();
        panelBorderForGioiThieuForm2 = new com.ui.PanelBorderForGioiThieuForm();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cboMaLichTrinh = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panelBorderForGioiThieuForm4 = new com.ui.PanelBorderForGioiThieuForm();
        jLabel26 = new javax.swing.JLabel();
        btnGiamSoLuongVeDat = new javax.swing.JButton();
        lblSoLuongVe = new javax.swing.JLabel();
        btnTangSoLuongVeDat = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtTimKiemNgayKhoiHanh = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLichTrinh = new javax.swing.JTable();

        setBackground(new java.awt.Color(248, 250, 254));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(192, 227, 149));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LỊCH TRÌNH");

        panelBorderForGioiThieuForm1.setBackground(new java.awt.Color(248, 250, 254));
        panelBorderForGioiThieuForm1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(192, 227, 149))); // NOI18N

        jLabel2.setText("Mã khách hàng:");

        jLabel3.setText("Họ và tên:");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Email:");

        jLabel6.setText("Mã lịch trình:");

        javax.swing.GroupLayout panelBorderForGioiThieuForm1Layout = new javax.swing.GroupLayout(panelBorderForGioiThieuForm1);
        panelBorderForGioiThieuForm1.setLayout(panelBorderForGioiThieuForm1Layout);
        panelBorderForGioiThieuForm1Layout.setHorizontalGroup(
            panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaKhachHang)
                    .addComponent(txtHoVaTen)
                    .addComponent(txtSoDienThoai)
                    .addComponent(txtEmail)
                    .addComponent(txtMaLichTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorderForGioiThieuForm1Layout.setVerticalGroup(
            panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaLichTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorderForGioiThieuForm2.setBackground(new java.awt.Color(248, 250, 254));
        panelBorderForGioiThieuForm2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin lịch trình", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(192, 227, 149))); // NOI18N

        jLabel7.setText("Mã lịch trình:");

        jLabel9.setText("Tên tuyến:");

        jLabel10.setText("Tên tuyến");

        jLabel11.setText("Tên miền:");

        jLabel12.setText("Nam");

        jLabel13.setText("Mã nhân viên:");

        jLabel14.setText("Người tạo lịch trình");

        jLabel15.setText("Bảng số xe:");

        jLabel16.setText("mặc định");

        jLabel17.setText("Thời gian dự kiến:");

        jLabel18.setText("deadline bán vé");

        jLabel19.setText("Ngày xuất phát:");

        jLabel21.setText("Chi phí lịch trình:");

        jLabel22.setText("Ngày - tháng - năm");

        cboMaLichTrinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("mặc định");

        jLabel20.setText("Giá");

        jLabel23.setText("250000");

        jLabel24.setText("Tình trạng vé:");

        jLabel25.setText("còn 30 vé");

        javax.swing.GroupLayout panelBorderForGioiThieuForm2Layout = new javax.swing.GroupLayout(panelBorderForGioiThieuForm2);
        panelBorderForGioiThieuForm2.setLayout(panelBorderForGioiThieuForm2Layout);
        panelBorderForGioiThieuForm2Layout.setHorizontalGroup(
            panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMaLichTrinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorderForGioiThieuForm2Layout.setVerticalGroup(
            panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMaLichTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelBorderForGioiThieuForm4.setBackground(new java.awt.Color(248, 250, 254));
        panelBorderForGioiThieuForm4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đặt vé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(192, 227, 149))); // NOI18N

        jLabel26.setText("Số lượng vé:");

        btnGiamSoLuongVeDat.setBackground(new java.awt.Color(255, 255, 255));
        btnGiamSoLuongVeDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/subtract.png"))); // NOI18N
        btnGiamSoLuongVeDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamSoLuongVeDatActionPerformed(evt);
            }
        });

        lblSoLuongVe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSoLuongVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuongVe.setText("0");

        btnTangSoLuongVeDat.setBackground(new java.awt.Color(255, 255, 255));
        btnTangSoLuongVeDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnTangSoLuongVeDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangSoLuongVeDatActionPerformed(evt);
            }
        });

        jLabel28.setText("Thành tiền:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("0 VND");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order_ticket.png"))); // NOI18N
        jButton3.setText("Đặt vé");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton4.setText("Hủy vé");

        javax.swing.GroupLayout panelBorderForGioiThieuForm4Layout = new javax.swing.GroupLayout(panelBorderForGioiThieuForm4);
        panelBorderForGioiThieuForm4.setLayout(panelBorderForGioiThieuForm4Layout);
        panelBorderForGioiThieuForm4Layout.setHorizontalGroup(
            panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                        .addGroup(panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                                .addComponent(btnGiamSoLuongVeDat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSoLuongVe, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTangSoLuongVeDat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        panelBorderForGioiThieuForm4Layout.setVerticalGroup(
            panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGiamSoLuongVeDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTangSoLuongVeDat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuongVe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButton5.setText("Sửa thông tin vé");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        jButton6.setText("In vé");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel30.setText("Tìm kiếm ngày khởi hành:");

        tblLichTrinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch trình", "Tên tuyến", "Bảng số xe", "Mã nhân viên", "Ngày xuất phát", "Thời gian dự kiến", "Chi phí lịch trình", "Tổng doanh thu"
            }
        ));
        tblLichTrinh.setSelectionBackground(new java.awt.Color(35, 166, 97));
        jScrollPane2.setViewportView(tblLichTrinh);
        if (tblLichTrinh.getColumnModel().getColumnCount() > 0) {
            tblLichTrinh.getColumnModel().getColumn(7).setHeaderValue("Tổng doanh thu");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTimKiemNgayKhoiHanh))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelBorderForGioiThieuForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelBorderForGioiThieuForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelBorderForGioiThieuForm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelBorderForGioiThieuForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorderForGioiThieuForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorderForGioiThieuForm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTimKiemNgayKhoiHanh)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiamSoLuongVeDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamSoLuongVeDatActionPerformed
        giamSoLuongVeDat();
    }//GEN-LAST:event_btnGiamSoLuongVeDatActionPerformed

    private void btnTangSoLuongVeDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangSoLuongVeDatActionPerformed
        tangSoLuongVeDat();
    }//GEN-LAST:event_btnTangSoLuongVeDatActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        try {
//            
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiamSoLuongVeDat;
    private javax.swing.JButton btnTangSoLuongVeDat;
    private javax.swing.JComboBox<String> cboMaLichTrinh;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSoLuongVe;
    private com.ui.PanelBorderForGioiThieuForm panelBorderForGioiThieuForm1;
    private com.ui.PanelBorderForGioiThieuForm panelBorderForGioiThieuForm2;
    private com.ui.PanelBorderForGioiThieuForm panelBorderForGioiThieuForm4;
    private javax.swing.JTable tblLichTrinh;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaLichTrinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTimKiemNgayKhoiHanh;
    // End of variables declaration//GEN-END:variables
    private void init(){
        // design giao diện
        // combo Mã lịch trình
        cboMaLichTrinh.setBackground(new Color(235,235,235)); // background
        cboMaLichTrinh.setForeground(Color.decode("#7A8C8D"));
        cboMaLichTrinh.setFont(new java.awt.Font("sansserif", 0, 13));
        // textField Mã khách hàng
        txtMaKhachHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtMaKhachHang.setBackground(new Color(192,227,149)); // background
        txtMaKhachHang.setForeground(Color.decode("#7A8C8D"));
        txtMaKhachHang.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtMaKhachHang.setSelectionColor(new Color(75, 175, 152));
        // textField Họ và tên
        txtHoVaTen.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtHoVaTen.setBackground(new Color(192,227,149)); // background
        txtHoVaTen.setForeground(Color.decode("#7A8C8D"));
        txtHoVaTen.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtHoVaTen.setSelectionColor(new Color(75, 175, 152));
        // textField Số điện thoại
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtSoDienThoai.setBackground(new Color(192,227,149)); // background
        txtSoDienThoai.setForeground(Color.decode("#7A8C8D"));
        txtSoDienThoai.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtSoDienThoai.setSelectionColor(new Color(75, 175, 152));
        // textField Email
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtEmail.setBackground(new Color(192,227,149)); // background
        txtEmail.setForeground(Color.decode("#7A8C8D"));
        txtEmail.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtEmail.setSelectionColor(new Color(75, 175, 152));
        // textField Mã lịch trình
        txtMaLichTrinh.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtMaLichTrinh.setBackground(new Color(192,227,149)); // background
        txtMaLichTrinh.setForeground(Color.decode("#7A8C8D"));
        txtMaLichTrinh.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtMaLichTrinh.setSelectionColor(new Color(75, 175, 152));
        // textField tìm kiếm ngày khởi hành
        txtTimKiemNgayKhoiHanh.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtTimKiemNgayKhoiHanh.setBackground(new Color(192,227,149)); // background
        txtTimKiemNgayKhoiHanh.setForeground(Color.decode("#7A8C8D"));
        txtTimKiemNgayKhoiHanh.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtTimKiemNgayKhoiHanh.setSelectionColor(new Color(75, 175, 152));
    }
    // tăng giảm số lượng vé đang đặt
    int soLuong = 0;
    private void giamSoLuongVeDat(){
        if(soLuong == 0){
            lblSoLuongVe.setText("" + soLuong);
            return;
        }else{
            soLuong--;
            lblSoLuongVe.setText("" + soLuong);
        }
    } // btnGiam
    private void tangSoLuongVeDat(){
        soLuong++;
        if(soLuong > 5){
            MsgBox.alert(this, "Một khách Chỉ được đặt tối đa 5 vé");
            return;
        }else{
            lblSoLuongVe.setText("" + soLuong);
        }
    } // btnGiam
}
