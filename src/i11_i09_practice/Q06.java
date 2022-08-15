package i11_i09_practice;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("String olarak iki deger giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println("str1 concat str2=> " + str1.concat(str2));

        // yukaridaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        str1 = str1.replace(str1.charAt(0), ' ');
        str2 = str2.replace(str2.charAt(0), ' ');
        System.out.println("Ilk harfler cikarilinca=> " + str1.concat(str2));

    }
}
