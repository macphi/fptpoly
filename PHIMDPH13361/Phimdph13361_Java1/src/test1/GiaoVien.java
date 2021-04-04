
package test1;

public class GiaoVien {
    private String ten;
    private String magv;
    private int ns;

    public GiaoVien() {
    }

    public GiaoVien(String ten, String magv, int ns) {
        this.ten = ten;
        this.magv = magv;
        this.ns = ns;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }
   void inraGV(){
       System.out.printf("Ten:%s Magv:%s Ns:%d",ten,magv,ns);
   }
}
