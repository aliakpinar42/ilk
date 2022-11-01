public class denemeOverloadingAnlatim {
    public static void main(String[] args) {


    }
    public static void  carpim(int sayi1,int sayi2){

        System.out.println("iki integer sayinin carpimi :" +sayi1*sayi2);

    }

    public static void  carpim (int sayi3, int sayi4, int sayi5){
        System.out.println("uc integer sayinin carpimi: "+sayi3*sayi4*sayi5);
    }
    public static void  carpim (double sayi1,int sayi2){

        System.out.println("iki integer sayinin carpimi:"+ sayi1*sayi2);

    }

}
