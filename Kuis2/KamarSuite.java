package Kuis2;

public class KamarSuite extends Kamar implements IBonus, IKelebihan{
       
    public KamarSuite(String jenis, double harga, int kapasitas){
        super(jenis, harga, kapasitas);
    }

    public void tampilkanBonus(){
        System.out.println("Bonus: Pemandangan Laut dan Sarapan Gratis");
    }

    public void hitungHargaTotal(int malam){
        double 
        total = harga * malam;
        System.out.println("Total Harga (" + malam + " malam): " + total);
    }

    public void tampilkanKelebihan(){
        System.out.println("Kelebihan: Balkon");
    }
}

