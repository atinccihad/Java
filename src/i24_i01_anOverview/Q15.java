package i24_i01_anOverview;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        /*
        15----
        Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

        Test Data:
        Java is fun


        Beklenen Çıktı
        0. pozisyondaki karakter : J

        5. pozisyondaki karakter : i

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = scan.nextLine();

        System.out.println("Kacinci karakteri gormek istiyorsunuz?");
        int num = scan.nextInt();
        num = num - 1;

        System.out.println("Girilen String'deki " + (num + 1) + ".ci karakter: " + str.substring(num, num + 1));


    }
}
