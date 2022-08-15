package i09_ternary_switchCase;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        // Kullanicidan gun ismini alip hafta ici veya haftasonu yazdiralim
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gun ismi giriniz");
        String gun = scan.next().toLowerCase();

        switch (gun) {
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
                System.out.println("Lutfen gun icin gecerli bir veri giriiniz!!!");
        }
    }
}
