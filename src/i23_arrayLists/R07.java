package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class R07 {
    public static void main(String[] args) {
        /*
        bir diziden belirli bir öğeyi kaldırmak ve kalan öğeleri yeni bir diziye koymak ve yeni diziyi yazdırmak için bir Java programı yazın

        Girdi: {1,2,3,4,5,6}

        eleman: 6

        Çıktı: [1,2,3,4,5]
         */
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(0, 1);
        nums1.add(1, 2);
        nums1.add(2, 3);
        nums1.add(3, 4);
        nums1.add(4, 5);
        nums1.add(5, 6);

        int kaldirilacakEleman = 6;

        List<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != kaldirilacakEleman) {
                nums2.add(i, nums1.get(i));
            }
        }
        System.out.println("[" + nums2.get(0) + "," + nums2.get(1) + "," + nums2.get(2) + "," + nums2.get(3) + "," + nums2.get(4) + "]");
    }
}
