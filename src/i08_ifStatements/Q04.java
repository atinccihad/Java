package i08_ifStatements;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil!");
        }
    }
}
