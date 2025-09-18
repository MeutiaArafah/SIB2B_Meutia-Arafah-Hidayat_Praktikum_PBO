import java.util.ArrayList;

public class Guru {

    private String nama;
    private String nip;
    private ArrayList<MataPelajaran> daftarMapel;

    public Guru(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
        this.daftarMapel = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nipBaru) {
        this.nip = nipBaru;
    }

    public String getInfo() {
        System.out.println("--- DATA GURU PENGAJAR ---");
        String info = "Nama    : " + nama + "\n";
        info += "NIP     : " + nip + "\n";
        info += "Daftar Mapel : ";

        for (int i = 0; i < daftarMapel.size(); i++) {
            info += daftarMapel.get(i).getNamaMapel();
            if (i < daftarMapel.size() - 1) {
                info += ", ";
            }
        }
        return info;
    }

    public void tambahMapel(MataPelajaran mapelBaru) {
        daftarMapel.add(mapelBaru);
    }
}
