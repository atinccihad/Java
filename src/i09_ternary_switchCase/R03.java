package i09_ternary_switchCase;

import java.util.Scanner;

public class R03 {

    public static void main(String[] args) {
     /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

    Örnek Çıktı:

    Alan: 32

    Çevre: 24
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Alani ve cevresini hesaplayacaginiz dikdortgenin kenar uzunluklarini giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();

        System.out.println("Alan: "+x*y);
        System.out.println("Cevre: "+2*(x+y));
    }
}
