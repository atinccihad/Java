package i20_Arrays;

import java.util.Arrays;

public class R01 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int ters[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            ters[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(ters));
    }
}
