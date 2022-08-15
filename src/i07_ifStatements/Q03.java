package i07_ifStatements;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi == "pazartesi" || gunIsmi == "sali" || gunIsmi == "carsamba" || gunIsmi == "persembe" || gunIsmi == "cuma") {
            System.out.println("Girdiginiz gun hafta ici");
        }
        if (gunIsmi == "pazar" || gunIsmi == "cumartesi") {
            System.out.println("Girdiginiz gun hafta sonu");
        }

    }
}
