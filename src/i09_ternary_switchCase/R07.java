package i09_ternary_switchCase;

import java.util.Scanner;

public class R07 {
    public static void main(String[] args) {
        /*
        2 kelime oluşturun: isim1 ve isim2

        name1 çift sayıda karakter içeriyorsa,

        sonra ikinci kelimeyi ilk adın ortasına yerleştirin

        ilk kelimenin tek sayıları varsa

        Ardından “Ad2, ad1'e eklenemiyor” yazdırın.

        Örneğin:

        isim1 = mehmet

        isim2= ahmet

        Yazdır ==> mehahmetmet
         */
        String kelime2 = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Cift sayida karakter iceren Kelime giriniz");
        String kelime1 = scan.nextLine();
        if (kelime1.length() % 2 == 0) {
            System.out.println("Ilk girilen kelimenin ortasina yerlestirilmesi icin kelime girin");
            kelime2 = scan.nextLine();
        } else {
            System.out.println("Cift sayida karakter iceren Kelime girmeliydiniz");
        }
        String kelime3 = kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2);
        System.out.println(kelime3);

    }
}
