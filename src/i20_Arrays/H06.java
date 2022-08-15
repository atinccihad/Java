package i20_Arrays;

import java.util.Arrays;

public class H06 {
    public static void main(String[] args) {
        /*
        Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
                Array olarak yazdiran bir method yaziniz.
         */
        int[] arr = {4, 9, 5, 8, 7};
        yeniArray(arr);
    }

    private static void yeniArray(int[] arr) {
        int istenen = 5;

        int[] arrYeni = new int[arr.length - 1];


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != istenen) {
                arrYeni[i] = arr[i];
            } else {
                arrYeni[i] = arr[arr.length - 1];
            }
        }
        Arrays.sort(arrYeni);
        System.out.println(Arrays.toString(arrYeni));
    }
}
