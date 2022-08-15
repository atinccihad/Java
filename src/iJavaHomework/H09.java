package iJavaHomework;

import java.util.Scanner;

public class H09 {
    public static void main(String[] args) {
        /*****************************************************************************************************/
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
// formula
        // c = (f-32)*5/9
/*****************************************************************************************************/
        Scanner scan = new Scanner(System.in);
        double c;
        System.out.print("Fahrenhayt'tan Santigrat derecesine cevirmek icin deger giriniz: ");
        double f = scan.nextDouble();
        System.out.println("girilen Fahrenayt degerinin Santigrat karsiligi= " + (c = (f - 32) * 5 / 9));

    }
}
