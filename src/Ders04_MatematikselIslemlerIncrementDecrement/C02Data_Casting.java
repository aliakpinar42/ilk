package Ders04_MatematikselIslemlerIncrementDecrement;

import java.util.Scanner;

public class C02Data_Casting {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.



        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen iki sayi girniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        int bolmeSonucuTamsayi=(int)(sayi1/sayi2);


        System.out.println(bolmeSonucuTamsayi);

    }
}
