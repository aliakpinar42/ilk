package day5;

import java.util.Scanner;

public class Q1_bolmeoperatorukullanmadanbolme {
static int bolum=0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi girniz");
        int bolunen = scan.nextInt();
        System.out.println("Lutfen bolen sayiyi girniz");
        int bolen = scan.nextInt();
        System.out.println(bolunen + " /" + bolen + "=" + bol(bolunen, bolen));
    }
    public static int bol(int bolunen, int bolen) {

        while (bolunen>=bolen){
            bolunen-=bolen;
            bolum++;
        }
        return bolum;
    }
}
