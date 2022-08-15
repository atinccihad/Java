package i21_i15_practice;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
       cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("metre ve km'ye donusturmek istediginiz cm degerini giriniz");
        double cmValue = scan.nextDouble();

        convertCM(cmValue);
    }

    public static void convertCM(double cmValue) {
        double meter = cmValue / 100;
        double kmeter = cmValue / 1000000;
        System.out.println("Girdiginiz cm degeri= " + cmValue + " cm " + meter + " metredir " + kmeter + " km'dir");

    }
}
