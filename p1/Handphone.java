
public class Handphone {
    String merk;                                                            
    String tipe;                                                            
    int ukuran;                                                             
    String warna;                                                        
    int jmlKamera;                                                                         // int jmlKamera2, jmlKamera3, jmlKamera4, jmlKamera5, jmlKamera6, jmlKamera7, jmlKamera8, jmlKamera9, jmlKamera10;


    public static void kirimPesan(String pesan) {
        System.out.println(pesan);
    }
    
    public static int tambahVolume(int increment) {
        int volume = 0;
        volume += increment;
        return volume;
    }

    public void cetakInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe) ;
        System.out.println("Ukuran Layar: " + ukuran);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Kamera: " + jmlKamera);
    }
}

//     public static void main(String[] args) {

// String merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
// String tipe2, tipe3, tipe4, tipe5, tipe6, tipe7, tipe8, tipe9, tipe10;
//int ukuran1, ukuran2, ukuran3, ukuran4, ukuran5, ukuran6, ukuran7, ukuran8, ukuran9, ukuran10;
// String warna2, warna3, warna4, warna5, warna6, warna7, warna8, warna9, warna10;
// int jmlKamera2, jmlKamera3, jmlKamera4, jmlKamera5, jmlKamera6, jmlKamera7, jmlKamera8, jmlKamera9, jmlKamera10;

//         merk = "Samsung";
//         ukuran = 110;
//         warna = "merah";
//         tipe = "S1";
//         jmlKamera = 1;

//         merk2 = "Oppo";
//         ukuran2 = 120;
//         warna2 = "kuning";
//         tipe2 = "AZ3";
//         jmlKamera = 1;

//         merk3 = "Xiomi";
//         ukuran3 = 130;
//         warna3 = "hijau";

//         merk4 = "Apple";
//         ukuran4 = 140;
//         warna4 = "biru";

//         merk5 = "Huawei";
//         ukuran5 = 150;
//         warna5 = "jingga";

//         merk6 = "Nokia";
//         ukuran6 = 160;
//         warna6 = "maroon";

//         merk7 = "Poco";
//         ukuran7 = 170;
//         warna7 = "burgundy";

//         merk8 = "Blackberry";
//         ukuran8 = 180;
//         warna8 = "abu";

//         merk9 = "Advan";
//         ukuran9 = 190;
//         warna9 = "neon";

//         merk10 = "Asus";
//         ukuran10 = 200;
//         warna10 = "silver";

//         kirimPesan("Halo, ini tiara");
//         System.out.println(tambahVolume(4));
//         System.out.println();
        
//         kirimPesan("Halo, ini meutia");
//         System.out.println(tambahVolume(3));
//         System.out.println();

//         kirimPesan("Halo, ini lala");
//         System.out.println(tambahVolume(10));
//         System.out.println();
        
//         kirimPesan("Halo, ini meutia");
//         System.out.println(tambahVolume(5));
//         System.out.println();

//         kirimPesan("Halo, ini agustin");
//         System.out.println(tambahVolume(1));
//         System.out.println();

//         kirimPesan("Halo, ini ika");
//         System.out.println(tambahVolume(20));
//         System.out.println();

//         kirimPesan("Halo, ini putri");
//         System.out.println(tambahVolume(31));
//         System.out.println();

//         kirimPesan("Halo, ini ara");
//         System.out.println(tambahVolume(55));
//         System.out.println();

//         kirimPesan("Halo, ini caca");
//         System.out.println(tambahVolume(41));
//         System.out.println();

//         kirimPesan("Halo, ini arafah");
//         System.out.println(tambahVolume(100));
//         System.out.println();
//     }


// }
