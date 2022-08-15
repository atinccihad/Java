package i30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 19:17:19.403972700
        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda
        oanki tarih veya saati alip
        bizim variable'imiza store eder
        time1 variable'in degeri SABITTIR
         */

        Thread.sleep(3000);

        time1 = LocalTime.now();
        System.out.println(time1); // 19:17:22.413629600

        System.out.println(time1.plusSeconds(10000)); // 22:18:19.786854800

        System.out.println(time1.minusMinutes(200)); // 19:33:51.692486200

        System.out.println(time1.withHour(3)); // saati 3 kabul edip yazdirdi  03:35:56.073330600

    }
}
