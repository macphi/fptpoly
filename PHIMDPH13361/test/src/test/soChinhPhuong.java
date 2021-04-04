
package test;

import java.util.Scanner;

public class soChinhPhuong {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);         
        int x;
        System.out.println("Moi ban nhap 1 so:");
        x = scanner.nextInt();
        double y = Math.sqrt(x);
        if(y == (int) y ){
           System.out.println( +x+ " la so chinh phuong");
        }else{
           System.out.println(+x+" khong la so chinh phuong");
        }       
    }
}
