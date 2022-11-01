public class denemeStringmaniignorecase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2= "ali";
        String str3="Ali";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.equalsIgnoreCase("Ali Can"));

        /*
        equalsignorecase ayni metnin buyuk kucuk harf kullanilarak olusturulan
        farkli yazilimlarini birbirine esit olarak kabul eder

        yani equalsignorecase icin ali,ALI,Ali,ALI,aLI,aLI birbirine esitttir

        ama kelimede farklilik varsa bunlari tolere etmez


         */
    }
}
