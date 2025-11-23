package nomor2;

public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa (String nim, String nama){
        this.nim = nim;
        this.nama = nama;
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


       public String getInfo() {
        String info = "";
        info += "NIM            : " + this.nim + "\n";
        info += "Nama           : " + this.nama + "\n";
        return info;
    }

}