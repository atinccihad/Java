package i14_i12_practice;

import java.util.Scanner;

public class Q06 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = scan.nextLine();

        if (str.contains(" ")) {
            System.out.println("Girilen String bosluk iceriyor");
        } else if (str.equals("")) {
            System.out.println("Girilen String bos");
        } else {
            System.out.println("Girilen String bos degil ve bosluk icermiyor");
        }


    }
}
