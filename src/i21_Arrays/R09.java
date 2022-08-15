package i21_Arrays;

public class R09 {
    public static void main(String[] args) {
        /*
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

        Array: [1,2,3,4,5,6,7,8,9]

        Beklenen Çıktı:
        Tek Sayilar: 5
        Cift Sayilar: 4
         */
        int tekSayilar = 0;
        int ciftSayilar = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ciftSayilar++;
            } else {
                tekSayilar++;
            }
        }
        System.out.println("Tek Sayilar: " + tekSayilar + "\nCift Sayilar: " + ciftSayilar);

    }
}
