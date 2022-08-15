package iJavaHomework;

import java.util.Scanner;

public class H17 {
    public static void main(String[] args) {
        /*
         * Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini
         * hesaplayin. 45 hiz siniridir. Eger hiziniz 55-74 arasinda ise: Ceza 100
         * $'dir.
         *
         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         *
         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
         *
         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         *
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         *
         * örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         *
         * -----------------------------------------
         *
         * örn;
         *
         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * true;
         *
         * sonuc 320 olmalidir.
         *
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * false;
         *
         * sonuc 300 olmalidir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Aracin hizini ve ehliyetiniz olup olmadigini true false olarak giriniz");
        int hiz = scan.nextInt();
        boolean ehliyet = scan.nextBoolean();

        if (hiz <= 55 && ehliyet) {
            System.out.println("Iyi yolculuklar");
        } else if (hiz <= 74) {
            if (!ehliyet) {
                System.out.println("Ceza 300$");
            } else {
                System.out.println("Ceza 100$");
            }
        } else if (hiz <= 84) {
            if (!ehliyet) {
                System.out.println("Ceza 350$");
            } else {
                System.out.println("Ceza 150$");
            }
        } else if (hiz <= 94) {
            if (!ehliyet) {
                System.out.println("Ceza 520$");
            } else {
                System.out.println("Ceza 320$");
            }
        } else {
            if (!ehliyet) {
                System.out.println("Ceza 500$");
            } else {
                System.out.println("Ceza 700$");
            }
        }

    }
}
