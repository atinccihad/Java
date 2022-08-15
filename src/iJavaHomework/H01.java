package iJavaHomework;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        /*****************************************************************************************************/
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Girilen sayinin birler basamagi= " + sayi % 10 + "\nGirilen sayinin onlar basamagi= " + sayi / 10 % 10 + "\nGirilen sayinin yuzler basamagi=" + sayi / 100);
    }
}
