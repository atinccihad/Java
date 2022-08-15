package i20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R03 {
    public static void main(String[] args) {
        /*Bir String'i parametre olarak kabul eden
        ve verilen string'de bulunan rakamların toplamını yazdıran
        bir metot yazın.*/

        String str = "";
        System.out.println("Girilen String'in rakamlari toplami= " + rakamlariniTopla(str));
    }

    public static int rakamlariniTopla(String str) {
        Integer rakamlarToplami = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere bir String giriniz");
        str = scan.next();
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            rakamlarToplami += Integer.parseInt(arr[i]);
        }
        return rakamlarToplami;
    }
}
