/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;
import java.util.Scanner;
public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double canh;
        System.out.print("Moi nhap canh:");
        canh = scanner.nextDouble();
        double theTich=canh*canh*canh;
//        System.out.println("The tich hinh lap phuong la:"+theTich);
        System.out.println("The tich hinh lap phuong la:"+Math.pow(canh,3));
    }
}
