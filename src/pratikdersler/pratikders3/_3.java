package pratikdersler.pratikders3;

import java.util.Arrays;

public class _3 {
    public static void main(String[] args) {

        String name="Semra";
        kelimeninHarflariArray(name);
        kelimeninHarflariArray("String");

    }

public static void kelimeninHarflariArray (String input){

        char[] output = new  char[input.length()];
    for (int i = 0; i <input.length() ; i++) {
        output[i] = input.charAt(i);
    }
    System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(output));
    }
}





