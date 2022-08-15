package i24_i01_anOverview;

public class Q36 {
    public static void main(String[] args) {
        /*
        36-----
        Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

        Test Data:

        isPrime(31)
        true

        isPrime(18)
        false
         */
        int sayi = 17;
        int sonuc = asalMi(sayi);
    }

    private static int asalMi(int sayi) {
        int sayac = 0;
        if (sayi > 0) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac > 0) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }
        } else {
            System.out.println("Yanlis sayi girdiniz");
        }
        return sayi;
    }
}

