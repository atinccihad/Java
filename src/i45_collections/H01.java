package i45_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class H01 {
    public static void main(String[] args) {
        /*
        Bir TreeSet ve HashSet'e random 100 sayi ekleyin
        islem surelerini kiyaslayin
         */
        Random random = new Random();

        TreeSet<Integer> treeSet = new TreeSet<>();

        HashSet<Integer> hashSet = new HashSet<>();

        LocalTime saat1 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            int num1 = random.nextInt(100);
            System.out.print(num1 + " ");
            treeSet.add(num1);
        }
        System.out.println("");
        LocalTime saat2 = LocalTime.now();


        Integer num3 = 0;
        LocalTime saat3 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            num3 = random.nextInt(100);
            System.out.print(num3 + " ");
            hashSet.add(num3);
        }
        System.out.println("");
        LocalTime saat4 = LocalTime.now();


        System.out.println("TreeSet " + (saat2.getNano() - saat1.getNano()) + " nano saniye");
        System.out.println("HashSet " + (saat4.getNano() - saat3.getNano()) + " nano saniye");

        Long time = System.currentTimeMillis();


    }
}
