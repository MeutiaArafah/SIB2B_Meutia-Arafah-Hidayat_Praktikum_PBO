public class Dana extends DompetDigital implements IPembayaran {
      public Dana(double saldo) {
        super(saldo);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pmebayaran lewat Dana sedang di proses.");
    }

    public void validasiTransaksi() {
        System.out.println("Transaksi lewat Dana berhasil di validasi.");
    }
    
}
