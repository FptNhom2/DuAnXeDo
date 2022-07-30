package com.ui;

import com.dao.LichTrinhDAO;
import com.dao.TuyenDuongDAO;
import com.dao.PhuongTienDAO;
import com.dao.TaiXeDAO;
import com.entity.LichTrinh;
import com.entity.TuyenDuong;
import com.entity.PhuongTien;
import com.entity.TaiXe;
import com.utils.Auth;
import com.utils.XDate;
import com.utils.MsgBox;
import com.utils.XValidations;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class QuanLyLichTrinhForm extends javax.swing.JPanel {

    public QuanLyLichTrinhForm() {
        initComponents();
        DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
        headerCellRenderer.setBackground(new Color(192, 227, 149));
        for (int i = 0; i < tblDatVe.getModel().getColumnCount(); ++i) {
            tblDatVe.getColumnModel().getColumn(i).setHeaderRenderer(headerCellRenderer);
        }
        for (int i = 0; i < tblLichTrinh.getModel().getColumnCount(); ++i) {
            tblLichTrinh.getColumnModel().getColumn(i).setHeaderRenderer(headerCellRenderer);
        }
        initUI();
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PanelLichTrinh = new javax.swing.JPanel();
        txtChiPhiLichTrinh = new javax.swing.JTextField();
        lblMaTX = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLichTrinh = new javax.swing.JTable();
        txtMaLT = new javax.swing.JTextField();
        lblTenTX = new javax.swing.JLabel();
        lblTinhTrang = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lblDiaChi1 = new javax.swing.JLabel();
        lblDiaChi2 = new javax.swing.JLabel();
        lblDiaChi3 = new javax.swing.JLabel();
        lblDiaChi4 = new javax.swing.JLabel();
        lblDiaChi5 = new javax.swing.JLabel();
        txtNgayXP = new javax.swing.JTextField();
        lblTongVe = new javax.swing.JLabel();
        lblTongDoanhThu = new javax.swing.JLabel();
        cboMaTD = new javax.swing.JComboBox<>();
        cboMaPT = new javax.swing.JComboBox<>();
        cboMaTX = new javax.swing.JComboBox<>();
        cboTGDuKien = new javax.swing.JComboBox<>();
        PanelDatVe = new javax.swing.JPanel();
        suaTTVeBtn = new javax.swing.JButton();
        inVeBtn = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtTimKiemNgayKhoiHanh = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatVe = new javax.swing.JTable();
        panelBorderForGioiThieuForm4 = new com.ui.PanelBorderForGioiThieuForm();
        jLabel26 = new javax.swing.JLabel();
        btnGiamSoLuongVeDat = new javax.swing.JButton();
        lblSoLuongVe = new javax.swing.JLabel();
        btnTangSoLuongVeDat = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cboTD = new javax.swing.JComboBox<>();
        cboTG = new javax.swing.JComboBox<>();
        cboNgay = new javax.swing.JComboBox<>();
        cboLT = new javax.swing.JComboBox<>();
        PanelInVe = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        btnCreate = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 250, 254));

        jLabel1.setBackground(new java.awt.Color(204, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LỊCH TRÌNH");

        jTabbedPane2.setBackground(new java.awt.Color(248, 250, 254));

        PanelLichTrinh.setBackground(new java.awt.Color(248, 250, 254));

        lblMaTX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaTX.setText("Mã lịch trình :");

        tblLichTrinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch trình", "Tuyến đường", "Phương tiện", "Mã tài xế", "Mã Nhân viên", "Ngày xuất phát", "Thời gian dự kiến", "Tổng vé", "Chi phí phát sinh", "Tổng doanh thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLichTrinh.setSelectionBackground(new java.awt.Color(35, 166, 97));
        tblLichTrinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichTrinhMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLichTrinh);

        lblTenTX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenTX.setText("Mã tuyến đường :");

        lblTinhTrang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTinhTrang.setText("Mã phương tiện :");

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi.setText("Mã tài xế :");

        jPanel2.setBackground(new java.awt.Color(248, 250, 254));

        btnFirst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/first.png"))); // NOI18N
        btnFirst.setPreferredSize(new java.awt.Dimension(280, 35));
        btnFirst.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnFirstMouseDragged(evt);
            }
        });
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel2.add(btnFirst);

        btnPre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        btnPre.setPreferredSize(new java.awt.Dimension(275, 35));
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });
        jPanel2.add(btnPre);

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        btnNext.setPreferredSize(new java.awt.Dimension(275, 35));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext);

        btnLast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/last.png"))); // NOI18N
        btnLast.setPreferredSize(new java.awt.Dimension(280, 35));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel2.add(btnLast);

        jPanel1.setBackground(new java.awt.Color(248, 250, 254));

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(275, 35));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(275, 35));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);

        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setPreferredSize(new java.awt.Dimension(280, 35));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoi);

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(280, 35));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);

        lblDiaChi1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi1.setText("Ngày xuất phát :");

        lblDiaChi2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi2.setText("Thời gian dự kiến :");

        lblDiaChi3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi3.setText("Tổng vé :");

        lblDiaChi4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi4.setText("Chi phí lịch trình :");

        lblDiaChi5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi5.setText("Tổng doanh thu :");

        txtNgayXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayXPActionPerformed(evt);
            }
        });

        lblTongVe.setText("0");

        lblTongDoanhThu.setText("Tổng vé");

        cboTGDuKien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00:00", "13:00:00", "18:00:00" }));

        javax.swing.GroupLayout PanelLichTrinhLayout = new javax.swing.GroupLayout(PanelLichTrinh);
        PanelLichTrinh.setLayout(PanelLichTrinhLayout);
        PanelLichTrinhLayout.setHorizontalGroup(
            PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLichTrinhLayout.createSequentialGroup()
                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(PanelLichTrinhLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLichTrinhLayout.createSequentialGroup()
                                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblTenTX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMaTX, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMaLT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayXP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                                    .addComponent(cboMaTD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMaPT, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMaTX, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLichTrinhLayout.createSequentialGroup()
                                        .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblDiaChi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDiaChi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDiaChi2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PanelLichTrinhLayout.createSequentialGroup()
                                        .addComponent(lblDiaChi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(25, 25, 25)))
                                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTongDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                    .addComponent(txtChiPhiLichTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                    .addComponent(lblTongVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTGDuKien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(165, 165, 165))
        );
        PanelLichTrinhLayout.setVerticalGroup(
            PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLichTrinhLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaTX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTGDuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboMaTD)
                    .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTenTX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDiaChi3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTongVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChiPhiLichTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLichTrinhLayout.createSequentialGroup()
                        .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaChi5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaTX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLichTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayXP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jTabbedPane2.addTab("Lịch trình", new javax.swing.ImageIcon(getClass().getResource("/images/lichtrinh.png")), PanelLichTrinh); // NOI18N

        PanelDatVe.setBackground(new java.awt.Color(248, 250, 254));

        suaTTVeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        suaTTVeBtn.setText("Sửa thông tin vé");

        inVeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        inVeBtn.setText("In vé");
        inVeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inVeBtnActionPerformed(evt);
            }
        });

        jLabel30.setText("Tìm kiếm ngày khởi hành:");

        tblDatVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch trình", "Tên tuyến", "Bảng số xe", "Ngày xuất phát", "Thời gian dự kiến", "Tổng vé đã bán"
            }
        ));
        tblDatVe.setSelectionBackground(new java.awt.Color(35, 166, 97));
        jScrollPane2.setViewportView(tblDatVe);

        panelBorderForGioiThieuForm4.setBackground(new java.awt.Color(248, 250, 254));
        panelBorderForGioiThieuForm4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đặt vé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(192, 227, 149))); // NOI18N

        jLabel26.setText("Số lượng vé:");

        btnGiamSoLuongVeDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/subtract.png"))); // NOI18N
        btnGiamSoLuongVeDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamSoLuongVeDatActionPerformed(evt);
            }
        });

        lblSoLuongVe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSoLuongVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuongVe.setText("0");

        btnTangSoLuongVeDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnTangSoLuongVeDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangSoLuongVeDatActionPerformed(evt);
            }
        });

        jLabel28.setText("Thành tiền:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("0 VND");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order_ticket.png"))); // NOI18N
        jButton3.setText("Đặt vé");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton4.setText("Hủy vé");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 26));

        javax.swing.GroupLayout panelBorderForGioiThieuForm4Layout = new javax.swing.GroupLayout(panelBorderForGioiThieuForm4);
        panelBorderForGioiThieuForm4.setLayout(panelBorderForGioiThieuForm4Layout);
        panelBorderForGioiThieuForm4Layout.setHorizontalGroup(
            panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderForGioiThieuForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorderForGioiThieuForm1.setBackground(new java.awt.Color(248, 250, 254));
        panelBorderForGioiThieuForm1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(192, 227, 149))); // NOI18N

        jLabel2.setText("Mã khách hàng:");

        txtMaKhachHang.setText("PS19749");

        jLabel3.setText("Họ và tên:");

        txtHoVaTen.setText("Lai Bỉnh An");

        jLabel4.setText("Số điện thoại");

        txtSoDienThoai.setText("0939806784");

        jLabel5.setText("Email:");

        txtEmail.setText("an.chantroimoi@gmail.com");

        jLabel6.setText("Mã lịch trình:");

        txtMaLichTrinh.setText("SG - DL");

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
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtMaLichTrinh))
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

        jLabel11.setText("Tên miền:");

        jLabel12.setText("Nam");

        jLabel13.setText("Mã nhân viên:");

        jLabel14.setText("Người tạo lịch trình");

        jLabel15.setText("Bảng số xe:");

        jLabel16.setText("mặc định");

        jLabel17.setText("Ngày xuất phát");

        jLabel19.setText("Thời gian dự kiến:");

        jLabel21.setText("Chi phí lịch trình:");

        jLabel8.setText("mặc định");

        jLabel20.setText("Giá");

        jLabel23.setText("250000");

        jLabel24.setText("Tình trạng vé:");

        jLabel25.setText("còn 30 vé");

        cboTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTDActionPerformed(evt);
            }
        });

        cboTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTGActionPerformed(evt);
            }
        });

        cboNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNgayActionPerformed(evt);
            }
        });

        cboLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLTActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTD, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLT, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderForGioiThieuForm2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderForGioiThieuForm2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelBorderForGioiThieuForm2Layout.setVerticalGroup(
            panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderForGioiThieuForm2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLT, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderForGioiThieuForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cboTD)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTG))
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

        javax.swing.GroupLayout PanelDatVeLayout = new javax.swing.GroupLayout(PanelDatVe);
        PanelDatVe.setLayout(PanelDatVeLayout);
        PanelDatVeLayout.setHorizontalGroup(
            PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatVeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelDatVeLayout.createSequentialGroup()
                            .addComponent(suaTTVeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inVeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTimKiemNgayKhoiHanh))
                        .addGroup(PanelDatVeLayout.createSequentialGroup()
                            .addComponent(panelBorderForGioiThieuForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panelBorderForGioiThieuForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panelBorderForGioiThieuForm4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PanelDatVeLayout.setVerticalGroup(
            PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatVeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorderForGioiThieuForm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(panelBorderForGioiThieuForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelBorderForGioiThieuForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelDatVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suaTTVeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inVeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiemNgayKhoiHanh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Đặt vé", PanelDatVe);

        PanelInVe.setBackground(new java.awt.Color(248, 250, 254));

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order_ticket.png"))); // NOI18N
        btnCreate.setText("Tạo vé");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        btnPrint.setText("In vé");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInVeLayout = new javax.swing.GroupLayout(PanelInVe);
        PanelInVe.setLayout(PanelInVeLayout);
        PanelInVeLayout.setHorizontalGroup(
            PanelInVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInVeLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addGroup(PanelInVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInVeLayout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        PanelInVeLayout.setVerticalGroup(
            PanelInVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInVeLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelInVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelInVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("In vé", PanelInVe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        txtNoiDung.append("\t\t\t Công Ty ATBus \n\n");
        txtNoiDung.append("\t Mã khách hàng:    " + txtMaKhachHang.getText() + "\n");
        txtNoiDung.append("\t Họ tên: \t" + txtHoVaTen.getText() + "\n");
        txtNoiDung.append("\t Số điện thoại: \t" + txtSoDienThoai.getText() + "\n");
        txtNoiDung.append("\t Email: \t" + txtEmail.getText() + "\n");
        txtNoiDung.append("\t Mã lịch trình: \t" + txtMaLichTrinh.getText() + "\n");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtNoiDung.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void inVeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inVeBtnActionPerformed
        //        try {
        //
        //        } catch (Exception e) {
        //        }
    }//GEN-LAST:event_inVeBtnActionPerformed

    private void btnGiamSoLuongVeDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamSoLuongVeDatActionPerformed
        giamSoLuongVeDat();
    }//GEN-LAST:event_btnGiamSoLuongVeDatActionPerformed

    private void btnTangSoLuongVeDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangSoLuongVeDatActionPerformed
        tangSoLuongVeDat();
    }//GEN-LAST:event_btnTangSoLuongVeDatActionPerformed

    private void tblLichTrinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichTrinhMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblLichTrinh.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblLichTrinhMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        prev();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void txtNgayXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayXPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayXPActionPerformed

    private void btnFirstMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstMouseDragged

    private void cboTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTDActionPerformed
        setEnabledCbo(true, cboNgay);
    }//GEN-LAST:event_cboTDActionPerformed

    private void cboNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNgayActionPerformed
        setEnabledCbo(true, cboTG);
    }//GEN-LAST:event_cboNgayActionPerformed

    private void cboTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTGActionPerformed
        setEnabledCbo(true, cboLT);
    }//GEN-LAST:event_cboTGActionPerformed

    private void cboLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatVe;
    private javax.swing.JPanel PanelInVe;
    private javax.swing.JPanel PanelLichTrinh;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnGiamSoLuongVeDat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTangSoLuongVeDat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLT;
    private javax.swing.JComboBox<String> cboMaPT;
    private javax.swing.JComboBox<String> cboMaTD;
    private javax.swing.JComboBox<String> cboMaTX;
    private javax.swing.JComboBox<String> cboNgay;
    private javax.swing.JComboBox<String> cboTD;
    private javax.swing.JComboBox<String> cboTG;
    private javax.swing.JComboBox<String> cboTGDuKien;
    private javax.swing.JButton inVeBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDiaChi1;
    private javax.swing.JLabel lblDiaChi2;
    private javax.swing.JLabel lblDiaChi3;
    private javax.swing.JLabel lblDiaChi4;
    private javax.swing.JLabel lblDiaChi5;
    private javax.swing.JLabel lblMaTX;
    private javax.swing.JLabel lblSoLuongVe;
    private javax.swing.JLabel lblTenTX;
    private javax.swing.JLabel lblTinhTrang;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JLabel lblTongVe;
    private com.ui.PanelBorderForGioiThieuForm panelBorderForGioiThieuForm1;
    private com.ui.PanelBorderForGioiThieuForm panelBorderForGioiThieuForm2;
    private com.ui.PanelBorderForGioiThieuForm panelBorderForGioiThieuForm4;
    private javax.swing.JButton suaTTVeBtn;
    private javax.swing.JTable tblDatVe;
    private javax.swing.JTable tblLichTrinh;
    private javax.swing.JTextField txtChiPhiLichTrinh;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaLT;
    private javax.swing.JTextField txtMaLichTrinh;
    private javax.swing.JTextField txtNgayXP;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTimKiemNgayKhoiHanh;
    // End of variables declaration//GEN-END:variables

    private LichTrinhDAO ltDao = new LichTrinhDAO();
    private TuyenDuongDAO tdDao = new TuyenDuongDAO();
    private PhuongTienDAO ptDao = new PhuongTienDAO();
    private TaiXeDAO txDao = new TaiXeDAO();
    private int soLuong = 0;
    private int row = -1;

    private void initUI() {
        // design giao diện 
        /*
            Tab lịch trình
            cboMaTD
            cboMaPT
            txtMaLT
            txtNgayXP
            txtTGDuKien
            txtChiPhiLichTrinh
         */
        cboMaTD.setBackground(new Color(235, 235, 235)); // background
        cboMaTD.setForeground(Color.decode("#7A8C8D"));
        cboMaTD.setFont(new java.awt.Font("sansserif", 0, 13));
        cboMaPT.setBackground(new Color(235, 235, 235)); // background
        cboMaPT.setForeground(Color.decode("#7A8C8D"));
        cboMaPT.setFont(new java.awt.Font("sansserif", 0, 13));
        cboMaTX.setBackground(new Color(235, 235, 235)); // background
        cboMaTX.setForeground(Color.decode("#7A8C8D"));
        cboMaTX.setFont(new java.awt.Font("sansserif", 0, 13));
        txtMaLT.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtMaLT.setBackground(new Color(192, 227, 149)); // background
        txtMaLT.setForeground(Color.decode("#7A8C8D"));
        txtMaLT.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtMaLT.setSelectionColor(new Color(75, 175, 152));
        txtNgayXP.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtNgayXP.setBackground(new Color(192, 227, 149)); // background
        txtNgayXP.setForeground(Color.decode("#7A8C8D"));
        txtNgayXP.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtNgayXP.setSelectionColor(new Color(75, 175, 152));
        cboTGDuKien.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        cboTGDuKien.setBackground(new Color(192, 227, 149)); // background
        cboTGDuKien.setForeground(Color.decode("#7A8C8D"));
        cboTGDuKien.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtChiPhiLichTrinh.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtChiPhiLichTrinh.setBackground(new Color(192, 227, 149)); // background
        txtChiPhiLichTrinh.setForeground(Color.decode("#7A8C8D"));
        txtChiPhiLichTrinh.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtChiPhiLichTrinh.setSelectionColor(new Color(75, 175, 152));
        /*
            Tab đặt vé
            combo Mã lịch trình
            textField Mã khách hàng
            textField Họ và tên
            textField Số điện thoại
            textField Email
            textField Mã lịch trình
            textField tìm kiếm ngày khởi hành
            button tạo vé
            button in vé
            button làm mới
         */
        cboLT.setBackground(new Color(235, 235, 235)); // background
        cboLT.setForeground(Color.decode("#7A8C8D"));
        cboLT.setFont(new java.awt.Font("sansserif", 0, 13));
        cboTD.setBackground(new Color(235, 235, 235)); // background
        cboTD.setForeground(Color.decode("#7A8C8D"));
        cboTD.setFont(new java.awt.Font("sansserif", 0, 13));
        cboTG.setBackground(new Color(235, 235, 235)); // background
        cboTG.setForeground(Color.decode("#7A8C8D"));
        cboTG.setFont(new java.awt.Font("sansserif", 0, 13));
        cboNgay.setBackground(new Color(235, 235, 235)); // background
        cboNgay.setForeground(Color.decode("#7A8C8D"));
        cboNgay.setFont(new java.awt.Font("sansserif", 0, 13));
        txtMaKhachHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtMaKhachHang.setBackground(new Color(192, 227, 149)); // background
        txtMaKhachHang.setForeground(Color.decode("#7A8C8D"));
        txtMaKhachHang.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtMaKhachHang.setSelectionColor(new Color(75, 175, 152));
        txtHoVaTen.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtHoVaTen.setBackground(new Color(192, 227, 149)); // background
        txtHoVaTen.setForeground(Color.decode("#7A8C8D"));
        txtHoVaTen.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtHoVaTen.setSelectionColor(new Color(75, 175, 152));
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtSoDienThoai.setBackground(new Color(192, 227, 149)); // background
        txtSoDienThoai.setForeground(Color.decode("#7A8C8D"));
        txtSoDienThoai.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtSoDienThoai.setSelectionColor(new Color(75, 175, 152));
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtEmail.setBackground(new Color(192, 227, 149)); // background
        txtEmail.setForeground(Color.decode("#7A8C8D"));
        txtEmail.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtEmail.setSelectionColor(new Color(75, 175, 152));
        txtMaLichTrinh.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtMaLichTrinh.setBackground(new Color(192, 227, 149)); // background
        txtMaLichTrinh.setForeground(Color.decode("#7A8C8D"));
        txtMaLichTrinh.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtMaLichTrinh.setSelectionColor(new Color(75, 175, 152));
        txtTimKiemNgayKhoiHanh.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)); // độ lớn của ô nhập
        txtTimKiemNgayKhoiHanh.setBackground(new Color(192, 227, 149)); // background
        txtTimKiemNgayKhoiHanh.setForeground(Color.decode("#7A8C8D"));
        txtTimKiemNgayKhoiHanh.setFont(new java.awt.Font("sansserif", 1, 12)); // độ đậm nhạt và size chữ
        txtTimKiemNgayKhoiHanh.setSelectionColor(new Color(75, 175, 152));
        btnCreate.setBackground(new Color(22, 116, 66));
        btnCreate.setForeground(new Color(250, 250, 250));
        btnPrint.setBackground(new Color(22, 116, 66));
        btnPrint.setForeground(new Color(250, 250, 250));
        btnLamMoi.setBackground(new Color(22, 116, 66));
        btnLamMoi.setForeground(new Color(250, 250, 250));
        setEnabledCbo(false, cboNgay, cboTG, cboLT);
    }

    private void initData() {
        this.fillComboBoxTuyenDuong(cboMaTD);
        this.fillComboBoxTuyenDuong(cboTD);
        this.fillComboBoxPhuongTien();
        this.fillComboBoxTaiXe();
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }

    private void setEnabledCbo(boolean data, JComboBox... cbos) {
        for (JComboBox cbo : cbos) {
            cbo.setEnabled(data);
        }
    }

    void fillTable() { // Fill data to lichTrinh table
        DefaultTableModel model = (DefaultTableModel) tblLichTrinh.getModel();
        model.setRowCount(0);
        try {

            List<LichTrinh> list = ltDao.selectAll();
            for (LichTrinh lt : list) {
                PhuongTien pt = ptDao.selectById(lt.getMaPT());
                TuyenDuong td = tdDao.selectById(lt.getMaTD());
                Object[] row = {lt.getMaLT(), td.getTenTD(), pt.getBangXoSe(), lt.getMaTX(), lt.getMaNV(),
                    XDate.formatDate(lt.getNgayXP(), "dd-MM-uuuu"), XDate.formatTime(lt.getTgDuKien()),
                    String.valueOf(lt.getTongVe()), String.valueOf(lt.getChiPhiPhatSinh()), String.valueOf(lt.getTongDoanhThu())};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Loi truy van du lieu");
            e.printStackTrace();
        }
    }

    void fillComboBoxTuyenDuong(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();

        List<TuyenDuong> list = tdDao.selectAll();
        for (TuyenDuong td : list) {
            model.addElement(td);
        }
    }

    void fillComboBoxPhuongTien() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaPT.getModel();
        model.removeAllElements();
        List<PhuongTien> list = ptDao.selectAll();
        for (PhuongTien pt : list) {
            if (!pt.getTrangThai()) {
                model.addElement(pt);
            }

        }
    }

    void fillComboBoxTaiXe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaTX.getModel();
        model.removeAllElements();
        List<TaiXe> list = txDao.selectAll();
        for (TaiXe tx : list) {
            if (!tx.getTrangThai()) {
                model.addElement(tx);
            }
        }
    }

    void fillComboBoxNgayXP() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNgay.getModel();
        model.removeAllElements();
        List<String> list = null;
        for (String tx : list) {

        }
    }

    void fillComboBoxTGDuKien() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTG.getModel();
        model.removeAllElements();
        List<String> list = null;
        for (String tx : list) {

        }
    }

    // tăng giảm số lượng vé đang đặt
    private void giamSoLuongVeDat() {
        if (soLuong == 0) {
            lblSoLuongVe.setText("" + soLuong);
            return;
        } else {
            soLuong--;
            lblSoLuongVe.setText("" + soLuong);
        }
    } // btnGiam

    private void tangSoLuongVeDat() {
        soLuong++;
        if (soLuong > 5) {
            MsgBox.alert(this, "Một khách Chỉ được đặt tối đa 5 vé");
            return;
        } else {
            lblSoLuongVe.setText("" + soLuong);
        }
    } // btnTang

    void setForm(LichTrinh lt) { // Dsiplay NhanVien to form
        PhuongTien pt = ptDao.selectById(lt.getMaPT());
        TaiXe tx = txDao.selectById(lt.getMaTX());
        TuyenDuong td = tdDao.selectById(lt.getMaTD());
        DefaultComboBoxModel modelTD = (DefaultComboBoxModel) cboMaTD.getModel();
        DefaultComboBoxModel modelTX = (DefaultComboBoxModel) cboMaTX.getModel();
        DefaultComboBoxModel modelPT = (DefaultComboBoxModel) cboMaPT.getModel();
        txtMaLT.setText(lt.getMaLT());
        modelTD.setSelectedItem(td);
        modelTX.setSelectedItem(tx);
        modelPT.setSelectedItem(pt);
        txtNgayXP.setText(XDate.formatDate(lt.getNgayXP(), "dd-MM-uuuu"));
        cboTGDuKien.setSelectedItem(XDate.formatTime(lt.getTgDuKien()));
        lblTongVe.setText(String.valueOf(lt.getTongVe()));
        txtChiPhiLichTrinh.setText(String.valueOf(lt.getChiPhiPhatSinh()));
        lblTongDoanhThu.setText(String.valueOf(lt.getTongDoanhThu()));
    }

    LichTrinh getForm() { // Create new NhanVien from form
        LichTrinh lt = new LichTrinh();
        if (!XValidations.checkIsEmpty(this, txtMaLT, txtChiPhiLichTrinh, txtNgayXP)) {
            if (XValidations.checkComboBox(this, cboMaPT, cboMaTD, cboMaTX, cboTGDuKien)) {
                lt.setMaLT(txtMaLT.getText());
                PhuongTien pt = (PhuongTien) cboMaPT.getSelectedItem();
                TaiXe tx = (TaiXe) cboMaTX.getSelectedItem();
                TuyenDuong td = (TuyenDuong) cboMaTD.getSelectedItem();
                lt.setMaTD(td.getMaTD());
                lt.setMaPT(pt.getMaPT());
                lt.setMaTX(tx.getMaTX());
                lt.setMaNV(Auth.user.getMaNV());
                String[] ngayXP = XDate.splitDate(txtNgayXP.getText());
                String[] tgDK = XDate.splitTime((String) cboTGDuKien.getSelectedItem());
                lt.setNgayXP(XDate.createDate(ngayXP[0], ngayXP[1], ngayXP[2]));
                lt.setTgDuKien(XDate.createTime(tgDK[0], tgDK[1], tgDK[2]));
                lt.setTongVe(Integer.valueOf(lblTongVe.getText()));
                lt.setTongDoanhThu(Double.valueOf(lblTongDoanhThu.getText()));
                return lt;
            }
        }
        return null;
    }

    void clearForm() { // [btnMoi]
        LichTrinh lt = new LichTrinh();
        this.setForm(lt);
        this.row = -1;
        this.updateStatus();
    }

    void updateStatus() { // Change status of btns
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblLichTrinh.getRowCount() - 1);
        // status form
        txtMaLT.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
//         status backward and forward btn
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void insert() { // [btnThem]
        if (getForm() != null) {
            LichTrinh lt = getForm();
            try {
                ltDao.insert(lt);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Them moi thanh cong");
            } catch (Exception e) {
                MsgBox.alert(this, "Them moi that bai");
                e.printStackTrace();
            }
        }

    }

    void update() { // [btnSua]\
        if (getForm() != null) {
            LichTrinh lt = getForm();
            try {
                ltDao.update(lt);
                this.fillTable();
                MsgBox.alert(this, "Cap nhat thanh cong");
            } catch (Exception e) {
                MsgBox.alert(this, "Cap nhat that bai");
                e.printStackTrace();
            }
        }
    }

    void delete() { // [btnXoa]
        if (!XValidations.checkIsEmpty(this, txtMaLT)) {
            String maLt = txtMaLT.getText();
            if (MsgBox.confirm(this, "Ban thuc su muon xoa lich trinh nay?")) {
                try {
                    ltDao.delete(maLt);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xoa thanh cong");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xoa that bai");
                    e.printStackTrace();
                }
            }
        }
    }

    void edit() { // [tblNhanVien double click]
        String maLt = (String) tblLichTrinh.getValueAt(this.row, 0);
        LichTrinh lt = ltDao.selectById(maLt);
        this.setForm(lt);
        this.updateStatus();
    }

    private void first() {
        this.row = 0;
        this.edit();
        this.showDetails();
    } // btnFirst

    private void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
        this.showDetails();
    } // btnPrev

    private void next() {
        if (this.row < tblLichTrinh.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
        this.showDetails();
    } // btnNext

    private void last() {
        this.row = tblLichTrinh.getRowCount() - 1;
        this.edit();
        this.showDetails();
    } // btnLast

    public void showDetails() {
        if (row > -1) {
            tblLichTrinh.setRowSelectionInterval(row, row);
        }
    }

}
