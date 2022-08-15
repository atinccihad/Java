package i22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'in array yapan sembol []
        arrayList'de ise <>  diamond kullaniriz
         */
        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        // bir list'e eleman eklemek istersek
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse")); // true

        /*
        String'de bir method calistirdigimizda assign yapmazsak String degismiyordu

        String isim="Suleyman";
        isim.toUpperCase(); =>SULEYMAN
        sout(isim) => Suleyman

         */

        System.out.println(isimler); // [Basak, Ayse]

        /*
        List'in tek kotu tarafi Array  altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir
         */


    }
}
