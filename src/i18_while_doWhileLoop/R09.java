package i18_while_doWhileLoop;

import java.util.Scanner;

public class R09 {
    public static void main(String[] args) {
        /*
        Write a java program to reverse the number which user entered.

        Input :1238
        Output :Reverse Of The Number: 8321
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Reverse icin String giriniz");
        String str = scan.nextLine();


        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
