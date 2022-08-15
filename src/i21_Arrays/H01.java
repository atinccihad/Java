package i21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr3Length = 0;
        System.out.println("Array'e kac eleman gireceginizi yaziniz");
        arr3Length = scan.nextInt();
        int[] arr1 = new int[arr3Length];
        for (int i = 0; i < arr3Length; i++) {
            System.out.println("Array in " + (i + 1) + ". elmanini giriniz");
            arr1[i] = scan.nextInt();
        }
        System.out.println("Girilen Array: " + Arrays.toString(arr1));

    }
}
