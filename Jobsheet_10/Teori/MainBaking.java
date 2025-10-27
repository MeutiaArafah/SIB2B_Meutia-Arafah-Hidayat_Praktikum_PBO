public class MainBaking {
    public static void main(String[] args) {
        Cake c = new Cake();
        c.bahanBaku();
        c.proses();
        System.out.println("-------------------");

        Roti r = new Roti();
        r.bahanBaku();
        r.proses();
    }
}
