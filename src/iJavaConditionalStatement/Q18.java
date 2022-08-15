package iJavaConditionalStatement;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /*
        Java'da, aynı satırdaki sayıyı tekrarlayacak
        bir sayıya sahip bir piramit gibi bir desen yapmak için
        bir program yazın.

                              1
                             2 2
                            3 3 3
                           4 4 4 4
         */
        int i, j, n, s, x;
        System.out.print("Input number of rows : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        s = n + 4 - 1;
        for (i = 1; i <= n; i++) {
            for (x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
