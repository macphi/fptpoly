package oop;

import java.util.Scanner;

public class Nguoi {

    private String Ten;
    private int Tuoi;
    private int Sdt;
    private String DiaChi;
    private int NgaySinh;
    private String QueQuan;
    private String TrinhDo;

    public Nguoi() {
    }

    public Nguoi(String Ten, int Tuoi, int Sdt, String DiaChi, int NgaySinh, String QueQuan, String TrinhDo) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Sdt = Sdt;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.TrinhDo = TrinhDo;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int Sdt) {
        this.Sdt = Sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }
}
