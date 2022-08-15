package iJavaConditionalStatement;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Verilen bir tamsayının küpünü hesaplayan program yazınız.

        Test Verileri
        Giriş koşulları sayısı: 4
        Beklenen Çıktı :

        Sayı = 1 : küpü = 1 'dir.
        Sayı = 2 : küpü = 16 'dir.
        Sayı = 3 : küpü = 27 'dir.
        Sayı = 4 : küpü = 64 'dir.
         */
        Scanner scan = new Scanner(System.in);
        int cube = 1;
        System.out.println("enter the number you want to find the cube of");
        int num = scan.nextInt();

        for (int i = 1; i <= 3; i++) {
            cube *= num;
        }
        System.out.println("num= " + num + " cube of number= " + cube);
    }
}
