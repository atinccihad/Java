package i06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir

        int--> Integer
        char--> Character
        digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */
        String str = "Java ile hayat ne güzel";
        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL

        boolean guzelMi = true;
        // guzelMi.  boolean primitive oldugundan hazir methodu bulunmuyor

        Boolean buGuzelMi = true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); // 32767

        String ogrenciNo = "123456";

        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");
        String sifre = scan.nextLine();

        Integer sifreSayi = Integer.parseInt(sifre);

        System.out.println("Girilen sifre: " + (sifre + 3));
        System.out.println("Integer sifre: " + (sifreSayi) + 3);

        /*
        Wrapper class'lar ileride kullanabilecegimiz pek cok faydali method icerir.
         */
    }
}
