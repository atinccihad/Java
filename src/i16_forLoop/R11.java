package i16_forLoop;

import java.util.Scanner;

public class R11 {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
        Input :
        6
        Output:
        6 Mukemmel Sayidir.
        ======================
        Input
        7
        Output:
        7 Mukemmel Sayi degildir.
         */
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sum += i;
            }
        }
        if (sum == sayi) {
            System.out.println(sayi + " Mukemmel Sayidir.");
        } else {
            System.out.println(sayi + " Mukemmel Sayi degildir.");
        }
    }
}
