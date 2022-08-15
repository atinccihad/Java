package i45_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class H02 {
    public static void main(String[] args) {
        /*
        Ilk soruya 3. bir islem ekleyelim,
        set'i Hashset olarak olusturup
        elemanlari ekleyelim ve sonra TreeSet'e cevirip yazdiralim
         */
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(100);
            hashSet.add(num1);
        }
        System.out.println("");
        System.out.println("hashSet = " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);

        System.out.println("TreeSet = " + treeSet);

    }
}
