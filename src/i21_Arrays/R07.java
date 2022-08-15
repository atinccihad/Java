package i21_Arrays;

import java.util.ArrayList;
import java.util.List;

public class R07 {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:
        [Python, JAVA, PHP, Perl, C#, C++]
         */
        String[] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        System.out.println("Verilen Array'in List hali=> " + arrList);
    }
}
