package belajar;

import java.time.LocalDate;

public class Peminjaman {

    private LocalDate tanggalPinjam;
    private int lamaHari;
    private Film film;

    // public Peminjaman(LocalDate tanggalPinjam, int lamaHari, Film film) {
    //     this.tanggalPinjam = tanggalPinjam;
    //     this.lamaHari = lamaHari;
    //     this.film = film;
    // }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public void setLamaHari(int lamaHari) {
        this.lamaHari = lamaHari;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal Pinjam: " + tanggalPinjam;
        info += ", Lama Hari Pinjam: " + lamaHari;
        info += ", Film: " + film.getInfo() + "\n";

        return info;
        
    }
       
}
