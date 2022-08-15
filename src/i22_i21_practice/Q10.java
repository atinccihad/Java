package i22_i21_practice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = scan.nextLine();

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(ilkSonHarf(str, sayi));
    }

    private static String ilkSonHarf(String str, int sayi) {
        String s = str.substring(0, 1) + str.substring(str.length() - 1);
        String sonuc = "";

        for (int i = 1; i <= sayi; i++) {
            sonuc += s;
        }
        return sonuc;
    }
}
