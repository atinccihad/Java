package i24_i01_anOverview;

import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {
        /*
        8----
         Girilen String değerde tersten yazan Java kodunu yazınız.

        Test Data:
        java
        avaj
         */
        String tersStr = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = scan.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);
        }
        System.out.println("tersStr = " + tersStr);

    }
}
