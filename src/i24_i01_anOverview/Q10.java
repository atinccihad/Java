package i24_i01_anOverview;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

        Test Data:
        Java is easy

        Aranan String: is

        Bektenen Çıktı:
        True

        Aranan String: and

        Beklenen Çıktı:False
         */
        boolean bulduMu = false;
        String arr[] = {};
        Scanner scan = new Scanner(System.in);
        System.out.println("String kumesi icin String giriniz");
        String str = scan.nextLine();
        arr = str.split(" ");

        System.out.println("Girilen String'in array version'u=> " + Arrays.toString(arr));

        System.out.println("Stringde aramak istediginiz minString'i giriniz");
        String arananString = scan.next();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arananString)) {
                bulduMu = true;
            }
        }
        System.out.println(bulduMu);

    }
}
