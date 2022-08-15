package i22_i21_practice;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin = "mehmet.1234";
        int girisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("*********** WELCOME ************");

        while (true) {
            System.out.println("PIN code please= ");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("----------  NOKIA ---------  \n                           connectingPeople");
                break;
            } else {
                girisHakki--;
                System.out.println("Yanlis giris yaptiniz\nKalan giris hakkiniz= " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz tukendi..blocked");
                break;
            }
        }
    }
}
