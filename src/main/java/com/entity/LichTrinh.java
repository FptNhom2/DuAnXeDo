package com.entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class LichTrinh {
    String maLT;
    int maTD;
    int maPT;
    String maTX;
    String maNV;
    LocalDate ngayXP;
    LocalTime tgDuKien;
    double chiPhiPhatSinh;
    double tongDoanhThu;
    int tongVe;
  

    public String getMaLT() {
        return maLT;
    }

    public void setMaLT(String maLT) {
        this.maLT = maLT;
    }

    public int getMaTD() {
        return maTD;
    }

    public void setMaTD(int maTD) {
        this.maTD = maTD;
    }

    public int getMaPT() {
        return maPT;
    }

    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public LocalDate getNgayXP() {
        return ngayXP;
    }

    public void setNgayXP(LocalDate ngayXP) {
        this.ngayXP = ngayXP;
    }

    public LocalTime getTgDuKien() {
        return tgDuKien;
    }

    public void setTgDuKien(LocalTime tgDuKien) {
        this.tgDuKien = tgDuKien;
    }

    public double getChiPhiPhatSinh() {
        return chiPhiPhatSinh;
    }

    public void setChiPhiPhatSinh(double chiPhiPhatSinh) {
        this.chiPhiPhatSinh = chiPhiPhatSinh;
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public String getMaTX() {
        return maTX;
    }

    public void setMaTX(String maTX) {
        this.maTX = maTX;
    }

    public int getTongVe() {
        return tongVe;
    }

    public void setTongVe(int tongVe) {
        this.tongVe = tongVe;
    }
    
}
