package test1;

public class Main { // chỉ có menu và switch case ở đây

    public static void main(String[] args) {

        ServiceSinhVien sv = new ServiceSinhVien();
        sv.bai3mangdoituong();
        sv.inSV();
//        ServiceSinhVien sv = new ServiceSinhVien();
//        sv.listSV();
//        sv.getListSV();
//        sv.bai1Cots();
//        System.out.println("");
////        sv.bai2taodoituong();
//        System.out.println("");
//        sv.bai3mangdoituong();
//        sv.inSV();  
//        System.out.println("");                 
//              
//    Scanner scanner = new Scanner(System.in);
//    ServiceSinhVien pic = new ServiceSinhVien();
//    int chon;       
//        while (true) {         
//            menu();           
//            try {
//              chon = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Lựa chọn không đúng");
//                continue;
//            }
//            switch (chon) {
//                case 1:
//                    System.out.println("Bạn chọn bài 1.");
//                    pic.bai1Cots();
//                    break;
//                case 2:
//                    System.out.println("Bài2");
//                    pic.bai2taodoituong();
//                    break;
//                case 3:
//                    System.out.println("Bài 3");
//                    pic.bai3mangdoituong();
//                    break;
//                case 4:
//                    System.out.println("Bài 4");
//                    pic.bai4mang();
//                    break;
//                case 5:
//                    System.out.println("Bạn chọn thoát");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Mục bạn chọn không có");
//                    break;
//            }
//        }
    }

    public static void menu() {
        System.out.println("+----------------------------------+");
        System.out.println("1. Ban chon bài 1");
        System.out.println("2. Ban chon bài 3");
        System.out.println("3. Ban chon bài 3");
        System.out.println("4. Ban chon bài 4");
        System.out.println("5. Ban chon exit");
        System.out.println("+----------------------------------+");
        System.out.println("Mời bạn chọn");
    }

}
