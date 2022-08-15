package i11_i09_practice;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        /*
        Final notu tanimlayin, Nested Ternary ile cozunuz
       'A'  ->  "Gayet Basarili"
       'B'  ->  "Basarili"
       'C'  ->   "Ha gayret"
       bu notlar disindakilere de Digerleri.. yazdiriniz
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("FinalNotu giriniz");
        char finalNotu = scan.next().charAt(0);

        String result = finalNotu == 'A' ? "Gayet Basarili" : finalNotu == 'B' ? "Basarili" : finalNotu == 'C' ? "Ha gayret" : "Digerleri..";
        System.out.println("result = " + result);
    }
}
