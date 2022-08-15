package i23_arrayLists;

import java.util.Scanner;

public class R08 {
    public static void main(String[] args) {
        /*
        Bir cümleyi parametre olarak kabul eden bir java programı yazın,
        StringBuilder kullanarak cümleyi tersine çevirir ve cümlenin palindrom olup olmadığını kontrol eder
        (büyük / küçük harf duyarlılığı olmadan).Stringbuilder'ı kullanın.

        Giriş :

        Java'yı seviyorum.

        Çıktı:

        Ters cümle: avaJ evol I. Bu bir palindrom değil "
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Palindrome sorgusu icin cumle giriniz");
        String str= scan.nextLine();
        String tersStr="";

        for (int i = str.length()-1; i >= 0; i--) {
            tersStr+=str.charAt(i);
        }
        System.out.println(tersStr);
        if (tersStr.contains(str)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }



    }
}
