package ders_21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class c01_ElementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar);// [  ]

        System.out.println(sayilar.add(10));// true
        System.out.println(sayilar);// [10]
        sayilar.add(20);

        System.out.println(sayilar); //[10,20]tersi soylemedikce element i sona ekler

        sayilar.add(1, 15);

        System.out.println(sayilar);//[10,15,20]
        // listenin basina 44 ekleyin

        sayilar.add(0, 44);

        System.out.println(sayilar); // [44,10,15,20]

        List<Integer> eklenecekListe = new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayilar listenin sonuna eklenecek listeyi ekleyin
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar); // [44,10,15,20,3,5]

        // sayilar listesieklenecek nin basindaki 44'den sonraya eklenecek listeyi ekleyin

        sayilar.addAll(1, eklenecekListe);

        System.out.println(sayilar); // [44,3,5,10,15,20,3,5]

    }
}




