package i21_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H03 {
    public static void main(String[] args) {
        String str = "John";
        String[] arr = str.split("");
        List<String> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        System.out.println(arr1);

        String str1 = "John";
        String[] arr2 = str.split("");
        System.out.println(Arrays.toString(arr2));


    }
}
