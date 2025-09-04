
public class DemoHandphone08 {

    public static void main(String[] args) {
        Handphone08 hp1 = new Handphone08("Samsung", "A23", "merah", 100, 1); // baris ini adalah instansiasi objek hp1 menggunakan konstruktor
        
        hp1.kirimPesan("Haiiii ini hp1");
        hp1.tambahVolume(23);
        hp1.cetakInfo();
        // baris 7 - 9 diatas adalah pemanggilan method yang ada di class Handphone untuk hp1

        Handphone08 hp2 = new Handphone08("Oppo", "AZ1", "kuning", 140, 2); // baris ini adalah instansiasi objek hp2 menggunakan konstruktor

        hp2.kirimPesan("Halooo ini hp2");
        hp2.tambahVolume(11);
        hp2.cetakInfo();
        // baris 14 - 16 diatas adalah pemanggilan method yang ada di class Handphone untuk hp2

        hp1.kirimPesan("Haii lagii update hp1");
        hp1.tambahVolume(4);
        hp1.cetakInfo();
        // baris 19 - 21 adalah update nilai dari setiap atribut hp1

        hp2.kirimPesan("Haloo lagii update hp2");
        hp2.tambahVolume(10);
        hp2.cetakInfo();
        // baris 24 - 26 adalah update nilai dari setiap atribut hp2
    }
}
