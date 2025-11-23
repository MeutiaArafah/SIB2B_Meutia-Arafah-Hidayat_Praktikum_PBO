package UjianTengahSemester;

public class Main {
    public static void main(String[] args) {
        Mobil mbl1 = new Mobil("Toyota", "N 111 AC", 250000, 6);
        Motor mtr1 = new Motor("Wuling", "AG 222 IY", 150000, "Listrik");

        Pelanggan p1 = new Pelanggan("Titi", "08123456789");

        Garasi g1 = new Garasi("G0002", 10);
        g1.tambahKendaraan(mtr1);
        g1.tambahKendaraan(mbl1);
        g1.tampilGarasi();

        KontrakSewa ks1 = new KontrakSewa(p1, mtr1, 1);
        ks1.tampilInfoSewa();

        System.out.println("\n === Total Sewa ===");
        System.out.println("Total sewa tanpa diskon : " + ks1.hitungSewa());
        System.out.println("Total sewa diskon 20%   : " + ks1.hitungSewa(20));
    
        System.out.println("\n=== Penerapan Polimorfisme ===");
        Kendaraan k; 
        k = mbl1; 
        k.nyalakanMesin();
    }
    }

