package i11_i09_practice;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi ve soyisminizi giriniz");
        String isim = scan.nextLine(),
                soyisim = scan.nextLine(); // multiple declaration
        String fullName = isim.concat(" " + soyisim).toUpperCase();
        System.out.println("fullName = " + fullName);
    }
}
