import java.time.LocalDate;

public class DemoKRS {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("12345", "Titi", LocalDate.of(2006, 6, 1), "Malang");


        Matakuliah mk1 = new Matakuliah("DS100", "Pemrograman Dasar", 3);
        Matakuliah mk2 = new Matakuliah("BD211", "Basis Data", 3);
        Matakuliah mk3 = new Matakuliah("ASD31", "Algoritma & Struktur Data", 4);


        KRS krs = new KRS(mhs);
        krs.tambahMatakuliah(mk1);
        krs.tambahMatakuliah(mk2);
        krs.tambahMatakuliah(mk3);


        System.out.println(krs.getInfo());
    }
}