package iJavaHomework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class H20 {
    public static void main(String[] args) {
        // Kullanicinin icinde su an bulundugu gunu ogrenip
        // Yine kullanicinin belirledigi, sayi sonrasi gunu
        // Consol'a yazdiriniz.
        int gunNumarasi = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Su an hangi gunde oldugunuzu giriniz ");
        String gun = scan.next().toLowerCase();
        System.out.println("Kac gun sonrasinin gununu ogrenmek istiyorsunuz?");
        int kacGunSonrasi = scan.nextInt();

        if (gunNumarasi <= 0) {
            System.out.println("Gun sayisi 0'dan buyuk olmali");
        } else if (gunNumarasi > 7) {
            gunNumarasi = (gunNumarasi + kacGunSonrasi) % 7;
        }
        switch (gun) {
            case "pazartesi":
                gunNumarasi = 1;
                break;
            case "sali":
                gunNumarasi = 2;
                break;
            case "carsamba":
                gunNumarasi = 3;
                break;
            case "persembe":
                gunNumarasi = 4;
                break;
            case "cuma":
                gunNumarasi = 5;
                break;
            case "cumartesi":
                gunNumarasi = 6;
                break;
            case "pazar":
                gunNumarasi = 7;
                break;
            default:
                System.out.println("Kac gun sonrasi gun sayisini ogrenmek icin sayi degeri giriniz!!");
        }

        String[] gunler = {"pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar"};

        System.out.println("Su an bulundugunuz gun: " + gun + " " + kacGunSonrasi + " gun sonraki gun " + gunler[(gunNumarasi + 2) % 7]);


    }
}
