package com.entity;

public class TaiXe {

    String maTX;
    String hoTen;
    String diaChi;
    boolean trangThai;
    String hinh;

    public String getMaTX() {
        return maTX;
    }

    public void setMaTX(String maTX) {
        this.maTX = maTX;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return this.maTX;
    }

}
