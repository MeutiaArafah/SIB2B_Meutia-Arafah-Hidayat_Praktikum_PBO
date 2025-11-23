package UjianTengahSemester;

public class Motor extends Kendaraan{
    private String transmisi;
    
    public Motor(String merk, String platNomor, double hargaSewa, String transmisi){
        super(merk, platNomor, hargaSewa);
        this.transmisi = transmisi;
    }

    public String getTransmisi(){
        return transmisi;
    }

    public void setTransmisi(String transmisi){
        this.transmisi = transmisi;
    }

     public void nyalakanMesin(){
        super.nyalakanMesin();
        System.out.println("Motor ini berhasil dinyalakan.");
    }

    public String tampilInfo() {
            String info = "";
            info += "=== DATA MOTOR ===\n";
            info += "Merk         : " + getMerk() + "\n";
            info += "Plat Nomor   : " + getPlatNomor() + "\n";
            info += "Harga Sewa   : Rp" + getHargaSewa() + "\n";
            info += "Transmisi    : " + transmisi + "\n";
            return info;
        }
    // baris ke 19 - 32 adalah overriding kepada class Kendaraan
}
