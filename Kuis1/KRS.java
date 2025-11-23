
import java.util.ArrayList;

public class KRS {

    private Mahasiswa mahasiswa;
    private ArrayList<Matakuliah> daftarMatakuliah;

    public KRS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public String getInfo() {
        String info = "";
        info += "NIM Mahasiswa  : " + mahasiswa.getNim() + "\n";
        info += "Nama Mahasiswa : " + mahasiswa.getNama() + "\n";

        if (!daftarMatakuliah.isEmpty()) {
            info += "Daftar Mata Kuliah yang Diambil:\n";
            for (Matakuliah mk : daftarMatakuliah) {
                info += mk.getInfo();
            }
        } else {
            info += "Belum mengambil mata kuliah apapun\n";
        }

        return info;
    }
}
