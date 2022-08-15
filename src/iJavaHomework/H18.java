package iJavaHomework;

import java.util.Scanner;

public class H18 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
         * olanlarini konsola yazdiriniz int num1 int num2 int num3
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 numara giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Girilen sayilarin en buyugu= " + num1);
            if (num2 > num3) {
                System.out.println("Girilen sayilarin en kucugu= " + num3);
            } else {
                System.out.println("Girilen sayilarin en kucugu= " + num2);
            }
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("Girilen sayilarin en buyugu= " + num2);
            if (num1 > num3) {
                System.out.println("Girilen sayilarin en kucugu= " + num3);
            } else {
                System.out.println("Girilen sayilarin en kucugu= " + num1);
            }
        } else {
            System.out.println("Girilen sayilarin en buyugu= " + num3);
            if (num1 > num2) {
                System.out.println("Girilen sayilarin en kucugu= " + num2);
            } else {
                System.out.println("Girilen sayilarin en kucugu= " + num1);
            }
        }
    }
}
