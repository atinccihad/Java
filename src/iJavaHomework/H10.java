package iJavaHomework;

import java.util.Scanner;

public class H10 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Iscinin isi bitirme suresini giriniz");
        int isBitirmeSuresi = scan.nextInt();
        System.out.println("Toplam kac isci calisacak?");
        int isciSayisi = scan.nextInt();

        System.out.println("Bir kisinin isi bitirme suresinin " + isBitirmeSuresi + " gun oldugu, yerde ayni isi " + isciSayisi + " isci " + isBitirmeSuresi / isciSayisi + " gunde bitirecektir.");
    }
}
