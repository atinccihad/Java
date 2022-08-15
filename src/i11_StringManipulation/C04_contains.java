package i11_StringManipulation;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle isteyin.
        Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi iceriyorsa  tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk veya buyuk kelimesi icermiyor" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz giriniz");
        String cumle = scan.nextLine();
        cumle = cumle.toLowerCase();
        // requirements de buyuk kucuk harf hassasiyeti hakkinda birsey soylenmemis
        // ikinci olarak a her iki kelimeyi icerme durumu aciklanmamis
        // bu durumda gorevi aldigimiz kisiye sormamiz lazim

        // ikisini de iceriyorsa "Karar ver buyuk mu yazsin kucuk mu yazsin?"
        // case sensitive olmasin

        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("Karar ver buyuk mu yazsin kucuk mu yazsin?");
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle kucuk veya buyuk kelimesi icermiyor");
        }
    }
}
