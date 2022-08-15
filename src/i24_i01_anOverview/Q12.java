package i24_i01_anOverview;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        12----
        Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

        Test Data:
        Java is fun

        Beklenen Sonuç:
        JAVA IS FUN
         */
        String str = "";
        System.out.println("Girilen String'in buyuk harfe cevrilmis hali: " + buyukHarfeCevir(str));

    }

    private static String buyukHarfeCevir(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buyuk harfe cevirmek istediginiz String ifadeyi giriniz");
        str = scan.nextLine();
        str = str.toUpperCase();

        return str;
    }
}
