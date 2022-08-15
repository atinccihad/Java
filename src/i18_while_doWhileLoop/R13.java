package i18_while_doWhileLoop;

import java.util.Scanner;

public class R13 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

        Input : 6

        Output: 6!=6*5*4*3*2*1=720
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("faktoriyel egeri icin sayi giriniz");
        int num = scan.nextInt();
        Integer faktoriyel = 1;

        for (int i = 1; i <= num; i++) {
            faktoriyel *= i;
            System.out.print(i+"*");
        }
        System.out.println(num + "!=" + faktoriyel);
    }
}
