package POJOs;
// Generated Sep 24, 2013 9:20:03 AM by Hibernate Tools 3.2.1.GA



/**
 * Chitietdonhang generated by hbm2java
 */

public class Chitietdonhang  implements java.io.Serializable {

    
     private int mactdonhang;
     private Sanpham sanpham;
     private Donhang donhang;
     private Integer soluong;

    public Chitietdonhang() {
    }

	
    public Chitietdonhang(int mactdonhang) {
        this.mactdonhang = mactdonhang;
    }
    public Chitietdonhang(int mactdonhang, Sanpham sanpham, Donhang donhang, Integer soluong) {
       this.mactdonhang = mactdonhang;
       this.sanpham = sanpham;
       this.donhang = donhang;
       this.soluong = soluong;
    }
   
    public int getMactdonhang() {
        return this.mactdonhang;
    }
    
    public void setMactdonhang(int mactdonhang) {
        this.mactdonhang = mactdonhang;
    }
    public Sanpham getSanpham() {
        return this.sanpham;
    }
    
    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }
    public Donhang getDonhang() {
        return this.donhang;
    }
    
    public void setDonhang(Donhang donhang) {
        this.donhang = donhang;
    }
    public Integer getSoluong() {
        return this.soluong;
    }
    
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }




}


