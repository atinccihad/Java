package i28_staticBlock;

public class C01_staticBlock {

    static int sayi;

    static {
    /*
    static block class uyelerinin tamamindan once calisir
    main method'dan bile once

    static block class olusturuldugunda calisir
    genellikle de classla ilgili on ayarlamalar veya
    static variable'lara deger atamak icin kullanilir

    static block larin class icerisinde nerede oldugu onemli degildir
    once static block'lar calisir

    birden fazla static block varsa yukaridan asagi calisir
    */
        System.out.println("static block calisti");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi); // 0 ilk degeri iken static block'tan sonra 10 degerini aldi

    }

    static {
        System.out.println("main method altindaki static block calisti");
    }

}
