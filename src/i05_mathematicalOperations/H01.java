package i05_mathematicalOperations;

public class H01 {
    public static void main(String[] args) {
        double sayi4 = 255.36;
        float flt = 1.2F;
        int sayi1 = 120000;
        short sayi2 = (short) sayi1;
        int sayi5 = (int) sayi4;
        byte sayi6 = (byte) sayi5;

        // Soru5) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        int sayi7 = 12355;
        int sayi8 = 162;
        System.out.println("sayi7/sayi8 => " + sayi7 / sayi8); // sayi7/sayi8 => 76

        // Soru6) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        double sayi9 = 123.25;
        System.out.println("sayi7/sayi9 => " + sayi7 / sayi9); // sayi7/sayi9 => 100.24340770791075

        // Soru7) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
        System.out.println("double/float => " + sayi4 / flt + " byte*float => " + sayi6 * flt + " int-short => " + (sayi1 - sayi2));
        //                  double/float =>  212.79999154408807 byte*float =>        -1.2         int-short =>         131072
    }
}
