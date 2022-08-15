package i08_i01_practice;

import java.util.Scanner;

public class Q09 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla ad, memleket,su anki konum, yas, boy degerlerini giriniz");
        String ad = scan.nextLine();
        String memleket = scan.nextLine();
        String konum = scan.nextLine();
        int yas = scan.nextInt();
        double boy = scan.nextDouble();
        System.out.println("Yasadiginiz yeri seviyor musunuz?");
        boolean seviyorMu = scan.nextBoolean();

        if (seviyorMu==true) {
            System.out.println("Ad: " + ad + "\nMemleket " + memleket + "\nKonum " + konum + "\nYas " + yas + "\nBoy " + boy);
        } else {
            System.out.println("Kullanici yasadigi yeri sevmedigi icin veri paylasilmiyor!!!");
        }
    }
}
