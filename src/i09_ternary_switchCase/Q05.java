package i09_ternary_switchCase;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan bir sayi alin ve sayi 3 basamakli ise "uc basamakli sayi"
        // yoksa "uc basamakli degil" yazdirin
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println((sayi >= 100 && sayi < 1000) ? "uc basamakli sayi" : "uc basamakli degil");
    }
}
