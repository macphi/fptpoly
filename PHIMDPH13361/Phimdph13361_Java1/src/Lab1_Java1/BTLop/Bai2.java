/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1.BTLop;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so1 , so2, so3, so4, so5;              
         System.out.println("Moi ban nhap");
        System.out.print("So1:");
         so1 = scanner.nextInt();       
        System.out.print("So2:");
         so2 = scanner.nextInt();         
        System.out.print("So3:");
         so3 = scanner.nextInt();      
        System.out.print("So4:");
         so4 = scanner.nextInt();        
        System.out.print("So5:");
         so5 = scanner.nextInt();        
        int ketqua= so5 + so1 + so2 + so3 + so4; 
        System.out.println("Ket qua="+ketqua);
    }
}
