package inheritance;
import testpackage.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(){
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen(String nip, String nama, double gaji, String nidn){
        super(nip, nama, gaji);
        this.nidn = nidn;
       
        // super();
        // super.nip = nip;
        // super.nama = nama;
        // super.gaji = gaji;
        // this.nidn = nidn;
    }

    public String getInfo(){
        return "NIDN       : " + this.nidn + "\n";
    }

    public String getAllInfo(){
        // String info = getInfo();
        // info += "NIDN       : " + nidn;

        // String info = this.getInfo();
        // info += "NIDN       : " + nidn;

        // String info = super.getInfo();
        // info += "NIDN       : " + nidn;

        String info = super.getInfo();
        info += this.getInfo();


        // info += "NIP    : " + super.nip + "\n";
        // info += "Nama   : " + super.nama + "\n";
        // info += "Gaji   : " + super.gaji + "\n";

        return info;
    }
    
}