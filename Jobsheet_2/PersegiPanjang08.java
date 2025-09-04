public class PersegiPanjang08 {

    public int panjang, lebar; 
    public double luas, keliling; 
    // baris 3 dan 4 diatas adalah deklarasi variabel

    public PersegiPanjang08(int panjang, int lebar){
        this.panjang = panjang;
       this.lebar = lebar;
    } // baris 7 - 10 adalah konstruktor berparameter

    public void displayInfo() {
        System.out.println("===== Data Persegi Panjang =====");
        System.out.println("Panjang     : " + panjang);
        System.out.println("Lebar       : " + lebar);
        System.out.println("Luas        : " + luas);
        System.out.println("Keliling    : " + keliling);
    } // baris 8 -14 adalah pembuatan method displayInfo

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    } // baris 16-19 diatas adalah pembuatan method getLuas untuk menghitung  luas persegi panjang
    

    public double getKeliling() {
        keliling = 2 * (panjang * lebar);
        return keliling;
    } // baris 22 - 25 diatas adalah pembuatan method getKeliling untuk menghitung keliling persegi panjang

}
