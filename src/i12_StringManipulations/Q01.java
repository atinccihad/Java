package i12_StringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresi girmesini isteyin, mail @gmail.com
        icermiyorsa "Lutfen gmail adresi giriniz", @gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gmail adresi giriniz");
        String email = scan.next();

        if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
