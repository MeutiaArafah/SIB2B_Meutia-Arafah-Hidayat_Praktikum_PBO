package belajar_uts;

public class Penonton {
    private String nama;
    private String noHp;

    public Penonton(String nama, String noHp){
        this.nama = nama;
        this.noHp = noHp;
    }

    public String tampilInfo(){
        String info = " ";
        info += "Nama   : " + nama + "\n";
        info += "No HP  : " + noHp + "\n";

        return info;
    }
}
