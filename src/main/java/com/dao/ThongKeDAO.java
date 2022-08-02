package com.dao;

import com.utils.FormatHelper;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    
    public List<Object[]>getDoanhThuNam(Integer maLT){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThuNam (?)}";
                rs = Xjdbc.query(sql, maLT);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("tenTD"),
                        rs.getString("maLT"),
                        rs.getInt("tongVe"),
                        rs.getString("bangSoXe"),
                        rs.getDouble("DoanhThu"),
                    };
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
    
    public List<Object[]>getDoanhThuThang(Object ...args){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThuThangNam (?,?)}";
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("tenTD"),
                        rs.getString("maLT"),
                        rs.getInt("tongVe"),
                        rs.getString("bangSoXe"),
                        rs.getDouble("DoanhThu"),
                    };
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
    
     public List<Object[]>getKhachHangNam(Integer maLT){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeKhachHangNam (?)}";
                rs = Xjdbc.query(sql, maLT);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("maKH"),
                        rs.getString("hoTen"),
                        rs.getString("sdt"),
                        rs.getString("email"),
                        rs.getInt("veMua")
                    };
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
