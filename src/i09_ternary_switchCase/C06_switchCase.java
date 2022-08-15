package i09_ternary_switchCase;

import java.util.Scanner;

public class C06_switchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin
        Hafta ici veya hafta sonu oldugunu
        yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String input = scan.next().toLowerCase();

        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

    }
}
