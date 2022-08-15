package i18_while_doWhileLoop;

import java.util.Scanner;

public class R16 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

        Input  :1238

        Output :Girilen Numananin Tersi: 8321
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        StringBuilder sb = new StringBuilder(scan.next());

        System.out.println("Girilen Numananin Tersi: " + sb.reverse());


    }
}
