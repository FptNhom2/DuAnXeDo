package com.dao;

import com.entity.LichSuMuaVe;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THIEN
 */
public class LichSuMuaVeDAO extends AtbusDAO<LichSuMuaVe, Integer> {

    String INSERT_SQL = "INSERT INTO LichSuMuaVe (maLT,maKH,veMua,thanhTien) VALUES (?,?,?,?)";
    String UPDATE_SQL = "UPDATE LichSuMuaVe SET maLT = ?, maKH = ?, veMua = ? thanhTien = ? WHERE maLSMV = ?";
    String DELETE_SQL = "DELETE FROM LichSuMuaVe WHERE maLSMV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM LichSuMuaVe";
    String SELECT_BY_ID_SQL = "SELECT * FROM LichSuMuaVe WHERE maLSMV = ?";
    String SELECT_BY_KHLT_SQL = "SELECT * FROM LichSuMuaVe WHERE maKH = ? AND maLT = ?";

    @Override
    public void insert(LichSuMuaVe entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaLT(), entity.getMaKH(), entity.getVeMua(), entity.getThanhTien());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(LichSuMuaVe entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getMaLT(), entity.getMaKH(), entity.getVeMua(),entity.getThanhTien(), entity.getMaLSMV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LichSuMuaVe selectById(Integer id) {
        List<LichSuMuaVe> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LichSuMuaVe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LichSuMuaVe> selectBySql(String sql, Object... args) {
        List<LichSuMuaVe> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                LichSuMuaVe entity = new LichSuMuaVe();
                entity.setMaLSMV(rs.getInt("maLSMV"));
                entity.setMaLT(rs.getString("maLT"));
                entity.setMaKH(rs.getString("maKH"));
                entity.setVeMua(rs.getInt("veMua"));
                entity.setThanhTien(rs.getDouble("thanhTien"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public LichSuMuaVe select_by_KHLT(String maKH, String maLT) {
        List<LichSuMuaVe> list = this.selectBySql(SELECT_BY_KHLT_SQL, maKH, maLT);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

}
