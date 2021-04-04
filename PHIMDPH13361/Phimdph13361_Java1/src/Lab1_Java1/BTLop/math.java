/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1.BTLop;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        String x ;
        System.out.println("Menu:");     
        System.out.println("a. Phép cộng:");     
        System.out.println("b. Phép trừ:");     
        System.out.println("c. Phép nhân:");     
        System.out.println("d. Phép chia:");     
        x =scanner.nextLine();            
        switch (x) {
            case "a":     
                System.out.println("+");
                break;
            case "b":       
                System.out.println("-");
                break;
            case "c":       
                System.out.println("*");
                break;
            case "d":    
                System.out.println("/");
                break;         
            default:
                System.out.println("Khong co ");
        }
        
        
//        if (x.equals("a")) {
//            System.out.println("+");
//        }else if( x.equals("b")){
//            System.out.println("-");
//        }else if( x.equals("c")){
//            System.out.println("*");
//        }else if( x.equals("d")){
//            System.out.println("%");
//        }else{
//            System.out.println("Khong co ");
//        }
    }
}
