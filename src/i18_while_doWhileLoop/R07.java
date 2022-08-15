package i18_while_doWhileLoop;

import java.util.Scanner;

public class R07 {
    public static void main(String[] args) {
        /*
        Java kodunu yazın, numaranın Mükemmel sayı olup olmadığını kontrol edin.

        Sayının kendisi hariç pozitif bölenlerinin toplamı bu sayıya eşitse, herhangi bir sayı Java Mükemmel bir Sayı olabilir.
        Giriş: 6 Çıkış: 6 Mükemmel Sayı Giriş: 7 Çıkış: 7 Mükemmel Sayı değil
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mukemmel sayi kontrolu icin sayi giriniz");
        int num = scan.nextInt();

        int toplam = 0;
        int bolen = 1;
        while (num > bolen) {
            if (num % bolen == 0) {
                toplam += bolen;
            }
            bolen++;
        }
        if (toplam == num) {
            System.out.println("Mukemmel");
        } else {
            System.out.println("Mukemmel degil");
        }

    }
}
