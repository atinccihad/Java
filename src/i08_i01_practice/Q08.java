package i08_i01_practice;

import java.util.Scanner;

public class Q08 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak uzere iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("Girilen sayilarin toplami= " + (sayi1 + sayi2));
    }
}
