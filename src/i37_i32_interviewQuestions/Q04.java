package i37_i32_interviewQuestions;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        //bunu kart sifre kontrol de de kullabilirinisz
        Scanner scan = new Scanner(System.in);
        String sifre = "erdal.bey123";
        int girisSayisi = 3;


        while (true) {
            System.out.println("PIN giriniz");
            String girilenSifre = scan.nextLine();

            if (sifre.equals(girilenSifre)) {
                System.out.println("Sifre basari ile tanimlandi");
                break;
            } else {
                System.out.println("Sifre yanlis");
                girisSayisi--;
                System.out.println("Kalan giris hakkiniz: " + girisSayisi);
            }
            if (girisSayisi == 0) {
                System.out.println("Blocked " + girisSayisi);
                break;
            }
        }


    }
}
