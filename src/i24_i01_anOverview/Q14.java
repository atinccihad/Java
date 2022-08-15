package i24_i01_anOverview;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        /*
         14----
         Girilen iki String veriyi karşılaştıran Java kodu yazınız.


         Test data:
         1. String : techproed.com
         2. String : Techproed.com

         Beklenen Çıktı:
         False

         Test data:
         1. String : techproed.com
         2. String : techproed.com

         Beklenen Çıktı:
         true
         */
        String str1 = "";
        String str2 = "";
        System.out.println(ikiStringKarsilastir(str1, str2));
    }

    private static boolean ikiStringKarsilastir(String str1, String str2) {
        boolean ayniMi = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Karsilastirmak icin iki String giriniz");
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        if (str1.equals(str2)) {
            ayniMi = true;
        }

        return ayniMi;
    }
}
