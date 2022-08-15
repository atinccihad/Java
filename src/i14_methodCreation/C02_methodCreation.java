package i14_methodCreation;

import i13_methodCreation.C04_methodCreation;

public class C02_methodCreation {
    public static void main(String[] args) {
        // Verilen 3 basamakli sayinin
        // rakamlari toplamini yazdiran bir method olusturalim

        int input = 423;

        rakamlariTopla(input);
        C04_methodCreation.topla(6, 3);
        C01_methodCreation.testenYazdir("Nuri");
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = input;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        System.out.println(temp + " sayisinin rakamlarToplami = " + rakamlarToplami);
    }
}
