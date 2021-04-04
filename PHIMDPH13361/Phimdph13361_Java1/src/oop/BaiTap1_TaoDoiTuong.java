package oop;
import java.util.Scanner;
public class BaiTap1_TaoDoiTuong {
    private final Scanner scanner;
    public BaiTap1_TaoDoiTuong() {
        this.scanner = new Scanner(System.in);
    }       
    public void run() {
        Nguoi cc = new Nguoi();
        nhap(cc);
        xuat(cc);
    }
    public void nhap(Nguoi Nguoi) {
        System.out.println("Moi ban nhap thong tin nguoi: Ten, tuoi, Sdt, Dia chi");
        Nguoi.setTen(scanner.nextLine());
        Nguoi.setTuoi(Integer.parseInt(scanner.nextLine()));
        Nguoi.setSdt(Integer.parseInt(scanner.nextLine()));
        Nguoi.setDiaChi(scanner.nextLine());
    }
    public void xuat(Nguoi nguoi) {
        System.out.println("Thong tin nguoi ban vua nhap la");
        System.out.printf("Ten:%s \n", nguoi.getTen());
        System.out.printf("Tuoi:%d \n", nguoi.getTuoi());
        System.out.printf("Sdt:%d \n", nguoi.getSdt());
        System.out.printf("Dia chi:%s \n", nguoi.getDiaChi());
    }
    public static void main(String[] args) {
        new BaiTap1_TaoDoiTuong().run();
    }
}
