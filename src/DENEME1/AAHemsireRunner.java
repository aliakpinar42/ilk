package DENEME1;

public class AAHemsireRunner{


    public static void main(String[] args) {

     AAHemsire h1=new AAHemsire();
        System.out.println(h1);
        h1.personelIsmi="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="3123456789";

        AAHemsire h2=new AAHemsire();
        System.out.println(h2);
        h2.personelIsmi="hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3146544787";
        h2.bashekimIsmi="Yasar kemal";
        System.out.println("h1 :" + h1);
        System.out.println("h2 :" + h2);



    }
}
