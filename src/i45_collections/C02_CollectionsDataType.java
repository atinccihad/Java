package i45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataType {
    public static void main(String[] args) {
        /*
        Collections < > icerisinde data turunu Object secmeniz durumunda
        Collection'a farkli data turunde objeler koymaniza izin verir
        Bu depolama acisindan bize esneklik kazandirir
        Ancak islem yaparken tum objeleri Object olarak
        tanimladigimizdan cok fazla
        casting yapmamiz gerekebilir.
         */

        List<String> liste = new ArrayList<>();
        // liste.add(5);
        // liste.add('s');
        // liste.add(false);

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(false);
        list.add("Ali");

        System.out.println(list); //  [5, s, false, Ali]

        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+" Can");
        System.out.println(list);

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add("Ali");
        set1.add(true);
        set1.add('c');
        set1.add(789);
        System.out.println("set1 = " + set1); // set1 = [c, 5, 789, Ali, true]
    }
}
