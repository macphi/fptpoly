package test;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {
        System.out.println("TEST");
        menu();
        diem();
        vehinhCN();
        soChinhPhuong();
        giaiPT();
    }
    public static void giaiPT() {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, x1, x2, delta;
        System.out.println("Moi ban nhap he so a:");
        a = Float.parseFloat(scanner.nextLine());
        System.out.println("Moi ban nhap he so b:");
        b = Float.parseFloat(scanner.nextLine());
        System.out.println("Moi ban nhap he so c:");
        c = Float.parseFloat(scanner.nextLine());
        delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Pt Vo nghiem:");
        } else if (delta == 0) {
            x1 = x2 = -b / 2 * a;
            System.out.println("Pt co nghiem kep x=");
        } else {
            x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co nghiem x1=" + x1 + "x2=" + x2);
        }

    }

    public static void diem() {
        Scanner scanner = new Scanner(System.in);
        float x;
        System.out.print("Moi ban nhap diem:");
        x = Float.parseFloat(scanner.nextLine());
        if (x >= 9 && x <= 10) {
            System.out.println("Ban dat xuat sac");
        } else if (x >= 8 && x <= 9) {
            System.out.println("Ban dat gioi");
        } else if (x >= 7 && x <= 8) {
            System.out.println("Ban dat kha");
        } else if (x >= 5 && x <= 7) {
            System.out.println("Ban dat yeu");
        } else {
            System.out.println("Chuc mung ban hoc lai");
        }
    }

    public static void soChinhPhuong() {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Moi ban nhap 1 so:");
        x = scanner.nextInt();
        double y = Math.sqrt(x);
        if (y == (int) y) {
            System.out.println(+x + " la so chinh phuong");
        } else {
            System.out.println(+x + " khong la so chinh phuong");
        }
    }

    public static void vehinhCN() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Moi nhap dai");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("moi nhap chieu rong");
        y = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || j == 0 || i == x - 1 || j == y - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("   ");
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        float choice = Float.parseFloat(sc.nextLine());
        do {
            System.out.println("Moi ban chon 1 chuc nang:");
            System.out.println("+-------------------------------------+");
            System.out.println("1. Ve hinh cn");
            System.out.println("2. So chinh phuong");
            System.out.println("3. Diem ");
            System.out.println("4.Giai Pt ");
            System.out.println("0. Ban cho EXIT");
            System.out.println("+-------------------------------------+");
//          int = Integer.parseInt(sc.nextLine());   
            String chon = sc.nextLine();
//          boolean pick = true;           
            switch (chon) {
                case "1":
                    System.out.println("Ban chon hinh ve hinh CN");
                    vehinhCN();
                    break;
                case "2":
                    System.out.println("Ban chon tim so chinh phuong");
                    soChinhPhuong();
                    break;
                case "3":
                    System.out.println("Diem");
                    diem();
                    break;
                case "4":
                    System.out.println("Ban chon giai PT");
                    giaiPT();
                    break;
                case "0":
                    System.out.println("Ban chon EXIT");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Muc ban chon khong co vui long chon lai");
//                  pick =false;
                    break;
            }
        } while (choice != 5);
    }
}
