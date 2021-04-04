package kethua;

public class SinhVien extends Person {

    /* Sử dụng từ khoá extends kế thừa 1 lớp cha duy nhất là person
    Bên lớp con chỉ cần khai báo thuộc tính riêng
     */
    private String masv;
    private double diemC;

    public SinhVien() {
    }

    public SinhVien(String masv, double diemC, String ho, String tendem, String ten, String namsinh) {
        super(ho, tendem, ten, namsinh);
        this.masv = masv;
        this.diemC = diemC;
        // Từ khoá this dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
        // Từ khoá super dùng để tham chiếu đến thuộc tính và phương thức của lớp cha 

    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemC() {
        return diemC;
    }

    public void setDiemC(double diemC) {
        this.diemC = diemC;
    }

    void inRa() {
        System.out.printf("Họ và tên:%s  MaSv: %s  NamSinh:%s  Diem:%f", 
                (getHo() + getTendem() + getTen()), masv, getNamsinh(), diemC);
    }

    @Override
    void inRaLopCha() {
//        super.inRaLopCha(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Dâyyay");
    }

   

    
    
}
