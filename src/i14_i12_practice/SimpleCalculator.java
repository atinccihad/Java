package i14_i12_practice;

import java.util.Scanner;

public class SimpleCalculator {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    static double sayi1;
    static double sayi2;
    static double sonuc;

    public static void main(String[] args) {
        hesapMakinesi(sayi1, sayi2);

    }

    public static double hesapMakinesi(double sayi1, double sayi2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapacaginiz islem icin + - * / sembollerinden birini giriniz");
        char sembol = scan.next().charAt(0);

        if (!(sembol == '+' || (sembol == '-') || (sembol == '*') || (sembol == '/'))) { // requirement disi
            System.out.println("Hesap makinesinin dogru calismasi icin \n'+'  '-'  '*'  '/'  isaretlerinden birini giriniz ");
        } else {
            System.out.println("Iki sayi giriniz");
            sayi1 = scan.nextDouble();
            sayi2 = scan.nextDouble();
        }
        if (sembol == '+') {
            sonuc = sayi1 + sayi2;
            System.out.println(sonuc);
        } else if (sembol == '-') {
            sonuc = sayi1 - sayi2;
            System.out.println(sonuc);
        } else if (sembol == '*') {
            sonuc = sayi1 * sayi2;
            System.out.println(sonuc);
        } else if (sembol == '/') {
            sonuc = sayi1 / sayi2;
            System.out.println(sonuc);
        }
        return sonuc;
    }

}
