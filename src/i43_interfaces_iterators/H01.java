package i43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class H01 {
    public static void main(String[] args) {
        /*
        Bir listedeki ilk n elemani iterator kullanarak 5 artirin

        list:[2,13,56,23,45,14,40]

        artilarmasi istenen eleman sayisi :3

        output:[7,18,61,23,45,14,40]

         */
        int[] arr = {2, 13, 56, 23, 45, 14, 40};
        List<Integer> liste = new ArrayList<>();
        for (int each : arr) {
            liste.add(each);
        }
        System.out.println("liste = " + liste);//liste = [2, 13, 56, 23, 45, 14, 40]
        ListIterator lit1 = liste.listIterator();
        int n = 3;
        int i = 0;
        while (i <= 2) {
            liste.set(i, liste.get(i) + 5);
            lit1.next();
            i++;
        }
        System.out.println(liste);

    }
}

