package i18_while_doWhileLoop;

public class R05 {
    public static void main(String[] args) {
        /*
        20'den 0'a kadar çift sayılar yazdırın, ancak azaltma (i--) kullanmayın.

        Çıktı: 100'den 0'a kadar olan çift Sayılar: 20 18 16 14 12 10 8 6 4 2 0
         */
        int sayi=20;

        int son=0;
        while (sayi>=son){
            System.out.print(sayi+" ");
            sayi-=2;
        }
    }
}
