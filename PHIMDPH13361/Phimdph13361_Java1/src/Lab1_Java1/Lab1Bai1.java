/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;
import java.util.Scanner;
public class Lab1Bai1 {
    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          System.out.print("Ho va ten:");
          String hoTen= scanner.nextLine();
          System.out.print("Diem TB:");
          double diemTB = scanner.nextDouble();
          System.out.println( "Diem trung binh la"+diemTB+"Ho ten cua ban la:"+hoTen);
    }       
}
