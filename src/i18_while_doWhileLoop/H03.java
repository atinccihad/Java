package i18_while_doWhileLoop;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degeri ve bitis degeri dahil aralarindaki
        tum cift tamsayilari while loop kullanarak yazdiriniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Programda kullanilacak, baslangic ve bitis icin iki tamsayi giriniz.");
        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();


        while (baslangic <= bitis) {
            if (baslangic % 2 == 0) {
                System.out.print(baslangic + " ");
            }
            baslangic++;
        }
    }
}
