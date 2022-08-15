package i14_i12_practice;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir String giriniz");
        String kelime = scan.nextLine();

        if (kelime.length() != 4) {
            System.out.println("Lutfen 4 harfli bir String giriniz!!");
        } else {
            System.out.println(kelime.substring(3)
                    + kelime.substring(2, 3)
                    + kelime.substring(1, 2)
                    + kelime.substring(0, 1));
        }
    }
}
