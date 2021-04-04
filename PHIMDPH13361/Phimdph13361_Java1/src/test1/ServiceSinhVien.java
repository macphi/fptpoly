package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceSinhVien {// Đây là nơi để code các chứ năng liên quan

    SinhVien _arrSinhViens[];
    List<SinhVien> _lstSinhVien;
//    SinhVien _s1 = new SinhVien();

    public ServiceSinhVien() {
        _lstSinhVien = new ArrayList<>();
    }//Tạo 2 đối tượng sử cụng constructor có tham số và không tham số        

    void bai1Cots() {
        // c1 Sử dụng constructor có tham số
        SinhVien sv1 = new SinhVien("Tú", "PH00123", 1979, 9.9);
        // c2 sử dụng constructor không có tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Tu");
        sv2.setMsv("PH09876");
        sv2.setNs(1978);
        sv2.setDiemJava(8.8);
        //In ra màn hình
        sv1.InRaSV();
        sv2.InRaSV();
    }

    void bai2taodoituong() {//Constructor không tham số
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien();
        System.out.println("Mời bạn nhập tên:");
        sv1.setTen(scanner.nextLine());
        System.out.println("Mời bạn nhập mã sv:");
        sv1.setMsv(scanner.nextLine());
        System.out.println("Mời bạn nhập năm sinh::");
        sv1.setNs(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn nhập điểm::");
        sv1.setDiemJava(Double.parseDouble(scanner.nextLine()));
        sv1.InRaSV();
    }

    void bai3mangdoituong() {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Bạn muốn thêm bao nhiêu SV:");
        size = Integer.parseInt(scanner.nextLine());
        _arrSinhViens = new SinhVien[size];
        for (int i = 0; i < size; i++) {
            _arrSinhViens[i] = new SinhVien();
            System.out.println("Sv thứ: " + (i + 1));
            System.out.println("Mời bạn nhập tên:");
            _arrSinhViens[i].setTen(scanner.nextLine());
            System.out.println("Mời bạn nhập mã sv:");
            _arrSinhViens[i].setMsv(scanner.nextLine());
            System.out.println("Mời bạn nhập năm sinh::");
            _arrSinhViens[i].setNs(Integer.parseInt(scanner.nextLine()));
            System.out.println("Mời bạn nhập điểm::");
            _arrSinhViens[i].setDiemJava(Double.parseDouble(scanner.nextLine()));
        }

    }

    void inSV() {
        if (_arrSinhViens.length < 0) {
            return;
        }
        for (SinhVien x : _arrSinhViens) { // x đại diện cho sinh viên
            x.InRaSV();
        }
    }

    void bai4mang() {
        Scanner scanner = new Scanner(System.in);
        int size;
        GiaoVien arrGiaoViens[];
        System.out.println("Bạn muốn nhập bao nhiêu giáo viên");
        size = Integer.parseInt(scanner.nextLine());
        arrGiaoViens = new GiaoVien[size];
        for (int i = 0; i < size; i++) {
            arrGiaoViens[i] = new GiaoVien();
            System.out.println("Giao vien thu:" + (i + 1));
            arrGiaoViens[i].setTen(scanner.nextLine());
            System.out.println("Ma Gv:");
            arrGiaoViens[i].setMagv(scanner.nextLine());
            System.out.println("Năm sinh");
            arrGiaoViens[i].setNs(Integer.parseInt(scanner.nextLine()));
        }
        for (GiaoVien a : arrGiaoViens) {
            a.inraGV();

        }
    }

    void listSV() {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Bạn muốn thêm bao nhiêu SV:");
        size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            SinhVien _s1 = new SinhVien();
            System.out.println("Mời bạn nhập tên:");
            _s1.setTen(scanner.nextLine());
            System.out.println("Mời bạn nhập mã sv:");
            _s1.setMsv(scanner.nextLine());
            System.out.println("Mời bạn nhập năm sinh::");
            _s1.setNs(Integer.parseInt(scanner.nextLine()));
            System.out.println("Mời bạn nhập điểm::");
            _s1.setDiemJava(Double.parseDouble(scanner.nextLine()));
            _lstSinhVien.add(_s1);
        }
    }

    void getListSV() {
        for (SinhVien x : _lstSinhVien) { // x đại diện cho sinh viên
            x.InRaSV();
        }
    }

}
