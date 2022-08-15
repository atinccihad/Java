package i07_ifStatements;

public class C01_andOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a > 0 && b < 20 && c >= b); // true

        System.out.println(a < 0 && b < 20 && c >= b); // false

        System.out.println(a < 0 & b < 20 & c >= b); //false

        /*
        Java amd operatoru konusunda bize iki secenek sunar

        && kullanirsak ilk false buldugunda sonucun false olacagini bilir ve gerisini incelemez

        & kullanirsak tum sartlari kontrol eder ve sonra sonucu kontrol eder

        bu calisma sebebi ile & operatoru && operatorune gore daha yavas olabilir
         */
    }
}
