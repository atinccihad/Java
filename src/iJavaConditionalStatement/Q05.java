package iJavaConditionalStatement;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
         /*
      Kullanıcıdan bir sayı tutan ve 1 ile 7 arasında bir tamsayı üreten ve hafta içi adını görüntüleyen bir Java programı yazın.

      Test Verileri
      Giriş numarası: 3
      Beklenen Çıktı :
      Çarşamba
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("num= ");
        int num = scan.nextInt();
        switch (num) {
            case 1: System.out.println("monday");break;
            case 2: System.out.println("tuesday");break;
            case 3: System.out.println("wednesday");break;
            case 4: System.out.println("thursday");break;
            case 5: System.out.println("friday");break;
            case 6: System.out.println("saturday");break;
            case 7: System.out.println("sunday");break;
            default: System.out.println("enter the day number according to the order of the week");
        }
    }
}
