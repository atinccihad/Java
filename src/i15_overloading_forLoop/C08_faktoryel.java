package i15_overloading_forLoop;

public class C08_faktoryel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayi icin faktoryel hesaplayip
        yazdiran bir method olusturun

        verilen sayi negatif veya 20'den buyuk olursa
        "Girilen sayinin faktoryeli hesaplanamaz."
        uyarisini yazdirin.
         */
        int input = 6;
        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {
        int faktoriyel = 1;

        if (input < 0 || input > 20) {
            System.out.println("Verilen sayi icin faktoriyel hesaplanamaz..");
        } else if (input == 0) {
            System.out.println("0! = 1'dir");
        } else {
            for (int i = 1; i <= input; i++) {
                faktoriyel *= i;
            }
            System.out.println("faktoriyel degeri = " + faktoriyel);
        }
    }
}
