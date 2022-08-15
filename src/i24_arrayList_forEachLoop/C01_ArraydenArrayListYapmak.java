package i24_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr = {"Ismail", "Nurullah", "Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine
        Array olusturup bunlari list'e cevirmek daha pratik olabilir
        1- loop ile array'deki tum elementleri liste atabiliriz
        2- Arrays.asList() kullanabiliriz
           Ancak bu methodun 2 kotu yani vardir
           - Arrays class'i kullanildigi icin Array ozellikleri gecerli olur
             dolayisiyla List'de olan add, remove gibi size'i degistiren methodlar
             bu sekilde olusturulan List'lerde kullanilamaz
           - Kaynak olan array ile List ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir.
         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

        // 1. yan etki
        // sinifList.add("Erdi");    UnsupportedOperationException
        // sinifList.remove(1);      UnsupportedOperationException

        // 2. yan etki
        arr[1] = "Emre";
        System.out.println("degisim sonrasi array: " + Arrays.toString(arr)); // degisim sonrasi array: [Ismail, Emre, Fatih]
        System.out.println("Array'i degistirince List: " + sinifList); // Array'i degistirince List: [Ismail, Emre, Fatih]

        sinifList.set(0, "Utku");
        System.out.println("List'i degistirince sinifListesi: " + sinifList); // List'i degistirince sinifListesi: [Utku, Emre, Fatih]
        System.out.println("List'i degistirince array: " + Arrays.toString(arr)); // List'i degistirince array: [Utku, Emre, Fatih]


    }
}
