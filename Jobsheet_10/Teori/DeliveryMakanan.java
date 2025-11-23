public abstract class DeliveryMakanan {
    protected String namaMakanan;

    public DeliveryMakanan(String namaMakanan){
        this.namaMakanan = namaMakanan;
    }

    public void tampilkanPesanan(){
        System.out.println("Menampilkan pesanan : " + namaMakanan);
    }
}
