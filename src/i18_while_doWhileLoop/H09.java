package i18_while_doWhileLoop;

import java.util.Scanner;

public class H09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=scan.nextLine();

        System.out.println("bir harf giriniz");
        String harf=scan.next();

        int tekrarliHarf=0;

        for (int i = 0; i < isim.length(); i++) {
            while (isim.substring(i, i+1).equals(harf)) {

                tekrarliHarf++;

            }

        }	System.out.println(tekrarliHarf);
    }
}

