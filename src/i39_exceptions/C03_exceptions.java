package i39_exceptions;

public class C03_exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmali!");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu!");
        }
        System.out.println("Sayinin karesi= " + sayi * sayi);

        /*
        Kullanicidan String olark bir deger aliyor ve bunu
        integer'a ceviriyorsak NumberFormatException ile karsilasabilecegimizi on goruruz
        NFE aldigimizda kodun durmamasini istiyorsak try catch ile cevreleyebiliriz

        Eger bilmedigim bir exception daha olusursa kodum durmasin istiyorsak
        bir kere daha catch cumlesi ekleyip ona en genis exception'u yazabiliriz
         */
    }
}
