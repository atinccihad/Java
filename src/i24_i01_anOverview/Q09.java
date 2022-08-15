package i24_i01_anOverview;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        /*
        9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

        Test Data:
        str1: Java is
        str2: fun

        Beklenen Çıktı:
        java is fun
         */
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Uc uca eklemek icin 2 String giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println("********************************************");
        System.out.println("Uc uca eklenen String: " + str1.concat(str2));
        System.out.println("********************************************");
        System.out.println("Uc uca eklenen String: " + str1 + str2);
        System.out.println("********************************************");

        for (int i = 0; i < str1.length(); i++) {
            str += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            str += str2.charAt(i);
        }
        System.out.println("Uc uca eklenen String: " + str);


    }
}
