package com.dao;

import com.entity.KhachHang;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO extends AtbusDAO<KhachHang, String> {

    String INSERT_SQL = "INSERT INTO KhachHang (maKH,hoTen,email,sdt) VALUES (?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE KhachHang SET hoTen = ?, email = ?, sdt = ? WHERE maKH = ?";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE maKH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKH = ?";
    String SELECT_BY_SDT_SQL = "SELECT * FROM KhachHang WHERE sdt = ?";
    

    @Override
    public void insert(KhachHang entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaKH(), entity.getHoTen(), entity.getEmail(), entity.getSdt());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(KhachHang entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getEmail(), entity.getSdt(), entity.getMaKH());
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
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("maKh"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setEmail(rs.getString("email"));
                entity.setSdt(rs.getString("sdt"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public KhachHang selectBySdt(String sdt) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_SDT_SQL, sdt);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Object[]> filterKhachHangBySdt(String sdt) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{CALL filterKhBySdt(?)}";
                rs = Xjdbc.query(sql, sdt);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("maKh"),
                        rs.getString("hoTen"),
                        rs.getString("email"),
                        rs.getString("sdt"),
                        rs.getString("maLt"),
                        rs.getInt("veMua"),
                        rs.getDouble("thanhTien"),
                        rs.getInt("maLSMV"),};
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<Object[]> getAll() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{CALL getAllKhAndLsmv}";
                rs = Xjdbc.query(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("maKh"),
                        rs.getString("hoTen"),
                        rs.getString("email"),
                        rs.getString("sdt"),
                        rs.getString("maLt"),
                        rs.getInt("veMua"),
                        rs.getDouble("thanhTien"),
                        rs.getInt("maLSMV"),};
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
}
