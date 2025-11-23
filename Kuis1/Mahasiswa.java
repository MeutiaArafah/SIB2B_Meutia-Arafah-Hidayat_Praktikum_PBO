import java.time.LocalDate;
public class Mahasiswa {
    private String nim;
    private String nama;
    private LocalDate tanggalLahir;
    private String alamat;

    public Mahasiswa (String nim, String nama, LocalDate tanggalLahir, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

       public String getInfo() {
        String info = "";
        info += "NIM            : " + this.nim + "\n";
        info += "Nama           : " + this.nama + "\n";
        info += "Tanggal Lahir  : " + this.tanggalLahir + "\n";
        info += "Alamat         : " + this.alamat + "\n";
        return info;
    }

}