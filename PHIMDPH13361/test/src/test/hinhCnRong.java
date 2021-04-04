package test;
import java.util.Scanner;

public class hinhCnRong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 6;
        int y = 4;
        if  (y>0){
            if  (x>0){
                System.out.println("This point lies in the First quadrant");
            }else{
                System.out.println("This point lies in the Second quadrant");
            }
        }else{
            if  (x<0){
                System.out.println("This point lies in the Third quadrant");
            }else{
                System.out.println("This point lies in the Fourth quadrant");
            }
        }
    }
}