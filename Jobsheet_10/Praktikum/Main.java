package Jobsheet_10.Praktikum;

public class Main {
    public static void main(String[] args) {
         Kipas kipas = new Kipas("Dinding", 220000, "pink", "Panasonic");
         Kulkas kulkas = new Kulkas(2, 2000000, "Silver", "Sharp");
         SmartFridge sf = new SmartFridge(400, 3, 2100000, "Pink", "LG");
         TV tv = new TV("HD", 0, 300000, "hitam", "Polytron");

         kipas.getInfo();
         System.out.println();
         kulkas.getInfo();
         System.out.println();
         sf.getInfo();
         System.out.println();
         tv.getInfo();

         sf.naikkanVolume(50);
         tv.naikkanVolume(100);

         System.out.println("--- Setelah Volume Dinaikkan ---");
         sf.getInfo();
         System.out.println();
         tv.getInfo();


    }
}
