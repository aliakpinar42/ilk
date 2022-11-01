package ders02_dataturleri_scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {

        // kullanicidan ismini alip buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi girniz");
        String kullaniciAdi = scan.next();
        System.out.println(kullaniciAdi.toUpperCase());
        System.out.println(kullaniciAdi);
    }
}
