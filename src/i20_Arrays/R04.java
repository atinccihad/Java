package i20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R04 {
    public static void main(String[] args) {
        /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.

       (do not use toCharArray() method)

       Input : John

       Output :[J, o, h, n]
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Array'e cevrilecek String'i giriniz");
        String str = scan.nextLine();
        String[] strArr = str.split("");

        System.out.println(Arrays.toString(strArr));
    }
}
