package i11_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle  giriniz");
        String cumle = scan.nextLine();
        System.out.println("Cumledeki varligini kontrol etmek icin harf giriniz");
        char harf = scan.next().charAt(0);
        int harfIndex = cumle.indexOf(harf);

        if (harfIndex < 0) {
            System.out.println("Girilen harf cumlede kullanilmamis");
        } else {
            System.out.println("Girilen harf cumlede kullanilmis");
        }
    }
}
