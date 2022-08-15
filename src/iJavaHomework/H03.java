package iJavaHomework;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner scan = new Scanner(System.in);
        double k3 = 0;
        System.out.println("Dik ucgenin iki dik kenarini giriniz");
        double k1 = scan.nextDouble();
        double k2 = scan.nextDouble();
        System.out.println("Iki dik kenari girilen ucgenin hipotenusu= " + ((k3 = (Math.sqrt((k1 * k1 + k2 * k2))))));
    }
}
