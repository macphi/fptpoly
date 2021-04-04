/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;

import java.util.Scanner;
public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dai,rong;
        System.out.print("Moi ban nhap chieu dai:");
        dai =scanner.nextInt();
        System.out.print("Moi ban nhap chieu rong:");
        rong = scanner.nextInt();
        int chuvi = (dai+rong)*2;
        System.out.println("Chu vi hinh chu nhat la:"+chuvi);
        System.out.println("Canh nho nhat la:" +Math.min(dai, rong));
        System.out.println("Canh lon nhat la:"+Math.max(dai, rong));
        
        
    }
}
