package i10_StringManipulation;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        // 2 kelime oluşturun: isim1 ve isim2

        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor
        Scanner scan = new Scanner(System.in);
        System.out.println("2 kelime giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if (str1.length() % 2 == 0) {
            System.out.println(str1.substring(0, str1.length() / 2) + str2 + str1.substring(str1.length() / 2));
        } else {
            System.out.println("isim1, isim2 ye eklenemiyor");
        }
    }
}
