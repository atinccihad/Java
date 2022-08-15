package i45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        Verilen bir array'deki tekrar eden elemanlari silip
        tekrarsiz halini array'e atayan kod yaziniz
         */
        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};
        Set<Integer> tekrarsizSet = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tekrarsizSet.add(arr[i]);
            }
        }
        System.out.println("Set: " + tekrarsizSet); // Set: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        for (int each : arr) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set: " + tekrarsizSet); // Set: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsizArr = new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        int i = 0;
        for (Integer each : tekrarsizSet) {
            tekrarsizArr[i] = each;
            i++;
        }
        arr = tekrarsizArr;
        System.out.println("Array'in son hali: " + Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
