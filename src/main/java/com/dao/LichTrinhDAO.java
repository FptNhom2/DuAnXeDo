package com.dao;

import com.entity.LichTrinh;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.utils.XDate;

public class LichTrinhDAO extends AtbusDAO<LichTrinh, String> {

    String INSERT_SQL = "INSERT INTO LichTrinh (maLT,maTD,maPT,maNV,maTX,ngayXP,TGDuKien,chiPhiPhatSinh,tongVe,tongDoanhThu) VALUES (?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE LichTrinh SET maTD = ?, maPT = ?, maNV = ?, ngayXP = ?, TGDuKien = ?, tongVe = ?, chiPhiPhatSinh = ?, tongDoanhThu = ? WHERE maLT = ?";
    String DELETE_SQL = "DELETE FROM LichTrinh WHERE maLT = ?";
    String SELECT_ALL_SQL = "SELECT * FROM LichTrinh";
    String SELECT_BY_ID_SQL = "SELECT * FROM LichTrinh WHERE maLT = ?";

    @Override
    public void insert(LichTrinh entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaLT(), entity.getMaTD(), entity.getMaPT(), entity.getMaNV(), entity.getMaTX(), entity.getNgayXP(), XDate.formatTime(entity.getTgDuKien()), entity.getChiPhiPhatSinh(), entity.getTongVe(), entity.getTongDoanhThu());
        } catch (SQLException ex) {
            Logger.getLogger(LichTrinhDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(LichTrinh entity) {
        System.out.println(entity);
        try {
            Xjdbc.update(UPDATE_SQL, entity.getMaTD(), entity.getMaPT(), entity.getMaNV(), entity.getNgayXP(), entity.getTgDuKien(), entity.getTongVe(), entity.getChiPhiPhatSinh(), entity.getTongDoanhThu(), entity.getMaLT());
        } catch (SQLException ex) {
            Logger.getLogger(LichTrinhDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(LichTrinhDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LichTrinh selectById(String id) {
        List<LichTrinh> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LichTrinh> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LichTrinh> selectBySql(String sql, Object... args) {
        List<LichTrinh> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                String[] times = XDate.splitTime(rs.getString("tgDuKien"));
                LichTrinh entity = new LichTrinh();
                entity.setMaLT(rs.getString("maLT"));
                entity.setMaTD(rs.getInt("maTD"));
                entity.setMaPT(rs.getInt("maPT"));
                entity.setMaNV(rs.getString("maNV"));
                entity.setMaTX(rs.getString("maTX"));
                entity.setTongVe(rs.getInt("tongVe"));
                entity.setNgayXP(XDate.createDate(rs.getString("ngayXP")));
                entity.setTgDuKien(XDate.createTime(times[0], times[1], times[2].substring(0, 2)));
                entity.setChiPhiPhatSinh(rs.getDouble("chiPhiPhatSinh"));
                entity.setTongDoanhThu(rs.getDouble("tongDoanhThu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT year(ngayXP) Year FROM LichTrinh ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Integer> selectMonth() {
        String sql = "SELECT DISTINCT month(ngayXP) Month FROM LichTrinh ORDER BY Month DESC";
        List<Integer> lists = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql);
            while (rs.next()) {
                lists.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return lists;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<String> getNgayXP(int maTD) {
        String sql = "{CALL getNgayXPByTuyenDuong(?)}";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, maTD);
            while (rs.next()) {
                list.add(rs.getString("ngayXP"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<String> getTGDuKien(Object... args) {
        String sql = "{CALL getTGByNgayInLichTrinh(?,?)}";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(rs.getString("TGDuKien"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return list;
    }

    public List<String> getMaLT(Object... args) {
        String sql = "{CALL getLTByNgayTGInLichTrinh(?,?,?)}";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(rs.getString("maLT"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return list;
    }

}
