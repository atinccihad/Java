package i23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        List ile calisirken en kotu ozelligi
        elemanlari tek tek eklemek
         */

        Integer[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 4, 2, 0, 9, 8, 5, 4, 7, 1, 0};
        /*
        bu kadar fazla elemanli bir listeyi tek tek eleman olarak girmek yerine
        array olusturup for loop ile olusturdugumuz list'e tasiyabiliriz
         */
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 4, 5, 6, 9, 8, 7, 6, 4, 2, 0, 9, 8, 5, 4, 7, 1, 0]

        /*
        Bu islemi yapmasi icin Java'nin olusturdugu bir method'da var
        Ancak bu yontemin cok yan etkisi var

        1- Bu sekilde olusturulan listede add, remove gibi size'i degistiren methodlar kullanilamaz
        2- asList method'u ile olusturulan liste
        ve kaynak olan array birbiri ile ilisik olarak hayatlarina devam ederler birinde yaptigimiz degisiklik digerinede otomatik olarak isler.
         */
        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 4, 5, 6, 9, 8, 7, 6, 4, 2, 0, 9, 8, 5, 4, 7, 1, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 4, 5, 6, 9, 8, 7, 6, 4, 2, 0, 9, 8, 5, 4, 7, 1, 0, 5]

        /*
        sayilar2.add(5);
        System.out.println(sayilar2);   UnsupportedOperationException
        */
        arr[0] = 20;
        System.out.println(Arrays.toString(arr)); // [20, 3, 4, 5, 6, 9, 8, 7, 6, 4, 2, 0, 9, 8, 5, 4, 7, 1, 0]
        System.out.println("arrayde degisiklik yaptiktan sonra sayilar2 " + sayilar2); // [20, 3, 4, 5, 6, 9, 8, 7, 6, 4, 2, 0, 9, 8, 5, 4, 7, 1, 0]


    }
}
