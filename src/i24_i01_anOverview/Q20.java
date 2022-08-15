package i24_i01_anOverview;

import java.lang.reflect.Array;
import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        /*
        20----
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunu yazınız.
        not: Test datadaki değerleri kullanınız.

        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
         */

        Scanner scan = new Scanner(System.in);

        int[] arr = {1232, 1134, 2345, 1022};
        System.out.println("Verilen Array'in ilk hali: "+Arrays.toString(arr));
        Arrays.sort(arr);
        List<Integer> arrayListInt = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            arrayListInt.add(arr[i]);
        }
        System.out.println("Array yapisi siralanip List'e donustukten sonra: "+arrayListInt);

                List<String> arrayListStr = new ArrayList<>();
                arrayListStr.add("Java");
                arrayListStr.add("Python");
                arrayListStr.add("PHP");
                arrayListStr.add("C#");
                arrayListStr.add("C Programming");
                arrayListStr.add("C++");
        System.out.println("Array yapisi siralanip List'e donustukten sonra: "+arrayListStr);


            }
        }


