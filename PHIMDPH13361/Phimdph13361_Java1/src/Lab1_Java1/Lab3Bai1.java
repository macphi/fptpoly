
package Lab1_Java1;
import java.util.Scanner;
public class Lab3Bai1 {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        float N;
        boolean ok =true;      
        System.out.print("Moi ban nhap so bat ky:");
        N =Float.parseFloat(scanner.nextLine());
        for (int i = 2; i < N-1; i++){
            if(N % i == 0){
                ok = false;               
                break;
            }
        }if(ok == true){
            System.out.println("Day la so nguyen to:");
        }else{
            System.out.println("Day khong phai la so nguyen to: ");
        }   
    }
}
