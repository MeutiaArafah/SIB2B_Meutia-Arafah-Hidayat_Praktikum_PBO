package Jobsheet_10.Praktikum;

public class Kulkas extends AlatElektronik implements Audible{
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

     public void getInfo(){
        System.out.println("Harga   : " + harga);
        System.out.println("Warna   : " + warna);
        System.out.println("Merk    : " + merk);
    }
}
