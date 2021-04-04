/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

public class BaoVe extends Person{
        private String mabv;
        private String caTruc;

    public BaoVe() {
    }

    public BaoVe(String mabv, String caTruc, String ho, String tendem, String ten, String namsinh) {
        super(ho, tendem, ten, namsinh);
        this.mabv = mabv;
        this.caTruc = caTruc;
    }

    public String getMabv() {
        return mabv;
    }

    public void setMabv(String mabv) {
        this.mabv = mabv;
    }

    public String getCaTruc() {
        return caTruc;
    }

    public void setCaTruc(String caTruc) {
        this.caTruc = caTruc;
    }

    @Override
    public String toString() {
        return "BaoVe{" + "mabv=" + mabv + ", caTruc=" + caTruc + '}';
    }
        
}
