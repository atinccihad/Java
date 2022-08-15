package i24_i01_anOverview;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        11----
        Kullanıcıdan alınan Stringin son karakterini silip ekrana yazan Java kodunu yazınız.

        Test Data:
        good

        Beklenen Çıktı:
        goo
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Son karakteri silinecek olan String'i giriniz ");
        String str = scan.nextLine();

        str = str.replace(str.substring(str.length() - 1), "");
        System.out.println("Son karakteri silindikten sonra String=> " + str);


    }
}
