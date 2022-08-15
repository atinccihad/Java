package i04_dataCasting;

public class C02_dataCasting {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 5;

        System.out.println(sayi1 / sayi2); // 4 => ikiside int oldugundan sonucu int olarak kabul edip yazdirir

        System.out.println(25 * 7 / 3); // 58.66666. => 58

        double sayi3 = 5;
        System.out.println(sayi1 / sayi3); // 4.6 iki variable'in data turu degisik oldugunda
        // daha kapsamli olani data turu olarak kabul eder

    }
}
