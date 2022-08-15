package i04_dataCasting;

public class C01_dataCasting {

    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf = (char) (harf + 1); // kod bu durumda once sagdaki islemi yapar
        // char yeniHarf = 97 + 1  --> 98
        // char bir variable 98 olamayacagi icin Java hata verir
        System.out.println(yeniHarf); // b
        // bazen bir variable'a olusturuldugu data turu disindan deger atanabilir
        // bunlardan bazisini Java otomatik kabul eder

        // Java eger bu deger atamasinda sorun olusacagini
        // (data kayiplarinin olabilecegi veya datanin baskalasabilecegi) gorurse
        // bu durumda otomatik olarak bu atamayi kabul etmez
        // sizden bu atamayi istiyorsaniz sorumlulugu almanizi ister

        int sayi1 = (int) 7.3;
        System.out.println("sayi1: " + sayi1);

        double sayi2 = 10;
        System.out.println("sayi2: " + sayi2);// 10.0

        int sayi3 = 'c';
        System.out.println("sayi3: " + sayi3);// 99

        char harf2 = 98;
        System.out.println("harf2: " + harf2);// b

    }
}
