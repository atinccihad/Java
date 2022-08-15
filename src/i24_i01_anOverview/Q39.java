package i24_i01_anOverview;

import java.util.Arrays;

public class Q39 {
    public static void main(String[] args) {
        /*
         39-----
         Bir dizi içerisindeki pozitif tam sayı sayısını ve
         negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

         Örnek:
         countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
         [10, -65]
         // Toplam 10 pozitif sayı var.
         // Tüm negatif sayıların toplamı -65'tir.

         Notlar :
         Boş bir dizi verilirse, boş bir dizi döndürür: []
         0 pozitif değil.

         */
        int negativeNumCount = 0;
        int positiveNumCount = 0;
        int negativeNumSum = 0;

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [-15, -14, -13, -12, -11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeNumCount++;
                negativeNumSum += arr[i];
            } else if (arr[i] > 0) {
                positiveNumCount++;
            }
        }
        System.out.println(positiveNumCount + " adet pozitif sayı var.\nArray icindeki " + negativeNumCount + " adet negative sayinin toplami: " + negativeNumSum);
    }
}
