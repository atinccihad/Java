package i18_while_doWhileLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H10 {
    static List<Integer>sayi1Bolenler=new ArrayList<>();
    static List<Integer>sayi2Bolenler=new ArrayList<>();
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve lcm'yi (En Küçük Ortak Çoklu) bulun.

       Giriş :
       
       30 ve 40
       
       Beklenen çıktı:
       
       30 ve 40 = 10 için GCD
       
       30 ve 40 = 120 için LCM
         */

        int ekok=1;
        int ebob=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("2 tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        for (int i = 1; i < sayi1; i++) {
            if (sayi1%i==0){
                sayi1Bolenler.add(i);
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2%i==0){
                sayi2Bolenler.add(i);
            }
        }
        System.out.println("sayi1Bolenler = " + sayi1Bolenler);
        System.out.println("sayi2Bolenler = " + sayi2Bolenler);

        int ebobb=1;
        int ekokk=1;
        for (int i = 0; i < sayi1Bolenler.size(); i++) {
            for (int j = 0; j < sayi2Bolenler.size(); j++) {


             if (sayi1Bolenler.get(i).equals(sayi2Bolenler.get(j))){
                  ebobb*=sayi1Bolenler.get(i);
             }


            }
        }
        System.out.println("ebobb = " + ebobb);
        System.out.println("ekokk = " + ekokk);

    }
}
