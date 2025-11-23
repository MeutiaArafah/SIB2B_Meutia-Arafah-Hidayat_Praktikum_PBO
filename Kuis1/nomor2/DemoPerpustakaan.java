package nomor2;

public class DemoPerpustakaan {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Pemrograman Java", "Arafah", "2021", "Tersedia");
        Buku buku2 = new Buku("Basis Data", "Desi", "2020", "Tersedia");
        Buku buku3 = new Buku("Algoritma & Struktur Data", "Robert", "2019", "Tersedia");


        Mahasiswa mhs = new Mahasiswa("12345", "Titi");


        Peminjaman peminjaman = new Peminjaman(mhs);

        peminjaman.pinjamBuku(buku1);
        peminjaman.pinjamBuku(buku2);
        peminjaman.pinjamBuku(buku3);


        System.out.println("=== Setelah Pinjam 3 Buku ===");
        System.out.println(peminjaman.getInfo());


        peminjaman.kembalikanBuku(buku2);


        System.out.println("=== Setelah Mengembalikan 1 Buku ===");
        System.out.println(peminjaman.getInfo());


        peminjaman.kembalikanBuku(buku1);


        System.out.println("=== Setelah Mengembalikan 2 Buku ===");
        System.out.println(peminjaman.getInfo());
    }
}