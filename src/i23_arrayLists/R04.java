package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class R04 {
    public static void main(String[] args) {
        /*
        Girdi olarak verilen listedeki adlardan 'a' harflerini silen bir program yazın.

        giriş :
         list1={"Ali","Veli","Ayşe","Fatma","Ömer"}

         çıktı :

         [Veli, Ömer]
         */
        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Fatma");
        isimler.add("Ömer");
        System.out.println(isimler);
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains("a") || isimler.get(i).contains("A")) {
                isimler.remove(isimler.get(i));
            }
        }
        System.out.println(isimler);
    }
}
