package i22_multiDimensionalArrays;

public class C02_mdaReadToAllElement {
    public static void main(String[] args) {
        // verilen bir multi-dimensonal array'in
        // tum elementlerini yazdiran bir method olusturun

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) { // i = 0 ,i=1 ,i=2 degerleri alacak
            for (int j = 0; j < sayilar[i].length; j++) { // inner array'lerin uzunluguna bagladik
                System.out.print(sayilar[i][j] + " "); // 1 5 6 9 2 5 3 1 6
            }
        }

    }
}
