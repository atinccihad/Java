package i14_methodCreation;

import i13_methodCreation.C04_methodCreation;

public class C01_methodCreation {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim

        testenYazdir("Okan");
        C04_methodCreation.topla(6, 5); // 11
    }

    public static void testenYazdir(String input) {
        String tersInput = input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);
        System.out.println("tersInput = " + tersInput); // nakO
    }
}
