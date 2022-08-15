package i24_arrayList_forEachLoop;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi tersine çeviren bir java programı yazın
        ve cümlenin palindrom olup olmadığını kontrol eder
        (büyük / küçük harf duyarlılığı olmadan)
        Örneğin: giriş: Java'yı seviyorum
        Çıktı: "Ters cümle: avaJ evol İ.
        Bu bir palindrom değil "
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Palindrome kontrolu icin String giriniz");
        String str=scan.nextLine();

        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        if (str.contains(sb)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
}
