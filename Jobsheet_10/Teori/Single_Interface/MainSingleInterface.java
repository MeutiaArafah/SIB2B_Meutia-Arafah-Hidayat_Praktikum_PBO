
public class MainSingleInterface {

    public static void main(String[] args) {
        GoPay gp1 = new GoPay(1000000);
        Dana dn1 = new Dana(20000);

        gp1.tampilkanSaldo();
        gp1.prosesPembayaran();
        gp1.validasiTransaksi();

        System.out.println();

        dn1.tampilkanSaldo();
        dn1.prosesPembayaran();
        dn1.validasiTransaksi();

    }
}
