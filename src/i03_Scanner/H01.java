package i03_Scanner;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        System.out.println("toplam,fark ve carpimlarini bulmak icin iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("Girilen sayilarin toplamlari=> " + (sayi1 + sayi2) +
                "\nGirilen sayilarin farklari=> " + (sayi1 - sayi2) +
                "\nGirilen sayilarin carpimlari=> " + (sayi1 * sayi2));
    }
}
