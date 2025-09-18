public class SekolahDemo {
    public static void main(String[] args) {
        Siswa titi = new Siswa("Titi", "1234");
        Siswa ara = new Siswa("Ara", "4567");

        Guru siti = new Guru("Siti", "1234");
        Guru novi = new Guru("Novi", "4567");

        MataPelajaran mtk = new MataPelajaran("Matematika", "mtk001", siti);
        MataPelajaran bing = new MataPelajaran("Bahasa Inggris", "bing002", novi);
    
        titi.tambahMapel(bing);
        titi.tambahMapel(mtk);
        ara.tambahMapel(bing);

        siti.tambahMapel(bing);
        novi.tambahMapel(mtk);

        System.out.println(titi.getInfo());
        System.out.println();
        System.out.println(siti.getInfo());
        System.out.println();
        System.out.println(novi.getInfo());
    }

}
