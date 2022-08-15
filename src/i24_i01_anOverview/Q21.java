package i24_i01_anOverview;

public class Q21 {
    public static void main(String[] args) {
        /*
         21----
        Array deki sayıları tolpayan Java kodunu yazınız.

        array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Beklenen Çıktı:
        Array toplamı: 55
         */

        int sum = 0;
        int sayilar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= sayilar.length; i++) {
            sum += i;
        }
        System.out.println("Array'deki sayilatin toplami= " + sum);
    }
}
