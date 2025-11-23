package nomor2;
public class Buku {
    private String judul;
    private String pengarang;
    private String tahunTerbit;
    private String status; // tersedia/dipinjam

    public Buku(String judul, String pengarang, String tahunTerbit, String status) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.status = status;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        String info = "";
        info += "Judul        : " + this.judul + "\n";
        info += "Pengarang    : " + this.pengarang + "\n";
        info += "Tahun Terbit : " + this.tahunTerbit + "\n";
        info += "Status       : " + this.status + "\n";
        return info;
    }
}