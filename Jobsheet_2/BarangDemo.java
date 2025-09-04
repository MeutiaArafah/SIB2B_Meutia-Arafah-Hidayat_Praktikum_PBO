public class BarangDemo {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor = 3500;
        barang1.diskon = 0.1;

        barang1.displayInfo();

        // instansiasi
        Barang barang2 = new Barang();
        barang2.kode = "ATK02";
        barang2.nama = "Bolpoin Pilot Merah";
        barang2.hargaKotor = 4000;
        barang2.diskon = 0.5;

        Barang barang3 = new Barang();
        barang3.kode = "ATK03";
        barang3.nama = "Buku Tulis";
        barang3.hargaKotor = 2500;
        barang3.diskon = 0.1;
    }
}
