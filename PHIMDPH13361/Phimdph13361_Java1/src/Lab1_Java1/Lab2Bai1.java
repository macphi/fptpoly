/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;
import java.util.Scanner;
public class Lab2Bai1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,x;
            System.out.print("Moi nhap he so a:");
            a= Float.parseFloat(scanner.nextLine());
            System.out.print("Moi nhap he so b:");
            b =Float.parseFloat(scanner.nextLine());
            if(a==0){
                if(b==0){
                    System.out.println("Phuong trinh vo so nghiem:");
                }else{
                    System.out.println("Phuong trinh vo nghiem:");
                }             
            }else{
                x = -b / a ;
                System.out.println("PT co nghiem x la:"+x);
            }               
    }
}
