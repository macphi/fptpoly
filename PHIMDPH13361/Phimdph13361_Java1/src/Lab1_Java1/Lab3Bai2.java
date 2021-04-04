/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;
import java.util.Scanner;
public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 8;  
        System.out.println("BANG CUU CHUONG");
         x =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 10; i++) {
            System.out.println("Bang nhan"+i+":");          
            for (int j = 0; j < 10; j++) {    
                System.out.printf("%d * %d = %d \n",i,j,i*j);
            } 
        }
    }
}
