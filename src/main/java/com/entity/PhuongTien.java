package com.entity;

import java.time.LocalDate;

public class PhuongTien {

    int maPT;
    String bangXoSe;
    boolean trangThai;
    int slChoNgoi;
    LocalDate ngayKiemDinh = LocalDate.of(1900, 01, 01);
    LocalDate ngayBaoTri = LocalDate.of(1900, 01, 01);

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
