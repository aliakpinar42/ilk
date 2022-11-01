package ders20_MultiDimensionalArrays;

public class C02_MDA_ElementleriToplama {
    public static void main(String[] args) {

        int[] arr1 = {3, 5, 7, 8};//23

        int toplam = 0;

        for (int i = 0; i <arr1.length ; i++) {
            toplam += arr1[i];
        }
        System.out.println("tek katli array elemntler toplami :" + toplam);

        int[][] arr = {{1, 2}, {3, 4, 5}, {7}};
        // elemtleri toplayalim

        toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];


            }

        }

        System.out.println("2 katli array'in elementleri toplami :" + toplam);//22

            }

        }






