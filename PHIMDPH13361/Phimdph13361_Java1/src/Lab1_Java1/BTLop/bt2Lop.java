
package Lab1_Java1.BTLop;

import java.util.Scanner;

public class bt2Lop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Moi ban nhap so:");
        int x = Integer.parseInt(scanner.nextLine());
        if ( x >=9 && x <=10) {
            System.out.println("Xuat sac");          
        }else{
            if ( x >=8 && x <=9) {
                System.out.println("gioi");
            }else{
                if ( x >=7 && x <=8) {
                    System.out.println("Khá");
                }else{
                    if ( x >=5 && x <=7) {
                        System.out.println("Trung bình");
                    }else{                        
                            System.out.println("Học lại");                       
                    }
                }
            }
        }       
    }
}

