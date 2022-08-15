package i08_ifStatements;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kenar uzunluklari girilen dikdortgenin
        Kare veya kare olmadigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        if (kenar1 == kenar2) {
            System.out.println("Girilen dikdortgen KARE");
        } else {
            System.out.println("Girilen dikdortgen KARE DEGIL");
        }
    }
}
