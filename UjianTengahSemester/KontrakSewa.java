package UjianTengahSemester;

public class KontrakSewa {
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int lamaSewa;

    public KontrakSewa(Pelanggan pelanggan, Kendaraan kendaraan, int lamaSewa){
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.lamaSewa = lamaSewa;
    }

    public double hitungSewa(){
        return kendaraan.getHargaSewa() * lamaSewa;
    }

    public double hitungSewa(double diskon){
        double total = kendaraan.getHargaSewa() * lamaSewa;
        return total - (total * diskon /100);
    }

    public void tampilInfoSewa() {
        System.out.println("=== DATA SEWA KENDARAAN ===");
        System.out.println(pelanggan.tampilPelanggan());
        System.out.println(kendaraan.tampilInfo());
        System.out.println("Lama Sewa : " + lamaSewa + " hari");
        System.out.println("Total Bayar: Rp" + hitungSewa());
    }
}
