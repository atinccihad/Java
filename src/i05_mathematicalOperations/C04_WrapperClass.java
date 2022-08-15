package i05_mathematicalOperations;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str = "Java Cok guzel";
        str.toUpperCase();

        int sayi = 10;
        // primitive data turlerinin yaninda methodlar olmaz
        // java bazi methodlari kullanabilmemiz icin
        // herbir primitive data turu icin wrapper class olusturmustur
        Integer sayi2 = 10;
        sayi2.byteValue();
    }
}
