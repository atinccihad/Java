package i11_i09_practice;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        gunleri gösterebilen bir program yazın
        gun Pazartesi veya Sali ise:
        Java dersi gunleri
        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri
        gun carsamba veya cumartesi ise:
        SQL dersi gunleri
        aksi halde: izin gunu
        (if deyimini KULLANMAYIN)
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
