package oop;

import java.util.ArrayList;

public class mangds {
    public static void main(String[] args) {
        // Phần 1 Arraylist không định kiểu - có định kiểu
        ArrayList arrlstKhongdinhkieu; // khai báo 
        arrlstKhongdinhkieu = new ArrayList();
        
      
        
        
        // Phần 2: Gán giá trị cho arraylist 
        arrlstKhongdinhkieu.add("String");
        arrlstKhongdinhkieu.add(1);
        arrlstKhongdinhkieu.add(1.5);
        arrlstKhongdinhkieu.add(true);
        arrlstKhongdinhkieu.add(false);
        arrlstKhongdinhkieu.add('a');
        arrlstKhongdinhkieu.add(5, "Java1");// Thêm giá trị tại vị trí
        
       
//        arrayListFloats.add(1.2);
        
        // Phần 3: Lấy giá trị
//        arrlstKhongdinhkieu.get(5); // Sử dụng phương thức get để lấy giá trị theo vị trí
//         System.out.println(arrlstKhongdinhkieu.get(3)); //Sử dụng phương thức get để lấy giá trị ra mh
//         System.out.println(arrlstKhongdinhkieu.get(1)); //Sử dụng phương thức get để lấy giá trị ra mh
         for (int i = 0; i < arrlstKhongdinhkieu.size(); i++) {
             System.out.println(arrlstKhongdinhkieu.get(i)+ "  ");
        }
         
         
         
        //Phần 4: xoá giá trị 
         arrlstKhongdinhkieu.remove(4); // xoá giá trị tại vị trí 5 Java1
        
        
         // Phanaf 5: mộT VÀI VÍ DỤ VỀ CÁC PHƯƠNG ARRAYLIST
      
            
         
    }
}
