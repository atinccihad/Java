package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_forEachLoop {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 0};
        List<Integer> liste = new ArrayList<>();

        // array'deki tum elemanlari inceleyelim
        // tek sayi olanlari list'e atayalim

        for (int each : arr) {// gelecek datalarin turu, loop icinde ne isim verdigim, nereden aldigim
            if (each % 2 == 1) {
                liste.add(each);
            }
        }
        System.out.println(liste);


    }
}
