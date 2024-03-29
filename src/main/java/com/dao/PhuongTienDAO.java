
package com.dao;

import com.entity.PhuongTien;
import com.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.utils.XDate;

/**
 *
 * @author TRUNG
 */
public class PhuongTienDAO extends AtbusDAO<PhuongTien, Integer> {
    String INSERT_SQL = "INSERT INTO PhuongTien (bangSoXe,TinhTrang,SLChoNgoi,ngayKiemDinh,ngayBaoTri) VALUES (?, ?, ?, ?,?)";
    String UPDATE_SQL = "UPDATE PhuongTien SET bangSoXe = ?, TinhTrang = ?, SLChoNgoi = ?, ngayKiemDinh = ?, ngayBaoTri = ? WHERE MaPT = ?";
    String DELETE_SQL = "DELETE FROM PhuongTien WHERE MaPT = ?";
    String SELECT_ALL_SQL = "SELECT * FROM PhuongTien";
    String SELECT_BY_ID_SQL = "SELECT * FROM PhuongTien WHERE MaPT = ?";

    @Override
    public void insert(PhuongTien entity) {
        try {
            Xjdbc.update(INSERT_SQL,entity.getBangXoSe(), entity.getTrangThai(), entity.getSlChoNgoi(), entity.getNgayKiemDinh(), entity.getNgayBaoTri());
        } catch (SQLException ex) {
            Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(PhuongTien entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getBangXoSe(), entity.getTrangThai(), entity.getSlChoNgoi(), entity.getNgayKiemDinh(), entity.getNgayBaoTri(), entity.getMaPT());
        } catch (SQLException ex) {
            Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PhuongTien selectById(Integer id) {
        List<PhuongTien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhuongTien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<PhuongTien> selectBySql(String sql, Object... args) {
        List<PhuongTien> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                PhuongTien entity = new PhuongTien();
                entity.setMaPT(rs.getInt("maPT"));
                entity.setBangXoSe(rs.getString("bangSoXe"));
                entity.setTrangThai(rs.getBoolean("tinhTrang"));
                entity.setSlChoNgoi(rs.getInt("SLChoNgoi"));
                entity.setNgayKiemDinh(XDate.createDate(rs.getString("ngayKiemDinh")));
                entity.setNgayBaoTri(XDate.createDate(rs.getString("ngayBaoTri")));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
