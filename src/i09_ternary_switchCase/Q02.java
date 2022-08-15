package i09_ternary_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi % 2 == 0 ? "Girilen sayi cift" : "Girilen sayi tek");
    }
}
