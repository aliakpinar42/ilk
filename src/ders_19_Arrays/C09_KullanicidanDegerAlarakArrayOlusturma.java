package ders_19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici elemen girisini bitirmrk icin 0'a basin

        Scanner scan = new Scanner(System.in);
        int [] arr={0};
        int girilrnsayi=0;


        do {

            System.out.println("array'e eklemek icin bir tamsayi giriniz" +
                                "\nBitirmek icin 0'a basin");
             girilrnsayi=scan.nextInt();

            if (arr [0]== 0){
        }else if (girilrnsayi!=0) {
            arr = C08_ArrayaniElementEklemeMethodu.arrayeElemanEkle(arr, girilrnsayi);
        }

    }while(girilrnsayi!=0);

        System.out.println(Arrays.toString(arr));
    




            }}








