package belajar;

import java.util.ArrayList;
import java.time.LocalDate;

public class Anggota {
    private String idAnggota;
    private String nama;
    private ArrayList<Peminjaman> daftarPinjam;

    public Anggota(String idAnggota, String nama){
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.daftarPinjam = new ArrayList<Peminjaman>();
    }

    public String getIdAnggota(){
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota){
        this.idAnggota = idAnggota;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tambahPeminjaman(LocalDate tanggalPinjam, int lamaHari, Film film){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setTanggalPinjam(tanggalPinjam);
        peminjaman.setLamaHari(lamaHari);
        peminjaman.setFilm(film);

        daftarPinjam.add(peminjaman);
    }

    public String getInfo(){
        String info = "";
        info += "ID Anggota     : " + this.idAnggota + "\n";
        info += "Nama           : " + this.nama + "\n";

        if (!daftarPinjam.isEmpty()) {
            info += "Riwayat Peminjaman :\n";

            for(Peminjaman peminjaman : daftarPinjam){
                info += peminjaman.getInfo();
            }
        } else {
            info += "Belum ada riwayat peminjaman";
        }
        info += "\n";

        return info;
    }
}  
