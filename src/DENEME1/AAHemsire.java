package DENEME1;




public class AAHemsire {

    String hastaneIsmi="Yildiz Hastanesi";
    String hastaneAdresi="cankaya/Ankara";
    String bashekimIsmi="Dr mehmet yilmaz";

    String personelIsmi="Isim belirtilmedi";


    @Override
    public String toString() {


        return "AAHemsire{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", \nhastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ",bashekimIsmi ='" + bashekimIsmi + '\'' +
                '}';
    }

    String personelAdresi="Isim belirtilmedi";
    String personelTelefon="Isim belirtilmedi";
}

