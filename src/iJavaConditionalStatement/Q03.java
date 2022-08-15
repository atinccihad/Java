package iJavaConditionalStatement;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç sayı alın ve en büyük sayıyı yazdırın.

        Test Verileri
        1. Numarayı girin: 25
        2. Numarayı girin: 78
        3. Numarayı girin: 87
        Beklenen Çıktı :
        En büyüğü: 87
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 1st 2st 3st number");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is  greatest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is  greatest number.");
        } else {
            System.out.println("num3 is  greatest number.");
        }
    }
}
