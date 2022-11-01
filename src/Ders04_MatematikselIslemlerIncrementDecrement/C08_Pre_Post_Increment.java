package Ders04_MatematikselIslemlerIncrementDecrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {
        int x= 3;
        System.out.println("x1 = " + x);
        int y = 2 * ++x ;
        System.out.println("x2 = " + x);
        int z= 5 + y-- ;
        System.out.println("x3 = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("alayinin toplami = " + (x+y+z));


    }
}
