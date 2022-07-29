package com.entity;

import java.time.LocalDate;
import com.utils.XDate;

public class PhuongTien {

    int maPT;
    String bangXoSe;
    boolean trangThai;
    int slChoNgoi;
    LocalDate ngayKiemDinh;
    LocalDate ngayBaoTri;

    public PhuongTien() {
        this.ngayKiemDinh = XDate.createDate(01, 01, 1900);
        this.ngayBaoTri = XDate.createDate(01, 01, 1900);
    }

    public int getMaPT() {
        return maPT;
    }

    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }

    public String getBangXoSe() {
        return bangXoSe;
    }

    public void setBangXoSe(String bangXoSe) {
        this.bangXoSe = bangXoSe;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getSlChoNgoi() {
        return slChoNgoi;
    }

    public void setSlChoNgoi(int slChoNgoi) {
        this.slChoNgoi = slChoNgoi;
    }

    public LocalDate getNgayKiemDinh() {
        return ngayKiemDinh;
    }

    public void setNgayKiemDinh(LocalDate ngayKiemDinh) {
        this.ngayKiemDinh = ngayKiemDinh;
    }

    public LocalDate getNgayBaoTri() {
        return ngayBaoTri;
    }

    public void setNgayBaoTri(LocalDate ngayBaoTri) {
        this.ngayBaoTri = ngayBaoTri;
    }

    @Override
    public String toString() {
        return this.bangXoSe;
    }

}
