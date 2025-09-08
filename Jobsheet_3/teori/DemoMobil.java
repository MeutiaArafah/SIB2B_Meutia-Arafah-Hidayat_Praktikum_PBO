public class DemoMobil {
    public static void main(String[] args) {
        Mobil mbl1 = new Mobil(); // instansiasi objek mbl1
        mbl1.setMerek("Creta");
        mbl1.setKecepatan(300);
        // baris 4 dan 5 adalah pengisian data/nilai dari atribut merek dan kecepatan menggunakan setter
        
        mbl1.tampilkanInfo(); // method tampilkanInfo untuk menampilkan data merek dan kecepatan
        
        // === MODIFIKASI CLASS MOBIL ===
        System.out.println(mbl1.getMerek()); // pemanggilan atribut merek yang sudah diisikan nilainya (setter)
        mbl1.setKecepatan(250); // pengisian atribut kecepatan karena menggunakan getter
    }
}
