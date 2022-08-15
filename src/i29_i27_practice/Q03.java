package i29_i27_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullanmayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int[] arr = {2, 5 - 9, 45, 43, 11, 8, 102, 102, 47, 0};
        int n = 4;

        // bir liste olusturailm
        List<Integer> list = new ArrayList<>();
        // listeye elemanlari ekleyelim
        for (int each : arr) {
            list.add(each);
        }

        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            int max = list.get(0); //list'in ilk elemani max olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max && !(maxList.contains(list.get(i)))) { // listenin herhangi bir elemani max'dan buyukse max o eleman olsun
                    max = list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max)); // max liste ekledigim sayiyi listeden kaldiriyorum
            count++;
        }
        System.out.println("Array'in max " + n + " elemani " + maxList);


    }
}
