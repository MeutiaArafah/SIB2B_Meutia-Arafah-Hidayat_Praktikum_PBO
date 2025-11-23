package Kuis2;

public class DemoHotel {
    public static void main(String[] args) {
        KamarStandar ks = new KamarStandar("Standar", 200000, 2);
        KamarDeluxe kd = new KamarDeluxe("Deluxe",500000, 4);
        KamarSuite kst = new KamarSuite("Suite", 1500000, 5);

        ks.tampilkanInfo();
        ks.hitungHargaTotal(1);

        System.out.println();
        kd.tampilkanInfo();
        kd.tampilkanBonus();
        kd.hitungHargaTotal(3);

        System.out.println();
        kst.tampilkanInfo();
        kst.tampilkanBonus();
        kst.tampilkanKelebihan();
        kst.hitungHargaTotal(1);

    }
}
