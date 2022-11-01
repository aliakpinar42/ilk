package ders_08Ternary_Switch;

import java.util.Scanner;

public class deneme6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girniz");
        double sayi= scan.nextDouble();
         if (sayi>0) {
             System.out.println(sayi * 2);
         }else {
             System.out.println(sayi+10);

             System.out.println(sayi>0 ? sayi*2  :sayi+10);




        }
    }
}
