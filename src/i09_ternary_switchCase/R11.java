package i09_ternary_switchCase;

import java.util.Scanner;

public class R11 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

        INPUT   : Mustafa

        OUTPUT  : fafafa
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Isim giriniz");
        String str=scan.nextLine();

        System.out.println(str.substring(str.length() - 2)+str.substring(str.length()-2)+str.substring(str.length()-2));

    }
}
