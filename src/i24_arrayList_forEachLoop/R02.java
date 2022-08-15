package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.

        Giriş : 5

        Çıktı : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */
        List<Integer> ilkOn=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int count=0;
        List<Integer>asalSayilar=new ArrayList<>();

        for (int i = sayi; i < 1000; i++) {
            for (int j = 1; j < sayi; j++) {
                if (i%j==0){
                    count++;
                }
                if (count==2){
                    asalSayilar.add(i);
                }
            }
        }
        System.out.println(asalSayilar);





    }
}
