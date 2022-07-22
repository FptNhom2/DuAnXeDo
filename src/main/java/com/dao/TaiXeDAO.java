package com.dao;

import com.entity.TaiXe;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TaiXeDAO extends AtbusDAO<TaiXe, String>{
    
    String INSERT_SQL = "INSERT INTO TaiXe (maTX,maPT,hoTen,diaChi,trangThai,hinh) VALUES (?, ?, ?, ?,?,?)";
    String UPDATE_SQL = "UPDATE TaiXe SET maPT = ?, hoTen = ?, diaChi = ?, trangThai = ?, hinh = ? WHERE maTX = ?";
    String DELETE_SQL = "DELETE FROM TaiXe WHERE maTX = ?";
    String SELECT_ALL_SQL = "SELECT * FROM TaiXe";
    String SELECT_BY_ID_SQL = "SELECT * FROM TaiXe WHERE maTX = ?";
    
    
    @Override
    public void insert(TaiXe entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaTX(), entity.getMaPT(), entity.getHoTen(), entity.getDiaChi(), entity.getTrangThai(), entity.getHinh());
        } catch (SQLException ex) {
            Logger.getLogger(TaiXeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(TaiXe entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getMaPT(), entity.getHoTen(), entity.getDiaChi(), entity.getTrangThai(), entity.getHinh());
        } catch (SQLException ex) {
            Logger.getLogger(TaiXeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(TaiXeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TaiXe selectById(String id) {
        List<TaiXe> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TaiXe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<TaiXe> selectBySql(String sql, Object... args) {
        List<TaiXe> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                TaiXe entity = new TaiXe();
                entity.setMaTX(rs.getString("maTX"));
                entity.setMaPT(rs.getInt("maPT"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setDiaChi(rs.getString("diaChi"));
                entity.setTrangThai(rs.getBoolean("trangThai"));
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
