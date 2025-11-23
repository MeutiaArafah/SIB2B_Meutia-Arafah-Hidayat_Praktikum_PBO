

public class GoPay extends DompetDigital implements IPembayaran {
    public GoPay(double saldo) {
        super(saldo);
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pmebayaran lewat GoPay sedang di proses.");
    }

    public void validasiTransaksi() {
        System.out.println("Transaksi lewat GoPay berhasil di validasi.");
    }
    
}
