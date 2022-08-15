package i20_Arrays;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
    /*
    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

    Input : Coding is greate.

    Output : .etaerg si gnidoC
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Tersine cevirmek icin String giriniz");
        String str = scan.nextLine();
        String tersStr="";
        
        for (int i = str.length()-1; i >= 0; i--) {
            tersStr+=str.substring(i,i+1);
        }
        System.out.println("tersStr = " + tersStr);

    }
}
