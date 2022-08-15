package iJavaConditionalStatement;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        /*
        Java'da, 1 ile artan sayıya sahip
        dik açılı üçgen gibi bir desen yapmak için bir program yazın.
        Aşağıdaki gibi desen:

        1
        2 3
        4 5 6
        7 8 9 10
         */
        int i, j, n, k = 1;

        System.out.print("Input number of rows : ");

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(k++ +" ");
            System.out.println("");
        }
    }
}
