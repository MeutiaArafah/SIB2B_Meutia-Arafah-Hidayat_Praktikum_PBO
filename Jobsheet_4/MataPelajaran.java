public class MataPelajaran {

    private String namaMapel;
    private String kodeMapel;
    private Guru guruPengajar;

    public MataPelajaran(String namaMapel, String kodeMapel, Guru guruPengajar) {
        this.namaMapel = namaMapel;
        this.kodeMapel = kodeMapel;
        this.guruPengajar = guruPengajar;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String mapelBaru) {
        this.namaMapel = mapelBaru;
    }

    public String getKodeMapel() {
        return kodeMapel;
    }

    public void setKodeMapel(String kodeMapelBaru) {
        this.kodeMapel = kodeMapelBaru;
    }

    public Guru getGuruPengajar() {
        return guruPengajar;
    }

    public void setGuruPengajar(Guru pengajarBaru) {
        this.guruPengajar = pengajarBaru;
    }

    public void getInfo(){
        System.out.println("Nama Mapel    : " + namaMapel);
        System.out.println("Kode Mapel    : " + kodeMapel);
        System.out.println("Guru Pengajar : " + guruPengajar);
    }
}
