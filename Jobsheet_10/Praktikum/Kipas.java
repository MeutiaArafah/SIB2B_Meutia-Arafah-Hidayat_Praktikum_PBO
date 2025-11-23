package Jobsheet_10.Praktikum;

public class Kipas extends AlatElektronik{
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

     public void getInfo(){
        System.out.println("Harga   : " + harga);
        System.out.println("Warna   : " + warna);
        System.out.println("Merk    : " + merk);
    }
}
