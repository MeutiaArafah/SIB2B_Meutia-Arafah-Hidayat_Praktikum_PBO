package UjianTengahSemester;
import java.util.ArrayList;

public class Garasi {
    private String kodeGarasi;
    private int kapasitas;
    private ArrayList<Kendaraan> listKendaraan = new ArrayList<>(); // ini adalah contoh penerapan dari composition
    
    public Garasi(String kodeGarasi, int kapasitas){
        this.kodeGarasi = kodeGarasi;
        this.kapasitas = kapasitas;
    }

    public String getKodeGarasi(){
        return kodeGarasi;
    }

    public void setKodeGarasi(String kodeGarasi){
        this.kodeGarasi = kodeGarasi;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public void tambahKendaraan(Kendaraan k) {
        listKendaraan.add(k);
    }

    public void tampilGarasi() {
        System.out.println("=== Isi Garasi " + kodeGarasi + " ===");
        for (Kendaraan k : listKendaraan) {
            System.out.println(k.tampilInfo());
            System.out.println("-------------------");
        }

    }

}
