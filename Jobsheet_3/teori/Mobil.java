public class Mobil {
    private String merek;
    private int kecepatan;
    // // baris 2 dan 3 deskripsi atribut String merek dan int kecepatan dengan modifier private agar yang bisa mengakses hanya Class Mobil saja

    public void setMerek(String merek) {
        this.merek = merek;
    }
    // // baris 6 - 8 adalah method setMerek (setter) untuk mengisikan data merek

    public String getMerek() {
        return merek;
    }
    // // baris 11 - 13 adalah method getMerek (getter) untuk mengambil data merek

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    // // baris 15 - 17 adalah method setKecepatan (setter) untuk mengisikan data kecepatan

    public int getKecepatan() {
        return kecepatan;
    }
    // baris 11 - 13 adalah method getMerek (getter) untuk mengambil data merek

    // === MODIFIKASI CLASS MOBIL ===
    // private String merek = "Creta"; 
    // private int kecepatan; 
    // baris 27 dan 28 adalah modifikasi dari masing-masing atribut, merek hanya read only dan kecepatan hanya write only

    public void tampilkanInfo() {
        System.out.println("=== Spesifikasi Mobil ===");
        System.out.println("Merek       : " + getMerek());
        System.out.println("Kecepatan   : " + getKecepatan());
    }
    // baris 31 - 35 adalah method untuk menampilkan merek dan kecepatan
}
