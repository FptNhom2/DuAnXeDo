package com.dao;

import com.entity.NhanVien;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO extends AtbusDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (maNV,hoTen,matKhau,vaitro,email,sdt,hinh) VALUES (?, ?, ?, ?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET hoTen = ?, matKhau = ?, vaiTro = ?, email = ?, sdt = ?, hinh = ? WHERE maNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.getMatKhau(), entity.getVaiTro(), entity.getEmail(), entity.getSdt(), entity.getHinh());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getMatKhau(), entity.getVaiTro(), entity.getEmail(), entity.getSdt(), "hinh", entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("maNV"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setMatKhau(rs.getString("matKhau"));
                entity.setVaiTro(rs.getBoolean("vaiTro"));
                entity.setEmail(rs.getString("email"));
                entity.setSdt(rs.getString("sdt"));
                entity.setHinh(rs.getString("hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
