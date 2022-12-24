package iJavaHomework;

import java.util.Scanner;

public class H32 {
    public static void main(String[] args) {
        /*****************************************************************************************************v
         //  kullanıcıdan 5 sayı isteyin en büyügünü yazdırın
         *****************************************************************************************************/


        double enBuyukSayi = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("5 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        double sayi5 = scan.nextDouble();


        if (sayi1 > sayi2 && sayi1 > sayi3 && sayi1 > sayi4 && sayi1 > sayi5) {
            System.out.println("Girilen sayilarin en buyugu= " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi2 > sayi4 && sayi2 > sayi5) {
            System.out.println("Girilen sayilarin en buyugu= " + sayi2);
        } else if (sayi3 > sayi1 && sayi3 > sayi2 && sayi3 > sayi4 && sayi3 > sayi5) {
            System.out.println("Girilen sayilarin en buyugu= " + sayi3);
        } else if (sayi4 > sayi1 && sayi4 > sayi3 && sayi4 > sayi2 && sayi4 > sayi5) {
            System.out.println("Girilen sayilarin en buyugu= " + sayi4);
        } else if (sayi5 > sayi1 && sayi5 > sayi3 && sayi5 > sayi4 && sayi5 > sayi2) {
            System.out.println("Girilen sayilarin en buyugu= " + sayi5);
        }


    }
}
