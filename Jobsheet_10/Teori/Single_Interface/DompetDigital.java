public abstract class DompetDigital {
    protected double saldo;

    public DompetDigital(double saldo){
        this.saldo = saldo;
    }   
    
    public void tampilkanSaldo(){
        System.out.println("Menampilkan saldo : " + saldo);
    }
}
