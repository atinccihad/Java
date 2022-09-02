package i05_mathematicalOperations;

import java.util.Scanner;

public class R04 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

        1 şeker = 1.7 gr


        Örnek Çıktı:

        Yılda 12.41 kg şeker kullanıyor.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("1 gunde kac bardak cay iciyorsunuz?");
        int bardak = scan.nextInt();
        System.out.println("1 bardaga kac seker atiyorsunuz?");
        int seker = scan.nextInt();
        double sekerGramaj = 1.7;

        System.out.println("Yılda " + 365*bardak * seker * sekerGramaj / 1000 + " kg şeker kullanıyor.");

    }
}
