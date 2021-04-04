/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melo;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String manv;
    private String hoten;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    void getThongTin(){
        System.out.printf("Tên: %s  Manv:%s  Luong:%f",hoten,manv,luong);
        System.out.println("");
    }
   
}
