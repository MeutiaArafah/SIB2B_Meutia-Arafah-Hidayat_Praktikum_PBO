public class MainMultipleInterface {
    public static void main(String[] args) {
        Shopeefood sp1 = new Shopeefood("Kwetiau Goreng");
        sp1.tampilkanPesanan(); 
        sp1.antarPesanan();
        sp1.estimasiWaktu();

        System.out.println();

        Shopeefood sp2 = new Shopeefood("Dimsum");
        sp2.tampilkanPesanan(); 
        sp2.antarPesanan();
        sp2.estimasiWaktu();
    }
}
