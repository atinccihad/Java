package i09_ternary_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi pozitifse "Sayi pozitif" yazdirin
        // negatifse sayinin karesini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi > 0 ? "Sayi pozitif" : sayi * sayi);
    }
}
