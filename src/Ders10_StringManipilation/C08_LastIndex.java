package Ders10_StringManipilation;

public class C08_LastIndex {
    public static void main(String[] args) {
        String str= "Java hafiften beyin yakiyor";
        System.out.println(str.lastIndexOf("a")); // 21
        System.out.println(str.lastIndexOf('e')); // 15
        System.out.println(str.lastIndexOf("java")); // -1
        System.out.println(str.lastIndexOf("Java")); // 0
        System.out.println(str.lastIndexOf("e", 14)); // 11
    }
}
