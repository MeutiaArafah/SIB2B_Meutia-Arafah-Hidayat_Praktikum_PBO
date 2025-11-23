package Kuis2;

public class KamarStandar extends Kamar{
    
    public KamarStandar(String jenis, double harga, int kapasitas){
        super(jenis, harga, kapasitas);
    }

    public void hitungHargaTotal(int malam){
        double total = harga * malam;
        System.out.println("Total Harga (" + malam + " malam): " + total);
    }
}
