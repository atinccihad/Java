package i07_ifStatements;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
        Test Data:
        12
        34
        23
        Beklenen Çıktı:

        En Buyuk Sayi: 34
         */
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("En Buyuk Sayi: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("En Buyuk Sayi: " + num2);
        } else {
            System.out.println("En Buyuk Sayi: " + num3);
        }
    }
}
