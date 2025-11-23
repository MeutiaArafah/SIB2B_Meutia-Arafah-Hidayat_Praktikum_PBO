public class Kendaraan {
    public String bbm;
    public String jenisRem;
    public String asal;

    public  Kendaraan(){
        System.out.println("Objek dari class Kendaraan dibuat");
    }

    public  Kendaraan(String bbm, String jenisRem, String asal){
        this.bbm = bbm;
        this.jenisRem = jenisRem;
        this.asal = asal;
    }

    public void nyalakanMesin(){
        System.out.println("Kendaraan ini berhasil dinyalakan.");
    }

    public String cetakInfo(){
        String info = "";
        info += "BBM             : " + bbm + "\n";
        info += "Jenis Rem       : " + jenisRem + "\n";
        info += "Asal Kendaraan  : " + asal ;

        return info;
    }
}
