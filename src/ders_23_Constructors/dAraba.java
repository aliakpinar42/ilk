package ders_23_Constructors;

public class dAraba {
    public static class DAraba {
        // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
        // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
        // Biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim
        // Her class olusturuldugunda java o class'dan obje olusturulabilmesi icin
        // default bir constructor olusturur
        // Bu default constructor gorunmez
        // default constructor parametresizdir ve bize standart bir obje olusturur
        String marka="Marka belirtilmedi";
        String model="Model belirtilmedi";
        String yakit;
        int yil;
        int fiyat;
        public String toString() {
            return "Araba Ozellikleri " +
                    "\nmarka : " + marka +
                    "\nmodel : " + model +
                    "\nyakit : " + yakit +
                    "\nyil : " + yil +
                    "\nfiyat : " + fiyat ;
        }
        public int maxHiz(String yakit){
            int maxHiz=120;
            if(yakit.equalsIgnoreCase("dizel")){
                maxHiz=200;
            } else if (yakit.equalsIgnoreCase("benzin")) {
                maxHiz=230;
            } else if (yakit.equalsIgnoreCase("elektrikli")) {
                maxHiz=180;
            }
            return maxHiz;
        }
    }

    public static class HAraba {
        String marka="Marka belirtilmedi";
        String model="Model belirtilmedi";
        String yakit;
        int yil;
        int fiyat;
        public HAraba(String mrk,String mdl, String ykt , int yl , int fyt){
            marka=mrk;
            model=mdl;
            yakit=ykt;
            yil=yl;
            fiyat=fyt;
        }
        public HAraba(String mrk,String mdl,int yl){
            // istersek parametreleri azaltarak da constructor olusturabiliriz
            marka=mrk;
            model=mdl;
            yil=yl;
        }
        public HAraba(){
            // gorunur durumdaki parametresiz constructor
            // default constructor DEGILDIR
            // Default constructor'in body'si de bos olur
            // ancak parametresiz constructor'da body'e kod yazilabilir
            // parametresiz constructor'in body'sinde kod yoksa
            // default constructor ile ayni islevi gorur
            // ama yine de gorunur durumdaysa default cons. denmez
        }
        // biz gozle gorunur herhangi bir constructor olusturdugumuzda
        // Java default constructor'i siler
        // Bu durumda daha once olusturulmus olan objelerin sorun olmamasi icin
        // class'a parametresiz bir constructor eklememiz faydali olur
        public String toString() {
            return "Araba Ozellikleri " +
                    "\nmarka : " + marka +
                    "\nmodel : " + model +
                    "\nyakit : " + yakit +
                    "\nyil : " + yil +
                    "\nfiyat : " + fiyat ;
        }
        public int maxHiz(String yakit){
            int maxHiz=120;
            if(yakit.equalsIgnoreCase("dizel")){
                maxHiz=200;
            } else if (yakit.equalsIgnoreCase("benzin")) {
                maxHiz=230;
            } else if (yakit.equalsIgnoreCase("elektrikli")) {
                maxHiz=180;
            }
            return maxHiz;
        }
    }
}
