package test1;

public class SinhVien {

    private String ten;
    private String msv;
    private int ns;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String ten, String msv, int ns, double diemJava) {
        this.ten = ten;
        this.msv = msv;
        this.ns = ns;
        this.diemJava = diemJava;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    void InRaSV() {
        System.out.printf("Tên:%s MaSv:%s Namsinh:%d Điểm:%.1f ", ten, msv, ns, diemJava);
        System.out.println("  ");
    }
}
