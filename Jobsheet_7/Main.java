public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Solar", "Cakram", "Jepang", "Innova");

        System.out.println("\n=== Ini Detail Class Mobil ===");
        System.out.println(mobil1.cetakInfo());
        mobil1.nyalakanMesin();

        // System.out.println("\n=== Semua Detail Mobil ===");
        // System.out.println(mobil1.cetakSemua());      
    }
}
