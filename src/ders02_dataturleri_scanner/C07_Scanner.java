package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // soru 3 kullanicidan ismini soyismini ve yasini alip asagidaki formatta yazdirin
        // isminiz Doe
        // soy isminiz John
        // yasiniz 44
        // kaydiniz basariyla tamamlanmistir


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adiniz giriniz");
        String isim=scan.nextLine();
        // sting icin kullanilabilen nex() sadece ilk space e kadar olan kismi alir
        // nex line ise o satirda olan tum bilgiyi alir
        System.out.println("Lutfen soy isminiz yaziniz ");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Isminiz :" +"\nsoyisminiz :"+ soyisim+
                             "\nyasiniz: "+ yas+ "\nkaydiiz basariyla tamamlanmistir.");
    }
}
