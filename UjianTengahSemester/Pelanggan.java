package UjianTengahSemester;

public class Pelanggan {
    private String nama;
    private String noHp;

    public Pelanggan (String nama, String noHp){
        this.nama= nama;
        this.noHp = noHp;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNoHP(){
        return noHp;
    }

    public void setNoHP(String noHp){
        this.noHp = noHp;
    }

    public String tampilPelanggan(){
        String info = "";
        info += "Nama Pelanggan : " + nama + "\n";
        info += "No Handphone   : " + noHp + "\n";

        return info;
    }
}
