package i11_StringManipulation;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
         /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("email adresi giriniz");
        String input = scan.nextLine();

        if (!input.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }


    }
}
