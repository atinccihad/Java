package i43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();

    public void yakit();

    public abstract String aku();

    /*
    normal bir class'da oldugumuzu dusunursek
    iki tane access modifier kullanma ihtimali olamaz

    asagidaki method'da goreceginiz gibi
    interdace'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java8'den sonra kullanilmaya baslamistir
    bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi

    bu ozellik sayesinde basina default veya static keyword ekleyerek
    ınterface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan override edilme MECBURİYETİ OLMAZ
    ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz

    Bu method'larin body'si olsa da bunlara condrete method denmez
    ama override edilme mecburiyetleri yoktur.

    buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi icindir.

    O zaman nicin 2 keyword(static default) tanimlanmistir?
    Bu 2 farkli kelimenin amaci child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi  yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir
     */

    public default void teker() {
        System.out.println("default....Tum arabalarin tekeri vardir");
    }

    public static void direksiyon() {
        System.out.println("static.....Tum arabalarin direksiyonu vardir");
    }
}
