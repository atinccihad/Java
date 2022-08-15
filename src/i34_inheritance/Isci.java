package i34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Javada ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    mesela isci class'ini olusturunca nelere ihtiyaci var
    diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci oldugunu gorebiliriz
    Yeniden o variable ve methodlari olusturmak yerine
    Personel class'ini kendimize Parent ediniriz
    Bir class'i parent edinmek icin
    extends keyword kullanmaliyiz

    bir class baska bir class'i
    parent edindiginde
    1- parent class'daki tum ozelliklere
    otomatik olarak sahip olur
    2- parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- parent class'da olmayan bazi yeni ozellikler olusturabilir
    Not: parent class'daki ozelliklerden hicbirini reddedemez
         ama degistirebilir.
     */
    int personelNo = 1001;

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim); // Isim belirtilmedi
        // kendi class'imizda isim variable'i yok onun icin parent'a gideriz
        isci1.isim = "Selim";
        System.out.println(isci1.isim); // Selim
        System.out.println(isci1.personelNo); // 1001 kendi class'imizda varsa onu kullaniriz

        isci1.maas(); // Tum personelin maasi vardir

    }

    public void maas() {
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }

    public void ozelSigorta() {
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}
