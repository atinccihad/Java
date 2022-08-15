package iJavaConditionalStatement;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
     /*
     Belirli bir tamsayının çarpım tablosunu görüntülemek için Java'da bir program yazın.

     Test Verileri
     Sayıyı girin (Hesaplanacak tablo): Terim sayısını girin: 5
     Beklenen Çıktı :

     5 X 0 = 0
     5 X 1 = 5
     5 X 2 = 10
     5 X 3 = 15
     5 X 4 = 20
     5 X 5 = 25
      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to view the multiplication table");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i + "*" + num + " = " + i * num);
        }
    }
}
