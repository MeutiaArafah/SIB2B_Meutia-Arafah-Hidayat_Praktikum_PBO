import java.util.ArrayList;

public class Siswa {

    private String nama;
    private String nis;
    private ArrayList<MataPelajaran> daftarMataPelajaran;

    public Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
        this.daftarMataPelajaran = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nisBaru) {
        this.nis = nisBaru;
    }

    public String getInfo() {
        System.out.println("--- DATA SISWA SISWI ---");
        String info = "Nama    : " + nama + "\n";
        info += "NIS     : " + nis + "\n";
        info += "Daftar Mapel : ";

        for (int i = 0; i < daftarMataPelajaran.size(); i++) {
            info += daftarMataPelajaran.get(i).getNamaMapel();
            if (i < daftarMataPelajaran.size() - 1) {
                info += ", ";
            }
        }
        return info;
    }

    public void tambahMapel(MataPelajaran mapelBaru) {
        daftarMataPelajaran.add(mapelBaru);
    }

}
