package i21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.

        not: Test datadaki değerleri kullanınız.

        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]
        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac deger gireceginizi yaziniz");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 1; i <= arrLength; i++) {
            System.out.println("Array'in " + i + ".ci elemanini giriniz");
            arr[i - 1] = scan.nextInt();
        }
        System.out.println("Girilen Array'in siralamasiz hali " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Girilen Array'in siralanmis hali " + Arrays.toString(arr));

    }
}
