/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;

import java.util.Scanner;

public class Lab2Bai2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float a,b,c,x,x1,x2,delta;
            System.out.print("Moi nhap he so a:");
            a = Float.parseFloat(scanner.nextLine());
            System.out.print("Moi nhap he so b:");
            b = Float.parseFloat(scanner.nextLine());
            System.out.print("Moi nhap he so c:");
            c = Float.parseFloat(scanner.nextLine());
            delta = (b*b)- 4*a*c;
            System.out.println(delta);
//            delta =Float.parseFloat(scanner.nextLine());           
            if(a==0){
                System.out.println("Giai pt bac 1:");
            }else{
                delta =Float.parseFloat(scanner.nextLine());
                delta = (b*b)-4*a*c;
                if(delta<0){
                    System.out.println("Phuong trinh vo nghiem:");
                }else if(delta==0){
                    x = -b/2*a;
                    System.out.println("Phuong trinh co nghiem kep:"+x);
                }else{                
                x1 = (-b +  (float)Math.sqrt(delta)) / 2*a;
                x2 = (-b -  (float)Math.sqrt(delta)) / 2*a;
                System.out.println("Phuong trinh co 2 nghiem pb x1="+x1+"x2"+x2);
            }
            }
            
            
          
            
            
            





//        Scanner scanner = new Scanner(System.in);
//        float a,b,c,x1 = 0,x2 = 0,delta;
//            System.out.println("Moi nhap he so 1:");
//            a = scanner.nextFloat();
//            System.out.println("Moi nhap he so 2");
//            b = scanner.nextFloat();
//            System.out.println("Moi nhap he so 3");
//            c = scanner.nextFloat();           
//            delta = (b*b)-4*a*c;
//            System.out.println("Phuong trinh co delta =" +delta);
//            if(delta <0){
//                System.out.println("Phuong trinh vo nghiem");
//            }else if(delta == 0) {
//                System.out.println("Phuong trinh co nghiem kep x1 va x2 la:" +x1);
//                x1= x2 =-b/(2*a);
//            }else{        
//            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
//            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a)); 
//                System.out.println("Phuong trinh co nghiem kep x1 la:" +x1+"va x2 "+x2);
//            }
                
    }
}
