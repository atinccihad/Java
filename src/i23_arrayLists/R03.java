package i23_arrayLists;


import java.util.Arrays;
import java.util.Scanner;

public class R03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle alın. Kullanıcıdan alınan cümleyi parametre olarak kabul edin,
        Diziyi kullanarak cümleyi ters çevirin ve sonucu ana yönteme Dize olarak döndüren bir Yöntem yazın.

        Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.

        Giriş :

        Kod yazmak çok güzel.

        Çıktı :

        .lezüg koç kamzay doK
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle = scan.nextLine();

        String tersCumle = "";
        String[] cumleArr = cumle.split("");
        System.out.println(Arrays.toString(cumleArr)); // [K, o, d,  , y, a, z, m, a, k,  , ç, o, k,  , g, ü, z, e, l, .]

        for (int i = cumleArr.length - 1; i >= 0; i--) {
            tersCumle += cumleArr[i];
        }
        System.out.println("tersCumle = " + tersCumle);

    }
}
