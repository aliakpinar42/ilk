package ders20_MultiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {

        // soru : verilen iki katli Array'da
        // her bir ic Array'daki elementleri toplayip,
        //yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin
        // input :     int [] [] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output :                     [10,3,12,9]


        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] output= new int[arr.length];
        int innerArrToplami=0;


        for (int i = 0; i <arr.length ; i++) { // outer array icindeki inner array'leri kontrol eder

            innerArrToplami = 0;
            for (int j = 0; j < arr[i].length; j++) { // herbir inner array in tum elementleri kontrol eder

                innerArrToplami += arr[i][j];

            }

            output[i] = innerArrToplami;
        }
        System.out.println(Arrays.toString(output));

            }

        }


