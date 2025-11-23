package UjianTengahSemester;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String merk, String platNomor, double hargaSewa, int jumlahKursi) {
        super(merk, platNomor, hargaSewa);
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
    return jumlahKursi;
}

public void setJumlahKursi(int jumlahKursi) {
    this.jumlahKursi = jumlahKursi;
}

    public void nyalakanMesin() {
        super.nyalakanMesin();
        System.out.println("Mobil ini berhasil dinyalakan.");
    }

    public String tampilInfo() {
            String info = "";
            info += "=== DATA MOBIL ===\n";
            info += "Merk         : " + getMerk() + "\n";
            info += "Plat Nomor   : " + getPlatNomor() + "\n";
            info += "Harga Sewa   : Rp" + getHargaSewa() + "\n";
            info += "Jumlah Kursi : " + jumlahKursi + "\n";
            return info;
        }
        // baris ke 19 - 32 adalah overriding kepada class Kendaraan
}
