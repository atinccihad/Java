package i23_arrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class R09 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan girdi olarak bir String alacak bir Java programı yazın ve o karakter dizisinde oluşan maksimum karakteri bulun.
        (Büyük/küçük harf duyarlılığını yoksayın).

        Girdi: Java ogrenmek kolaydir

        Çıktı: oluşan maksimum karakter: a
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str=scan.nextLine().toLowerCase();
        str=str.replace(" ","");
        char mxChar=str.charAt(0);

        String[]strArr= str.split("");
        //System.out.println("Girilen String'in karakterleri: "+ Arrays.toString(strArr));

        for (int i = 0; i < strArr.length; i++) {
            if (mxChar>strArr[i].charAt(0)){
                mxChar=strArr[i].charAt(0);
            }
        }
        System.out.println("maximum occurring character is : "+mxChar);


    }
}
