package i29_i27_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0
        //    Test data
        //    hackerDili("java ile hersey guzel")
        //    j4v4 1l3 h3r53y guz3l
        //    İpucu harfleri değiştirin ve ekrana yazdırın.
        String sonStr = "";
        List<String> strList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Metin giriniz");
        String str = scan.nextLine();

        hackerDili(str);

    }

    private static void hackerDili(String str) {
        String sonStr = "";
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            strList.add(str.substring(i, i + 1));
        }
        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i).equals("s")) {
                strList.set(i, "5");
            }
            if (strList.get(i).equals("a")) {
                strList.set(i, "4");
            }
            if (strList.get(i).equals("e")) {
                strList.set(i, "3");
            }
            if (strList.get(i).equals("i")) {
                strList.set(i, "1");
            }
            if (strList.get(i).equals("o")) {
                strList.set(i, "0");
            }
        }

        System.out.println(strList);

        for (int i = 0; i < strList.size(); i++) {
            sonStr += strList.get(i);
        }
        System.out.println(sonStr);
    }

}
