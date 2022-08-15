package i24_i01_anOverview;

public class Q22 {
    public static void main(String[] args) {
        /*
        22----
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

        Array =  [20, 30, 25, 35, -16, 60, -100 ]

        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.714285714285714
         */
        int[] sayilar={20, 30, 25, 35, -16, 60, -100};
        double toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("ortalama= " + toplam/ sayilar.length);


    }
}
