package nomor2;
import java.util.ArrayList;
public class Peminjaman {
    private Mahasiswa mahasiswa;
    private ArrayList<Buku> daftarBuku;

     public Peminjaman(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarBuku = new ArrayList<>();
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void setDaftarBuku(ArrayList<Buku> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }
    
    public void pinjamBuku(Buku b) {
        b.setStatus("Dipinjam");
        daftarBuku.add(b);
    }

    public void kembalikanBuku(Buku b) {
        b.setStatus("Tersedia");
        daftarBuku.remove(b);
    }

    public String getInfo() {
        String info = "";
        info += "Mahasiswa:\n";
        info += "NIM   : " + mahasiswa.getNim() + "\n";
        info += "Nama  : " + mahasiswa.getNama() + "\n\n";

        if (!daftarBuku.isEmpty()) {
            info += "Daftar Buku yang Dipinjam:\n";
            for (Buku b : daftarBuku) {
                info += b.getInfo() + "\n"; 
            }
        } else {
            info += "Belum ada buku yang dipinjam\n";
        }

        return info;
    }
}

