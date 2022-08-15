package i29_passByValue_immutable;

import java.util.Arrays;

public class H01 {
    public static void main(String[] args) {
        /*1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

         ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
          ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
           ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
         */


        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};

        System.out.println("arr'de eksik olan sayi: "+missingNumber(arr));
        System.out.println("arr1'de eksik olan sayi: "+missingNumber(arr1));
        System.out.println("arr2'de eksik olan sayi: "+missingNumber(arr2));
        System.out.println("arr3'de eksik olan sayi: "+missingNumber(arr3));

    }

    public static int missingNumber(int[] arr) {
        int missingNumber = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[arr.length - 1] == 9) {
                missingNumber = 10;
            } else if (arr[0] == 2) {
                missingNumber = 1;
            } else if ((arr[i] - arr[i - 1]) > 1) {
                missingNumber = arr[i] - 1;
            }
        }
        return missingNumber;
    }
}

