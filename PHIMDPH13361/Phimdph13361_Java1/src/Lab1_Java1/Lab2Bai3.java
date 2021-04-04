/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Java1;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float soDien,tienDien;
        System.out.print("Moi ban nhap so dien:");
        soDien = Float.parseFloat(scanner.nextLine());
        if(soDien < 50){
                tienDien = soDien*1000;
                System.out.println("So tien dien ban su dung trong  khoang so dien 50 la:"+tienDien);
        }else{
               tienDien = 50*1000+(soDien-50)*1200;
                System.out.print("So tien dien ban dung tu 50 tro len la:" +tienDien);
        }
        
    }
}
