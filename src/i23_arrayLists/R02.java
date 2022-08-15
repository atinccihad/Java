package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class R02 {
    public static void main(String[] args) {
        /*
        10 Öğeli bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.

        GİRDİ : String[] isimler = {"Ümit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan","Ahmet", "Ali"};

        Çıktı:

        [Ümit,Emin, Furkan, Kerem, Taylan, Orhan,Sinan, Kemal,Ahmet, Ali]
         */
        List<String> isimler = new ArrayList<>();
        isimler.add("Ümit");
        isimler.add("Emin");
        isimler.add("Kemal");
        isimler.add("Kerem");
        isimler.add("Taylan");
        isimler.add("Orhan");
        isimler.add("Sinan");
        isimler.add("Furkan");
        isimler.add("Ahmet");
        isimler.add("Ali");
        System.out.println("swap oncesi: " + isimler); // [Ümit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
        String str1 = isimler.get(2);
        System.out.println(str1);
        String str2 = isimler.get(isimler.size() - 3);
        System.out.println(str2);
        isimler.set(isimler.size() - 3, str1);
        isimler.set(2, str2);
        System.out.println("swap sonrasi: " + isimler);

    }
}
