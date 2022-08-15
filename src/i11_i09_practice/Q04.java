package i11_i09_practice;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
       /*
       0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
       kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
       cikis "Gecersiz" olmalidir
       NestedIf ve Ternary kullanarak 2 yolla da cozunuz
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("0-9 arasinda bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi == 9 ? "dokuz" :
                sayi == 8 ? "sekiz" :
                        sayi == 7 ? "yedi" :
                                sayi == 6 ? "alti" :
                                        sayi == 5 ? "bes" :
                                                sayi == 4 ? "dort" :
                                                        sayi == 3 ? "uc" :
                                                                sayi == 2 ? "iki" :
                                                                        sayi == 1 ? "bir" :
                                                                                sayi == 0 ? "sifir" :
                                                                                        sayi < 1 || sayi > 9 ? "Gecersiz" : "Gecersiz");
        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 9) {
                System.out.println("dokuz");
            } else if (sayi == 8) {
                System.out.println("sekiz");
            } else if (sayi == 7) {
                System.out.println("yedi");
            } else if (sayi == 6) {
                System.out.println("alti");
            } else if (sayi == 5) {
                System.out.println("bes");
            } else if (sayi == 4) {
                System.out.println("dort");
            } else if (sayi == 3) {
                System.out.println("uc");
            } else if (sayi == 2) {
                System.out.println("iki");
            } else if (sayi == 1) {
                System.out.println("bir");
            } else if (sayi == 0) {
                System.out.println("sifir");
            }
        } else {
            System.out.println("Gecersiz");
        }
    }
}
