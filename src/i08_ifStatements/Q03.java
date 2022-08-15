package i08_ifStatements;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Kullaniciya yasini sorun, eger 65'ten kucukse "Emekli olamazsin, calismalisin"
        // 65'e esit veya buyukse "Emekli olabilirsin" yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (yas < 65) {
            System.out.println("Emekli olamazsin, calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
