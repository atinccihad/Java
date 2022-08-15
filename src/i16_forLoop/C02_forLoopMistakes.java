package i16_forLoop;

public class C02_forLoopMistakes {
    public static void main(String[] args) {

        // Baslangic noktasindan sonra
        // bitis sartina yaklasmiyorsak sonsuz loop olusur

        /*
        for (int i = 0; i > -10; i++) {
            System.out.println(i);
        }
        */

        // Eger ilk deger icin bile bitis sarti saglanmiyorsa
        // for loop calisir ama loop body'si hicbir zaman devreye girmez
        for (int i = 0; i > 5; i++) {
            System.out.println(i);
        }

    }
}
