package i21_i15_practice;

public class Q08 {
    public static void main(String[] args) {
    /*
    100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
    Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
    istenen sonuc :
     91
     78
     65
     52
     39
     26
     13
     */
        int toplam = 0;
        for (int i = 100; i >= 0; i--) {
            if (i != 0) {
                if (i % 13 == 0) {
                    System.out.print(i + " ");
                    toplam += i;
                }
            }
        }
        System.out.println("");
        System.out.println("istenen sonuc= " + toplam);
    }
}
