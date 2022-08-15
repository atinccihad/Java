package i17_nestedForLoop;

import java.util.Scanner;

public class C08_whileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere sayilar alin
        Sayilarin toplami 500'u gecince(500 dahil)
        Sayilarin toplamini ve kac sayi topladigini asagidaki gibi yazdirin.

        13 sayi girdiniz ve toplamlari= 567
         */
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int sayi = 0;
        int count = 0;

        while (toplam < 500) {

            System.out.println("Lutfen toplamak uzere sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            count++;
        }
        System.out.println(count + " sayi girdiniz ve toplamlari " + toplam);
    }
}
