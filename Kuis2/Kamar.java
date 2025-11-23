package Kuis2;

public abstract class Kamar {
    protected String jenis;
    protected  double harga; 
    protected int kapasitas;

    public Kamar(String jenis, double harga, int kapasitas){
        this.jenis = jenis;
        this.harga = harga;
        this.kapasitas = kapasitas;
    }

    public void tampilkanInfo(){
        System.out.println("=== DETAIL KAMAR ===");
        System.out.println("Jenis Kamar : " + jenis);
        System.out.println("Harga       : " + harga);
        System.out.println("Kapasitas   : " + kapasitas);
    }

    public abstract void hitungHargaTotal();
}
