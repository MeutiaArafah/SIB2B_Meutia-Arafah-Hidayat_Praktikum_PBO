
import java.util.Scanner;

public class kalkulator {
    
    public static void main(String[] args) {
        Scanner tiara = new Scanner(System.in);
        double angka1, angka2, hasil;

        System.out.print("Masukkan angka ke-1: ");
        angka1 = tiara.nextDouble();

         System.out.print("Masukkan operator perhitungan (+, -, *, /): ");
         char op = tiara.next().charAt(0);

        System.out.print("Masukkan angka ke-2: ");
         angka2 = tiara.nextDouble();
        
         if (op == '+') {
             hasil = tambah(angka1, angka2);
         } else if (op == '-') {
             hasil = kurang(angka1, angka2);
         } else if (op == '*') {
             hasil = kali(angka1, angka2);
         } else if (op == '/') {
             hasil = bagi(angka1, angka2);
         } else{
            System.out.println("Operator tidak valid. Silakan inputkan ulang!");
            return;
         }

         System.out.println("Hasil: " + hasil);
         
        }


        public static double tambah(double a1, double a2){
            return a1 + a2;
        }

        public static double kurang(double a1, double a2){
            return a1 - a2;
        }

        public static double kali(double a1, double a2){
            return a1* a2;
        }

        public static double bagi(double a1, double a2){
            return a1 / a2;
        }
}
