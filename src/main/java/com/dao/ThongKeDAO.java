package com.dao;

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
    
    public List<Object[]>getDoanhThuThang(Integer maLT){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThuThang (?)}";
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
}
