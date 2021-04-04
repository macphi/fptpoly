/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author Admin
 */
public class GiaoVien extends Person {

    private String magv;
    private int gioDay;

    public GiaoVien() {
    }

    public GiaoVien(String magv, int gioDay, String ho, String tendem, String ten, String namsinh) {
        super(ho, tendem, ten, namsinh);
        this.magv = magv;
        this.gioDay = gioDay;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public int getGioDay() {
        return gioDay;
    }

    public void setGioDay(int gioDay) {
        this.gioDay = gioDay;
    }

    void inraGv() {
                System.out.printf("Họ và tên:%s  MaSv: %s  NamSinh:%s  gioday:%d",
                (getHo() + getTendem() + getTen()), magv, getNamsinh(), gioDay);

    }

}
