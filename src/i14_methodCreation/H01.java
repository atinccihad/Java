package i14_methodCreation;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {

        ikisayiTopla(15, 20);
        ikisayiCarp(8, 23);
        ikisayiBol(700, 2);
        ikiStringBirlestir("Ali", "Can");
    }

    public static String ikiStringBirlestir(String str1, String str2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birlestirmek uzere iki String giriniz");
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        System.out.println("Birlestirilen String=> " + str1.concat(str2));
        System.out.println("");

        return str1.concat(str2);
    }

    public static Double ikisayiBol(double sayi1, double sayi2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bolmek uzere iki sayi giriniz");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println("Girilen iki sayinin bolumu=> " + sayi1 / sayi2);
        System.out.println("");

        return (sayi1 / sayi2);
    }

    public static Double ikisayiCarp(double sayi1, double sayi2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Carpilmak uzere iki sayi giriniz");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println("Girilen iki sayinin carpimi=> " + sayi1 * sayi2);
        System.out.println("");

        return (sayi1 * sayi2);
    }

    public static Double ikisayiTopla(double sayi1, double sayi2) {
        //   Scanner scan=new Scanner(System.in);
        //   System.out.println("Toplamak uzere iki sayi giriniz");
        //  sayi1=scan.nextDouble();
        //  sayi2=scan.nextDouble();
        System.out.println("Verilen iki sayinin toplami=> " + (sayi1 + sayi2));
        System.out.println("");

        return (sayi1 + sayi2);
    }
}
