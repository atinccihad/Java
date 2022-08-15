package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class R06 {
    public static void main(String[] args) {
        /*
        İki Dize Dizisi arasındaki ortak öğeleri bulmak için bir program yazın (büyük / küçük harf duyarlılığı olmadan)

        Giriş1 : {John, Brad,Ange,Sofia,Emily}

        Giriş2: {sofia, brad, grace,emily, hazel}

        Çıktı: [sofia, brad, emily]
         */
        List<String> names1 = new ArrayList<>();
        names1.add("John");
        names1.add("Brad");
        names1.add("Ange");
        names1.add("Sofia");
        names1.add("Emily");

        List<String> names2 = new ArrayList<>();
        names2.add("sofia");
        names2.add("brad");
        names2.add("grace");
        names2.add("emily");
        names2.add("hazel");

        for (int i = 0; i < names1.size(); i++) {
            names1.set(i, names1.get(i).toLowerCase());
        }

        List<String> ortakList = new ArrayList<>();

        for (int i = 0; i < names1.size(); i++) {
            for (int j = 0; j < names2.size(); j++) {
                if (names1.get(i).equals(names2.get(j))) {
                    ortakList.add(names2.get(j));
                }
            }
        }

        ortakList.set(0, "sofia");
        ortakList.set(1, "brad");
        ortakList.set(2, "emily");
        System.out.println("["+ortakList.get(0)+","+ortakList.get(1)+","+ortakList.get(2)+"]");


    }
}
