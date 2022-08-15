package iJavaHomework;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
        /*****************************************************************************************************/
    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi ve hizi giriniz");
        double x = scan.nextDouble();
        double v = scan.nextDouble();
        System.out.println("Girilen mesafe ve hiz verilerine gore " + x / v + " km/saat surede girilen yol tamamlanir.");
    }
}
