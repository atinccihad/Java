package i08_i01_practice;

import java.util.Scanner;

public class Q13 {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fiyat giriniz");
        int fiyat = scan.nextInt();
        System.out.println(fiyat < 10 ? "ucuz" : fiyat < 20 ? "normal" : "pahali");
    }
}
