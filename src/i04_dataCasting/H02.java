package i04_dataCasting;

public class H02 {
    public static void main(String[] args) {
        // Soru2) int veri turunde bir degisken olusturun ve adim narrowing yapin ve yazdirin
        int sayi1 = 120000;

        short sayi2 = (short) sayi1;
        System.out.println("narrowing sonrasi sayi2=> " + sayi2); // narrowing sonrasi sayi2=> -11072

        byte sayi3 = (byte) sayi1;
        System.out.println("narrowing sonrasi sayi3=> " + sayi3); // narrowing sonrasi sayi3=> -64

        // Soru3) Float data turunde bir variable olusturun ve yazdirin
        float flt = 1.2F;
        System.out.println("Float degeri=> " + flt);

        // Soru4) double 255.36 sayisini int'a ve sonra da
        // olusturdugunuz int sayiyi byte'a cevirip yazdirin
        double sayi4 = 255.36;
        int sayi5 = (int) sayi4;
        byte sayi6 = (byte) sayi5;
        System.out.println("double sayi4=255.36  degerinin sonrasinda int veri tipine çevrilen sayi4=> " + sayi5 + " int veri tipinden byte'a cevrilen sayi4=> " + sayi6);
        //                  double sayi4=255.36  degerinin sonrasinda int veri tipine çevrilen sayi4=>     255   int veri tipinden byte'a cevrilen sayi4=>    -1
    }
}
