package iJavaConditionalStatement;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        Klavyeden 5 sayı girerek ve toplamlarını ve ortalamalarını bulmak için Java'da bir program yazın.

        Test Verileri
        5 numarasını girin: 1 2 3 4 5
        Beklenen Çıktı :

        5 numarasını girin :
        1
        2
        3
        4
        5
        No. 5 toplam: 15
        Ortalama: 3.0
         */
        Scanner scan = new Scanner(System.in);
        int sum = 0;


        for (int count = 1; count <= 5; count++) {
            System.out.println("Enter " + count + ". numbers to find their sum");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println("the sum of the 5 entered numbers= " + sum);
    }
}
