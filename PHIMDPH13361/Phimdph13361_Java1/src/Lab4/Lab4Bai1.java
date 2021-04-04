


package Lab4;

import java.util.Scanner;

public class Lab4Bai1 {
    
    public static void main(String[] args) {
//        SanPham sp1 = new SanPham();
//        sp1.Ten ="San pham 1";
//        sp1. Gia=111;
//        sp1. GiamGia=5;
//        sp1.xuat();
//        SanPham sp2 = new SanPham();
//        sp2.Ten ="San pham 2";
//        sp2.Gia =222;
//        sp2.GiamGia =10;
//        sp2.xuat();
            //b2
//        SanPham s1=new SanPham();
//        SanPham s2 = new SanPham();
//        s1.nhap();
//        s1.xuat();
//        s2.nhap();
//        s2.xuat();

//            SanPham sp1 = new SanPham("May tinh",150,10);
//            SanPham sp2 = new SanPham("Dien thoai",150);
//            sp1.xuat();
//            sp2.xuat();
//
//            SanPham sp1 = new SanPham();
//            
//            SanPham sp2 = new SanPham();
            
        SanPham lol = nhapSanPham();
        
        lol.xuat();
            
    }
    
    public static SanPham nhapSanPham(){
        Scanner sc = new Scanner(System.in);
        SanPham sp = new SanPham();
        System.out.println("Ten");
        sp.setTen(sc.nextLine());
        System.out.println("Gia");
        sp.setGia(Integer.parseInt(sc.nextLine()));
        System.out.println("Giam Gia");
        sp.setGiamGia(Integer.parseInt(sc.nextLine()));
        return sp;
    }
}
