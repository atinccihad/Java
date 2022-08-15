package i07_ifStatements;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanicidan gun isimlerinden birinin ilk harfini isteyin
        // ve o harfle baslayan gun isimlerini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isminin bas harfini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        if (ilkHarf == 'P') {
            System.out.println("Pazartesi,Pazar,Persembe");
        }
        if (ilkHarf == 'C') {
            System.out.println("Carsamba,Cuma,Cumartesi");
        }
        if (ilkHarf == 'S') {
            System.out.println("Sali");
        }

    }
}
