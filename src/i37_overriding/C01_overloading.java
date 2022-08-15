package i37_overriding;

public class C01_overloading {

    public static void main(String[] args) {
        /*
        Bir class'da ayni isimde ve ayni signature ye sahip 2 method olmaz
        Ayni class'da ayni isimde birden fazla method olusturmak istersek mutlaka
        signature'i degistirmeliyiz

        Farkli class'larda atni isim ve signature'e sahip 2 method olabilir mi?
         */
    }

    void ekleme() {

    }

    void ekleme(int sayi) {

    }

    void ekleme(String str) {

    }

    void ekleme(String str, int sayi) {

    }

    void ekleme(int sayi, String str) {

    }


}
