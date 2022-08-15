package i08_i01_practice;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
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
        System.out.print("Mesafeyi ve hizi giriniz");
        double mesafe = scan.nextDouble();
        double hiz = scan.nextDouble();

        double sure = mesafe / hiz;
        System.out.println("sure = " + sure + " km/sa"); // sure = 3.3333333333333335 km/sa
    }
}
