package Kuis2;

public class KamarDeluxe extends Kamar implements IBonus{
       
    public KamarDeluxe(String jenis, double harga, int kapasitas){
        super(jenis, harga, kapasitas);
    }

    public void tampilkanBonus(){
        System.out.println("Bonus: Sarapan Gratis");
    }

    public void hitungHargaTotal(int malam){
        double total = harga * malam;
        System.out.println("Total Harga (" + malam + " malam): " + total);
    }
}
