package pratikdersler;

public class pratik3_2 {
    public static void main(String[] args) {

        String kelime = "ade1r4d3";
    }










    public static void rakamlarinToplami(String input){

        int toplam=0;
        for (int i = 0; i <input.length() ; i++) {

            if (Character.isDigit(input.charAt(i))){

                toplam+=Integer.valueOf(""+input.charAt(i));

            }

        }
        System.out.println("rakamlarin toplami :" + toplam);



        }
    }






