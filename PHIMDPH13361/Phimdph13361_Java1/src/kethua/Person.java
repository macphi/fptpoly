package kethua;

/**
 *
 * @author Admin Coi person là lớp cha chứa các thuộc tính
 */
public class Person {

    //1-Sinh viên: Họ, tên đêm, tên, năm sinh, mã sv, điểm jv
    private String ho;
    private String tendem;
    private String ten;
    private String namsinh;

    public Person() {
    }

    public Person(String ho, String tendem, String ten, String namsinh) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.namsinh = namsinh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    void inRaLopCha() {
        System.out.println("Dya la text");
    }

}
