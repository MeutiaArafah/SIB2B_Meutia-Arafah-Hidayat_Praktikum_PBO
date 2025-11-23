import inheritance.Dosen;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Meutia Arafah Hidayat";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";
        System.out.println(dosen1.getAllInfo());
        
        Dosen dosen2 = new Dosen("12345678", "Syauzan Mecca Hidayat", 3000000, "1234567898765");
        System.out.println(dosen2.getAllInfo());
    }
}
