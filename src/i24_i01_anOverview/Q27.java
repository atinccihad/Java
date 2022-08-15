package i24_i01_anOverview;

import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        /*
        27----
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

        Array: [1232,2345,5467,678,3454,2312,3451]
         */
        int ikinciBuyukSayi = 0;
        int arr[] = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [678, 1232, 2312, 2345, 3451, 3454, 5467]
        ikinciBuyukSayi = arr[1];
        System.out.println("Arraydeki ikinciBuyukSayi = " + ikinciBuyukSayi);

    }
}
