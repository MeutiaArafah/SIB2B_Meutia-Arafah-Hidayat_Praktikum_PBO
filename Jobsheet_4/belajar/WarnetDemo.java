package belajar;
import java.time.LocalDate;

public class WarnetDemo {
    public static void main(String[] args) {
        Film avengers = new Film("001","Avengers", "Action");
        Film india = new Film("003","Krisna", "Fantasi");

        Anggota anggota1 = new Anggota("111","titi");
        anggota1.tambahPeminjaman(LocalDate.of(2025, 8, 21), 21, avengers);

        Anggota anggota2 = new Anggota("101","desi");
        anggota2.tambahPeminjaman(LocalDate.of(2025, 9, 27), 7, india);

        System.out.println(anggota1.getInfo());
        System.out.println(anggota2.getInfo());
    }
}
