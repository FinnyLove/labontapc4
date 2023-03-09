package labbtc4;

import java.util.Scanner;

public class hoaquatuoi {

    Scanner sc = new Scanner(System.in);
    public String Mau;
    public String Mui;
    public String DinhDuong;

    public hoaquatuoi(String Mau, String Mui, String DinhDuong){
        this.Mau = Mau;
        this.Mui = Mui;
        this.DinhDuong = DinhDuong;
    }

    hoaquatuoi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void An() {}

    public void Uong() {}

    public class QuaCam extends hoaquatuoi {
        public QuaCam(String mau, String mui, String dinhDuong, double giaBan, String vi) {
            super(mau, mui, dinhDuong);    
            this.GiaBan = giaBan;
            this.Vi = vi;
        }
        public double GiaBan;
        public String Vi;
    }

    public class QuaTao extends hoaquatuoi {
        public QuaTao(String mau, String mui, String dinhDuong, double giaBan, String vi) {
            super(mau, mui, dinhDuong);
            this.GiaBan = giaBan;
            this.Vi = vi;
        }
        public double GiaBan;
        public String Vi;
    }

    public class CamCaoPhong extends QuaCam {
        public CamCaoPhong(String mau, String mu, String dinhDuong, double giaBan, String vi, String nguonGoc) {
            super(mau, mu, dinhDuong, giaBan, vi);
            this.NguonGoc = nguonGoc;
        }
        public String Vi;
        public String NguonGoc;
    }

    public class CamSanh extends QuaCam {
        public CamSanh(String mau, String mui, String nguonGoc) {
            super(mau, mui, "Đạm, Vitamin C, Carbs", 33000, "Ngọt");
            this.NguonGoc = nguonGoc;
        }
        public String NguonGoc;
    }
}

class Main {

    public static void main(String[] args) {
        hoaquatuoi.CamCaoPhong ccp1 = new hoaquatuoi().new CamCaoPhong("Vàng", "Chua", "Vitamin C, Carbs", 20000, "Thanh ngọt", "Hà Giang");
        hoaquatuoi.CamSanh cs1 = new hoaquatuoi().new CamSanh("Vàng", "Ngọt", "Lạng Sơn");
        System.out.println("Thông tin Quả Cam Cao Phong: "  + ccp1.Mau + ", " + ccp1.Vi + ", " + ccp1.NguonGoc + ", " + ccp1.DinhDuong + ", " + ccp1.GiaBan + " đồng/kg");
        System.out.println("Thông tin Quả Cam Sành: "  + cs1.Mau + ", " + cs1.Mui + ", " + cs1.NguonGoc + ", " + cs1.DinhDuong + ", " + cs1.GiaBan + " đồng/kg");
    }
}
