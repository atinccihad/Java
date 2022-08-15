package i03_Scanner;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        // Cemberin cevresi=> 2piR
        // Cemberin alani=> pi*r*r
        // pi=3.14
        System.out.println("Yaricapi giriniz");
        double yaricap = scan.nextDouble();
        System.out.println("Cemberin cevresi=> " + (2 * 3.14 * yaricap));
        System.out.println("Cemberin alani=> " + (3.14 * yaricap * yaricap));
    }
}
