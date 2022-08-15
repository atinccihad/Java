package i18_while_doWhileLoop;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve bu sayilari tam bolen sayilari
        ve toplam kac tane olduklarini ekranda yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Tam bolenlerini bulmak icin bir tamsayi giriniz.");
        int firstNum = scan.nextInt();
        int num = firstNum;
        int bolen = 1;
        int count = 0;

        do {
            if (num % bolen == 0) {
                System.out.print(bolen + " ");
                bolen++;
                count++;
            } else {
                bolen++;
            }
        } while (num > bolen);
        System.out.println(firstNum + "\n'" + firstNum + "'" + " sayisinin " + (count + 1) + " adet tam boleni vardir.");

    }
}
