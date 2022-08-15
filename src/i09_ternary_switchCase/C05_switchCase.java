package i09_ternary_switchCase;

import java.util.Scanner;

public class C05_switchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun numarasini alip
        1 ise pazartesi,...
        7 ise pazar
        yazdiralim
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();
        /*
        switch yanina yazilan  ( ) neye gore case atayacagimizi gosterir
        Java girilen degore gore case'i bulur ve o satirdan calistirmaya baslar

        if-else if -... else  yapisinda oldugu gibi
        hicbir sarta uymayanlari default notasyonu ile ayiririz
         */

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gun numarasi giriniz");

        }

    }
}
