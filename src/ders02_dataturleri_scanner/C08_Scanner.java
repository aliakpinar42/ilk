package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {


        //soru 7 (inteviev) kullanicidan iki sayi alip ikisinin degerlerini  degistirn(swap)
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz" );
        int sayi1=scan.nextInt();

        System.out.println("Lutfen iki tam sayiyi giriniz");
        int sayi2 = scan.nextInt();

        int bos;

        bos= sayi2;
        sayi2=sayi1;

        sayi1=bos;

        System.out.println("sayi1'in degeri : + sayi");

        System.out.println("sayi2'in degeri : " + sayi2);
    }



    }


