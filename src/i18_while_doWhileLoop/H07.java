package i18_while_doWhileLoop;

import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak icin sayi isteyin ve
        toplam 500'e ulasincaya kadar devam ettirin.
        Toplam 500'e ulastiginda veya gectiginde
        toplami ve kac sayi girildigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;


        do {
            System.out.println("Toplama eklemek uzere sayi giriniz");
            int sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        } while (toplam < 500);

        System.out.println("Yapilan isleme " + sayac + " adet sayi girmistir.\nIslem sonunda toplam= " + toplam + "'dir. ");
    }
}
