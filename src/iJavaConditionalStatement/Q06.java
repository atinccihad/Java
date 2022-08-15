package iJavaConditionalStatement;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
        İki kayan noktalı sayı okuyan ve üç ondalık basamağa kadar aynı olup olmadıklarını sınayan bir Java programı yazın.

        Test Verileri
        Giriş kayan nokta sayısı: 25.586
        Giriş kayan nokta başka bir sayı: 25.589
        Beklenen Çıktı :
        Onlar farklı
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two decimal numbers");
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();

        if (num1 == num2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are different");
        }
    }
}
