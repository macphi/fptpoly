/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1.BTLop;

import java.util.Scanner;

public class Bai1 {
        public static void main(String[] args) {           
            Scanner scanner=new Scanner(System.in);             
            int ns;      
            System.out.println("Ten ban:");
            String ten = scanner.nextLine();           
            System.out.println("Nam sinh:");
//          ns = scanner.nextInt();
            ns = Integer.parseInt(scanner.nextLine());
            System.out.println("Ma sv:");
            String masv = scanner.nextLine();          
            System.out.printf("Ten: %s , Ns:%d, Mssv:%s",ten,ns,masv);
            
//            System.out.println("Chào bạn.");
//            System.out.print("Moi ban nhap ho ten:");
//            String ten = scanner.nextLine();
//            System.out.println("Ho ten cua ban la:"+ten);
//            System.out.print("Moi ban nhap nam sinh");
//            int namsinh = scanner.nextInt();
//            System.out.println("Nam sinh cua ban la:"+namsinh);           
//            scanner.nextLine();
//            System.out.println("Moi ban nhap ma sv");
//            String masv = scanner.nextLine();
//            System.out.println("Ma Sv cua ban la:"+masv);
    }
}
