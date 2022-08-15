package i28_staticBlock;

public class C03_passByValue {


    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hesaplayip bize donduren method olusturun
         */
        
        double satisFiyati=100;
        double indirimOrani=25;


        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {
        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);
        
        
        return indirimliFiyat;
        
        
    }
}
