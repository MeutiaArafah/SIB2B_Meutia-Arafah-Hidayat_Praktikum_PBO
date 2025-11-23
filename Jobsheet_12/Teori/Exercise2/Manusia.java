package Jobsheet_12.Teori.Exercise2;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        
        // cek tipe perangkat dengan instanceof
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvj = (TelevisiJadul) perangkat;
            System.out.println("Nyalakan televisi jadul dengan input: " + tvj.getModelInput());
        } else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvm = (TelevisiModern) perangkat;
            System.out.println("Nyalakan televisi modern dengan input: " + tvm.getModelInput());
        }
        System.out.println("Voltase televisi: " + perangkat.getVoltase() + " volt");
    }
}