package iJavaConditionalStatement;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan üç sayı kabul eden ve sayılar artan düzende ise "artan",
         sayılar azalan düzende ise "azalan"
         ve aksi halde "Artan veya azalan düzende" yazan bir program yazın.

         Test Verileri
         Giriş ilk numarası: 1524
         Giriş ikinci numarası: 2345
         Giriş üçüncü numarası: 3321
         Beklenen Çıktı :

         Artan düzen
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        double x = scan.nextDouble();
        System.out.print("Input second number: ");
        double y = scan.nextDouble();
        System.out.print("Input third number: ");
        double z = scan.nextDouble();
        if (x < y && y < z) {
            System.out.println("Increasing order");
        } else if (x > y && y > z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
