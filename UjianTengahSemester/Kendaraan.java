package UjianTengahSemester;

public abstract class Kendaraan {
    private String merk;
    private String platNomor;
    private double hargaSewa;

    public Kendaraan(String merk, String platNomor, double hargaSewa) {
        this.merk = merk;
        this.platNomor = platNomor;
        this.hargaSewa = hargaSewa;
    }

    public String getMerk() {
        return merk;
    }

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
    }

    public abstract String tampilInfo();
}
