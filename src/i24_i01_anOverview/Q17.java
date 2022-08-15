package i24_i01_anOverview;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        /*
       17---
           Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

           Test data:
           12,24,34

           Beklenen Çıktı:
           12
         */
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        enKucukSayiyiBul(num1, num2, num3);


    }

    private static int enKucukSayiyiBul(int num1, int num2, int num3) {

        int minNum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sirasiyla 1. 2. ve 3. sayilari giriniz");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                minNum = num3;
                System.out.println(minNum);
            } else {
                minNum = num2;
                System.out.println(minNum);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                minNum = num3;
                System.out.println(minNum);
            } else {
                minNum = num1;
                System.out.println(minNum);
            }
        }
        if (num3 > num2 && num3 > num1) {
            if (num2 > num1) {
                minNum = num1;
                System.out.println(minNum);
            } else {
                minNum = num2;
                System.out.println(minNum);
            }
        }


        return minNum;
    }
}
