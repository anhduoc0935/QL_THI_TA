package com.example.tienganh;

import java.io.Serializable;

public class Cacthi implements Serializable {
private String ten;
private String tentienganh;
private String Congthuc;
private String dauhieu;
private String cachdung;

    public Cacthi(String ten, String tentienganh, String congthuc, String dauhieu, String cachdung) {
        this.ten = ten;
        this.tentienganh = tentienganh;
        Congthuc = congthuc;
        this.dauhieu = dauhieu;
        this.cachdung = cachdung;
    }

    public Cacthi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTentienganh() {
        return tentienganh;
    }

    public void setTentienganh(String tentienganh) {
        this.tentienganh = tentienganh;
    }

    public String getCongthuc() {
        return Congthuc;
    }

    public void setCongthuc(String congthuc) {
        Congthuc = congthuc;
    }

    public String getDauhieu() {
        return dauhieu;
    }

    public void setDauhieu(String dauhieu) {
        this.dauhieu = dauhieu;
    }

    public String getCachdung() {
        return cachdung;
    }

    public void setCachdung(String cachdung) {
        this.cachdung = cachdung;
    }
}
