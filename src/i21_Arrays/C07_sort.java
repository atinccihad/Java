package i21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[]sayilar={3,1,5,6,9,8,7};

        // Array'i Arrays class'ini kullanarak natural sirali hale getirebiliriz
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [1, 3, 5, 6, 7, 8, 9]
    }
}
