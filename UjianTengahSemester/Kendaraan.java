package UjianTengahSemester;

public abstract class Kendaraan {
    private String merk;
    private String platNomor;
    private double hargaSewa;
    // baris ke 4 - 6 adalah deklarasi atribut

    public Kendaraan(String merk, String platNomor, double hargaSewa) {
        this.merk = merk;
        this.platNomor = platNomor;
        this.hargaSewa = hargaSewa;
    } // baris ke 9 - 13 adalah konstruktor berparameter

    public String getMerk() {
        return merk;
    } // getter untuk mengambil nilai merk kendaraan

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void nyalakanMesin() {
        System.out.println("Kendaraan ini berhasil dinyalakan.");
    } // overriding

    public abstract String tampilInfo(); // overriding
}
