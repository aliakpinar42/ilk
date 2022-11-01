package ders20_MultiDimensionalArrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {

        // soru 5 : verilen 2 katli bir array'de
        // her bir inner array'in son elementlerinin toplamini yazdiran
        // bir method olusturun

        int[][] arr={{5,7},{5,8,9},{0,1}};

    sonElementleriTopla(arr);

    }
public  static  void  sonElementleriTopla(int[][]arr){
        int toplam=0;

    for (int i = 0; i <arr.length ; i++) {

        toplam += arr[i][(arr[i].length-1)];
    }
    System.out.println("inner array'lerin son elementlerinin toplami :"+ toplam);

    }
}
