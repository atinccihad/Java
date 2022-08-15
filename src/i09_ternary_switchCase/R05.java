package i09_ternary_switchCase;

import java.util.Scanner;

public class R05 {
    public static void main(String[] args) {
        /*
        Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)

        Sample:

          INPUT:

        Input a month number: 2

        Input a year: 2016

          OUTPUT  :

        February 2016 has 29 days
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Artik yil sorgusu icin yil giriniz");
        int yil = scan.nextInt();

        if (yil%100!=0&&yil%4==0){
            System.out.println(yil+" isLeapYear");
        }else if (yil%100==0&&yil%400==0){
            System.out.println(yil+" isLeapYear");
        }else {
            System.out.println(yil+" notLeapYear");
        }



    }
}
