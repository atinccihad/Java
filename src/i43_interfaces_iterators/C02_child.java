package i43_interfaces_iterators;

public class C02_child implements I01_InterfaceBodyOlanMethod {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface'de abstract olan 3 method'u implement ettigimizde
    Java itirazini durudurur
    sonradan ekledigimiz default veya
    static keyword ile tanimladigimiz methodlari implement etmememiz sorun olusturmadi

    O zaman nicin 2 keyword(static default) tanimlanmistir?
    Bu 2 farkli kelimenin amaci child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi  yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir
     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_child obj = new C02_child();
        obj.teker();
    }

}
