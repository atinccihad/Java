package i23_arrayLists;


import java.util.Arrays;
import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan girdi olarak bir Dize almak ve bu dizede oluşan maksimum karakteri bulmak için bir Java programı yazın. (Büyük /küçük harf duyarlılığını yoksay)

       giriş :

       Java öğrenmek çok kolay

       çıktı:

       oluşan maksimum karakter: a
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = scan.nextLine();
        //str=str.toLowerCase();
        str = str.replaceAll("\\W", "");

        String[] arrStr = str.split("");
        System.out.println(Arrays.toString(arrStr));
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));

        System.out.println("Girilen String'deki maximum degere sahip karakter=> " + arrStr[arrStr.length - 1]);


    }
}
