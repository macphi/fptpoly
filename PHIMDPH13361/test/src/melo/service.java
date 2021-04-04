
package melo;

import java.util.Scanner;

public class service {
        NhanVien _arrNhanViens[];
        
        void bai1nhapSv(){
            Scanner scanner = new Scanner(System.in);
            int size;
            System.out.println("Bạn muốn nhập bn nv:");
            size = Integer.parseInt(scanner.nextLine());
            _arrNhanViens = new NhanVien[size];
            for (int i = 0; i < size; i++) {
                _arrNhanViens[i] = new NhanVien();
                System.out.println("Mời bạn nhập nv:"+(i+1));
                System.out.println("Tên nv: ");
                _arrNhanViens[i].setHoten(scanner.nextLine());
                System.out.println("Mã nv:");
                _arrNhanViens[i].setManv(scanner.nextLine());
                System.out.println("Lương:");
                _arrNhanViens[i].setLuong(Double.parseDouble(scanner.nextLine()));                             
            }         
        }
        void inRa(){
            for (NhanVien a : _arrNhanViens) {
                a.getThongTin();
            }
        }
}
