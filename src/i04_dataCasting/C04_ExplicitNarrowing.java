package i04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 128;

        byte sayi2 = (byte) sayi1;

        System.out.println(sayi2);

        /*
        Genis data turundeki degeri dar data turundeki variable'a atamak isterseniz
        Java sizin genis data turundeki degerin, dar data turunun sinirlarina uyup uymayacagini calistirmadan bilemez
        ama  Java risk almaz
        Riski sifira indirmek icin burada bir sorun olursa
        sorumlulugumuzu kabul etmemizi bekler
        bunun icin degerin onune parantez icerisinde istedigimiz data turunu yazmamiz yeterlidir.

        Bu riski ustlendigimizde 3 durum olusabilir
        1- bizim degerimiz dar kalip degerlerine uygun olursa hicbir kayip olmadan cast olur
        2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
        3- genis kaliptan degeri dar kaliba koydugunuzda sinirlari asan durumlarda veri baskalasabilir.
         */
    }
}
