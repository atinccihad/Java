package i04_dataCasting;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("float deger giriniz");
        float f = scan.nextFloat();

        short s = (short) f;
        System.out.println("float olarak girilen degerin short'a cevrilmis hali: " + s);
    }
}
