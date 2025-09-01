
public class Laptop {

    String merk;
    int ukuranLayar;
    String warna;
    int ram;
    String kegunaanUtama;

    public void nyalakanLaptop() {
        System.out.println("Laptop " + merk + " sedang menyala.");
    }

    public int tambahKecerahan(int increment) {
        int kecerahan = 0;
        kecerahan += increment;
        return kecerahan;
    }

    public void cetakInfo(){
         System.out.println("Merk: " + merk);
        System.out.println("ukuran Layar: " + ukuranLayar);
        System.out.println("Warna: " + warna);
        System.out.println("Ram: " + ram);
        System.out.println("Kegunaan Utama: " + kegunaanUtama);
    }

}
