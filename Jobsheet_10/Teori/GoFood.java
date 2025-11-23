public class GoFood extends DeliveryMakanan implements IAntarMakanan, ILacak {
    public GoFood(String namaMakanan) {
        super(namaMakanan);
    }
    
    @Override
    public void antarPesanan() {
        System.out.println("Pesanan sedang di antar oleh kurir Shoopefood.");
    }

    @Override
    public void estimasiWaktu() {
        System.out.println("Estimasi waktu pesanan Shoopefood akan sampai.");
    }

}
