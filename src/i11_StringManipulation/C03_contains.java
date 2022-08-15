package i11_StringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com") == (email.length() - 10)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
