package i08_i01_practice;

import java.util.Scanner;

public class Q10 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Y veya N harfini giriniz");
        String tercih = scan.next();
        char tercihChar = tercih.toUpperCase().charAt(0);
        if (tercihChar == 'Y') {
            System.out.println("YES");
        } else if (tercihChar == 'N') {
            System.out.println("NO");
        } else {
            System.out.println("Gecerli tercih giriniz..");
        }
    }
}
