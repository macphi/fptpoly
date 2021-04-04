package Lab4;
import java.util.Scanner;
public class SanPham {
        private String Ten;
        private int Gia;
        private int GiamGia;
        //phuongthuc
        public double ThueNhapKhau(){
            double tnk = Gia  * 0.1;
            return tnk;
        }
    public String getTen() {
        return Ten;
    }
    public void setTen(String Ten) {
        this.Ten = Ten;
    }
    public int getGia() {
        return Gia;
    }
    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    public int getGiamGia() {
        return GiamGia;
    }
    public void setGiamGia(int GiamGia) {
        this.GiamGia = GiamGia;
    }
        public void xuat(){
            System.out.println("Thông tin sản phẩm:");
            System.out.printf("Tên sản phẩm:%s \n",Ten);
            System.out.printf("Giá sản phẩm:%d \n",Gia);
            System.out.printf("Gỉam giá sản phẩm:%d \n",GiamGia);
            System.out.printf("Thuế NK:%f \n",ThueNhapKhau());
        }
        //b2
        public void nhap(){
            System.out.println("Moi ban nhap thong tin SP: Tên, Giá, Giảm giá, Thuế");
            Scanner scanner = new Scanner(System.in);
            Ten = scanner.nextLine();
            Gia = Integer.parseInt(scanner.nextLine());
            GiamGia = Integer.parseInt(scanner.nextLine());       
        }
        //b3
    public SanPham(String Ten, int Gia, int GiamGia) {    
        this.Ten = Ten;
            this.Gia = Gia;
        this.GiamGia = GiamGia;
    }
    public SanPham() {
    }

//    public SanPham(String Ten, int Gia) {
//         this(Ten,Gia,0);       
//    }
        
}
