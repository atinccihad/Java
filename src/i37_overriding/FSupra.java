package i37_overriding;

public class FSupra extends EToyota {

    void yakit() {
        System.out.println("Supra benzin kullanir");
    }
    /*
    Private methodlar override edilemez
    Eger child class'da parent class'daki private method ile
    ayni signature'de bir method olusturursaniz
    bu overriding method OLMAZ


     */

    @Override
    void motor() {
        /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir

           @Override kullanmak mecburi degildir
           Eger overridding method silinirse kodun cte vermesini istersek
           @Override notasyonu kullanmaliyiz
         */
    }
}
