package i24_i01_anOverview;

import java.util.ArrayList;
import java.util.List;

public class Q26 {
    public static void main(String[] args) {
        /*
        26-----
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:
        [Python, JAVA, PHP, Perl, C#, C++]
         */
        String[]arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String>listArr=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            listArr.add(i,arr[i]);
        }
        System.out.println("Verilen Array'in List hali=> "+listArr);

    }
}
