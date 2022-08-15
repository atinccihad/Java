package i15_overloading_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {

        // 1'den 5'e kadar olan tamsayilari toplayalim
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        // 10 dahil 20 dahil aradaki sayilari toplayalim
        toplam = 0;

        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        // 30 dahil 50 dahil aradaki cift sayilari toplayin
        toplam = 0;
        for (int i = 30; i <= 50; i += 2) {
            toplam += i;
        }
        System.out.println("30-50 arasi cift sayilarin toplami = " + toplam);

        // 2. yontem
        toplam = 0;
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplami = " + toplam);

        // 1500 ile 1600(sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin.
        toplam = 0;
        for (int i = 1500; i <= 1600; i++) {
            if (i % 7 == 0) {
                toplam += i;
            }
        }
        System.out.println("1500-1600 arasi 7 ile bolunebilen sayilarin toplami=> " + toplam);
    }
}
