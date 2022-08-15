package i14_i12_practice;

import java.util.Scanner;

public class Q02 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sorgu icin String giriniz.");
        String str = scan.nextLine();

        System.out.println(cumleSorgula(str));

    }

    public static boolean cumleSorgula(String str) {

        if (str.contains("xyz")) {
            return true;
        } else {
            return false;
        }
    }
}
