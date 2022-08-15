package i14_i12_practice;

import java.util.Scanner;

public class Q04 {
    /*
     Kullanicidan bir kelime girmesini isteyin.
     * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
     * kelimenin ortasindaki karakteri yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelimeyi giriniz");
        String kelime = scan.next();

        if (kelime.length() >= 3 && kelime.length() % 2 == 1) {
            System.out.println("Girilen String'in ortasindaki karakter=> " + kelime.substring(kelime.length() / 2, kelime.length() / 2 + 1));
        } else {
            System.out.println("Kelime 3 veya daha fazla karakter icermeli" + "\nAyrica tek sayida karakter icermeli");
        }
    }
}
