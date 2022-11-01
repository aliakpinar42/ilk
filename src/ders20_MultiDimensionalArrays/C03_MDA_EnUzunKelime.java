package ders20_MultiDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {

        // verilen multidimensional String bir array'deki
        // en uzun String'i bulan kod yaziniz.

        String[][] arr= {{"ilker","Nesrin"},{"Hasan","Huseyin","ADem","Yusuf","Enes"}};

        String enUzunKelime=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {  // outer array'in elemanlarini kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {
                enUzunKelime=arr[i][j];


            }
            System.out.println("EnUzunKelime:" + enUzunKelime);
        }
    }}

