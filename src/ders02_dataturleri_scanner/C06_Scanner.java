package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


        // sor 4 kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip;
        // dikdortgenin alanini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasinda enter'a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();


        System.out.println("dikdortgen alani :" +(kenar1+kenar2));
    }
}
