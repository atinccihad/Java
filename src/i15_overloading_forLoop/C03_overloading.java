package i15_overloading_forLoop;

public class C03_overloading {
    public static void main(String[] args) {

        topla(5, 7); // 12
        topla(5.2, 3); // 8.2
        topla(2.4, 6.1); // 9.5
    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integer'in toplami=> " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("Bir double ve bir integer'in toplami=> " + (sayi1 + sayi2));
    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println("Bir integer ve bir double  toplami=> " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double'in toplami=> " + (sayi1 + sayi2));
    }
     /*
     parametre sayisi ve parametre data turleri ayni olan 2 method olusturamayiz!!
     public static void topla(int sayi3,int sayi4){
        System.out.println("Iki integer'in toplami=> "+(sayi1+sayi2));
     }
     */
}
