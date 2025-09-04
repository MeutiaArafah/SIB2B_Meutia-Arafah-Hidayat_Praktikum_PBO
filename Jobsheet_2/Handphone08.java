
public class Handphone08 {

    String merk;
    String tipe;
    String warna;
    int ukuran, jmlKamera, volume = 0;
    // baris 2 - 5 diatas adalah deklarasi variabel

    public Handphone08(String merk, String tipe, String warna, int ukuran, int jmlKamera) {
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.ukuran = ukuran;
        this.jmlKamera = jmlKamera;
    } // baris 10 - 16 adalah konstruktor berparameter

    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Ukuran Layar: " + ukuran);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Kamera: " + jmlKamera);
        System.out.println("Volume: " + volume);
        System.out.println("=======================================");
    } // baris 8 -16 adalah pembuatan method cetakInfo

    public static void kirimPesan(String pesan) {
        System.out.println("Mengirim pesan: " + pesan);
    } // baris 18-20 diatas adalah pembuatan method kirimPesan untuk menampilkan pesan yang diberikan

    public int tambahVolume(int increment) {
        volume += increment;
        return volume;
    } // baris 22 - 25 diatas adalah pembuatan method tambahVolume untuk menambah dan menghitung volume handphone

}
