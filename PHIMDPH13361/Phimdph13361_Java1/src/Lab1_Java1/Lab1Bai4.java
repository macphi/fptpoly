/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;
import java.util.Scanner;
public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        double a,b,c;
        System.out.print("Moi nhap he so thu nhat:");
        a = scanner.nextDouble();
        System.out.print("Moi nhap he so thu hai:");
        b = scanner.nextDouble();
        System.out.print("Moi nhap he so thu ba:");
        c = scanner.nextDouble();    
        double delta = ((b*b)-4*a*c);
        System.out.println("Delta = "+delta);
        double candelta = Math.sqrt(delta);
        System.out.println("Can delta = "+candelta);    
    }    
}
