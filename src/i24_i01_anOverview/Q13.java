package i24_i01_anOverview;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /*
        13----
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

        Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

        Test Data:
        madam

        Beklenen Çıktı:
        True
         */
        boolean palindromMu = false;
        String terStr = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("palindrom sorgusu icin  giris yapiniz");
        String str = scan.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            terStr += str.substring(i, i + 1);
        }
        if (terStr.equals(str)) {
            palindromMu = true;
        }


        if (palindromMu == true) {
            System.out.println("Girilen metin palindrom");
        } else {
            System.out.println("Girilen metin palindrom degil");
        }


    }
}
