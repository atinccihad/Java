package i09_ternary_switchCase;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class R10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

        Eger aynı karakterlere sahipse

        "isim ayni karakterlere sahiptir." yazdirin.

        Eger ayni kaakterlere sahip degilse

        "Dizenin benzersiz karakterleri var" yazdirin.

        Ternary kullanin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Isim giriniz");
        String str = scan.nextLine();

        System.out.println(str.length()==3?
                        (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2))? "isim ayni karakterlere sahiptir." :
                                "Dizenin benzersiz karakterleri var":"adın uzunluğu 3 olmalıdır");

       /* if (str.length() == 3) {
            if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2)) {
                System.out.println("isim ayni karakterlere sahiptir.");
            }else {
                System.out.println("Dizenin benzersiz karakterleri var");
            }
        }*/
    }
}
