package com.dao;

import com.entity.TuyenDuong;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TuyenDuongDAO extends AtbusDAO<TuyenDuong, Integer>{
    String insert_sql = "insert into TuyenDuong (tenTD, tenMien, gia) values (?, ?, ?)";
    String update_sql = "update TuyenDuong set tenTD = ?, tenMien = ?, gia = ? where maTD = ?";
    String delete_sql = "delete from TuyenDuong where maTD = ?";
    String select_all_sql = "select * from TuyenDuong";
    String select_by_id_sql = "select * from TuyenDuong where maTD = ?";

    @Override
    public void insert(TuyenDuong entity) {
        try {
            Xjdbc.update(insert_sql, entity.getTenTD(), entity.getTenMien(), entity.getGia());
        } catch (SQLException ex) {
            Logger.getLogger(TuyenDuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(TuyenDuong entity) {
        try {
            Xjdbc.update(update_sql, entity.getMaTD(), entity.getTenTD(), entity.getTenMien(), entity.getGia());
        } catch (SQLException ex) {
            Logger.getLogger(TuyenDuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer maTuyenDuong) {
        try {
            Xjdbc.update(delete_sql, maTuyenDuong);
        } catch (SQLException ex) {
            Logger.getLogger(TuyenDuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TuyenDuong selectById(Integer maTuyenDuong) {
        List<TuyenDuong> list = this.selectBySql(select_by_id_sql, maTuyenDuong);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TuyenDuong> selectAll() {
        return this.selectBySql(select_all_sql); // trả về 1 list
    }

    @Override
    protected List<TuyenDuong> selectBySql(String sql, Object... args) {
                List<TuyenDuong> list = new ArrayList<TuyenDuong>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while(rs.next()){
                TuyenDuong entity = new TuyenDuong();
                entity.setMaTD(rs.getInt("maTD"));
                entity.setTenTD(rs.getString("tenTD"));
                entity.setTenMien(rs.getString("tenMien"));
                entity.setGia(rs.getDouble("gia"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
