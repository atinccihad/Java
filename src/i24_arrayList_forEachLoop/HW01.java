package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        /*
        1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.                                                                                                                                                                                                 1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */

        String cumle = "";
        String kelime = "";
        cumleIcindenKelimeCikart(cumle, kelime);

    }

    private static void cumleIcindenKelimeCikart(String cumle, String kelime) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz");
        cumle = scan.nextLine();
        System.out.println("Cumle icinden cikarmak istediginiz kelimeyi giriniz");
        kelime = scan.next();


        List<String> cumleList = new ArrayList<>();
        String[] cumleArr = cumle.split(" ");
        for (int i = 0; i < cumleArr.length; i++) {

            if (kelime.equals(cumleArr[i])) {
                kelime = "";
            } else
                cumleList.add(cumleArr[i]);

        }
        System.out.println("Cumle'den cikarilacak kelime: " + kelime);
        System.out.println("Cumle'nin yeni List hali: " + cumleList);
        String yeniCumle = "";
        for (int i = 0; i < cumleList.size(); i++) {
            yeniCumle += cumleList.get(i) + " ";
        }
        System.out.println("Cumlenin String hali: " + yeniCumle);


    }
}
