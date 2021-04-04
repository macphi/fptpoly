package Lab1_Java1.BTLop;
import java.util.Scanner;
public class baitap_lab1_lab2 {

    public static void main(String[] args) {
        menu();
        bangCuuChuong();
        ktSv();
        inBangcc();
        ttNyc();
    }

    public static void bangCuuChuong() {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Moi nhap bang bang cuu chuong:");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Bang cuu chuong");
        for (int i = 1; i < 10; i++) {
            System.out.printf(" %d * %d= %d", a, i, a * i);
            System.out.println("");
        }
    }

    public static void inBangcc() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("BANG CUU CHUONG");
        System.out.println("Moi ban nhap bang cuu chuong bat dau:");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap bang cuu chuong ket thuc:");
        y = Integer.parseInt(scanner.nextLine());
        for (int i = x; i <= y; i++) { //i>=y;i--;< tu lon den be
            System.out.println("Bang nhan" + i + ":");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d \n", i, j, i * j);
            }
        }
    }

    public static void ktSv() {
        Scanner scanner = new Scanner(System.in);
        float diem;
        System.out.println("Moi ban nhap diem:");
        diem = Float.parseFloat(scanner.nextLine());
        if (diem == 10) {
                System.out.println("Sv đạt loại xuất sắc");
        } else if(diem ==9) {
                System.out.println("Sv đạt loại giỏi");
        }else if(diem ==8){
                 System.out.println("Sv đạt loại tiên tiến");
        }else if(diem >=5 && diem<=7){
                System.out.println("Sv đạt loại khá");
        }else {
                System.out.println("Sv đạt loại yếu");
        }
               
    }

    public static void ttNyc() {
        Scanner scanner = new Scanner(System.in);
        int sizeArr;
        String arrName[];
        int arrBirth[];
        String arrGT[];
        int arrHeight[];
        int arrAge[];      
        //Khoi tao chieu dai mang
        System.out.println("Mời nhập số lượng");
        sizeArr = Integer.parseInt(scanner.nextLine());
        //Khoi tao mang
        arrName = new String[sizeArr];
        arrBirth = new int[sizeArr];
        arrGT = new String[sizeArr];
        arrHeight = new int[sizeArr];
        arrAge = new int[sizeArr];
        //Khai bao khi run 
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Mời nhập thông tin nyc" + (i + 1));
            System.out.print("Tên:");
            arrName[i] = scanner.nextLine();
            System.out.print("Năm sinh:");
            arrBirth[i]=Integer.parseInt(scanner.nextLine());
            System.out.print("Giới tính:");
            arrGT[i] = scanner.nextLine();
            System.out.print("Chiều cao : ");
            arrHeight[i]=Integer.parseInt(scanner.nextLine());
        }
        //xuat ra man hinh
        System.out.println("\n---------Thông tin nyc vừa nhập---------");
        for (int i = 0; i < sizeArr; i++) {
            System.out.println();
            System.out.println("Nyc thứ  : " + (i + 1));
            System.out.println("Tên      : " + arrName[i]);
            System.out.println("Năm sinh : " + arrBirth[i]);
            System.out.println("Tuổi     : " + (2021 - arrBirth[i])+" tuổi");
            System.out.println("Giới tính: " + arrGT[i]);
            System.out.println("Chiều cao:"+arrHeight+"cm");
        }       
    } 
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("+-----Chương trình 1------+");
            System.out.println("1. In bảng cửu chương");
            System.out.println("2. In bảng cửu chương theo khoảng");
            System.out.println("3. Kiểm tra học lực Sinh Viên Fpoly");
            System.out.println("4. nHập thông tin người yêu cũ");
            System.out.println("5. Thoát");
            System.out.println("Moi ban chon ");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("In bảng cửu chương");
                    bangCuuChuong();
                    break;
                case "2":
                    System.out.println("In bảng cửu chương theo khoảng");
                    inBangcc();
                    break;
                case "3":
                    System.out.println("Kiểm tra học lực sinh viên");
                    ktSv();
                    break;
                case "4":
                    System.out.println("Nhập thông tin Nyc");
                    ttNyc();
                    break;
                case "5":
                    System.out.println("Ban chon exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mục bạn chọn không có");
            }
        } while (true);
    }

}
