package i37_i32_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
         /*
         Kullanicidan bir String aliniz.
         String'de var olan her character'in sayisini ekrana yazdiriniz.
         Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
                hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
        String str = scan.nextLine();

        String arrStr[] = str.split("");
        Arrays.sort(arrStr);
        System.out.println("arrStr to sorted= " + Arrays.toString(arrStr));
        int counter = 0;

        for (int i = 1; i < arrStr.length; i++) {
            if (arrStr[i - 1].equals(arrStr[i])) {
                counter++;
            } else {
                System.out.println(arrStr[i - 1] + " karakteri " + (counter + 1));
                counter = 0;
            }
            if (i == arrStr.length - 1) { // yani for loop da en sona geldiginde
                System.out.println(arrStr[i] + " karakteri " + (counter + 1));
            }
        }
    }
}
