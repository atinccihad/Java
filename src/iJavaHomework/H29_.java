package iJavaHomework;

import java.util.Scanner;

public class H29 {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Kullanici tarafindan girilen sayininin carpim tablosunu yazdiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("carpim tablosunu goruntulemek icin bir sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi <= 10 && sayi > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(sayi + " x " + i + " = " + (sayi * i));
            }
        } else {
            System.out.println("Carpim tablosunu gormek icin 1-10 arasinda bir sayi girmelisiniz!!");
        }
    }
}
