public class Mobil extends Kendaraan {
    public String merk;

     public Mobil(){
        System.out.println("Objek dari class Mobil dibuat");
    }

    public  Mobil(String bbm, String jenisRem, String asal, String merk){
           super(bbm, jenisRem, asal);
           this.merk = merk;
    }

    public void nyalakanMesin(){
        super.nyalakanMesin();
        System.out.println("Mobil ini berhasil dinyalakan.");
    }

    public String cetakInfo(){
        return "\nMerk       : " + this.merk ;
    }

    // public String cetakSemua(){
    //     String info = super.cetakInfo();
    //     info += this.cetakInfo();
        
    //     return info;
    // }

    
}