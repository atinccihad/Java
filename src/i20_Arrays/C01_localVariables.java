package i20_Arrays;

public class C01_localVariables {

    public static void main(String[] args) {
        int sayi = 10;
        // System.out.println(sayiMethod); local variable olan sayiMethod burada kullanilamaz
        for (int i = 0; i < sayi; i++) {
            System.out.println(i);
        }
        // System.out.println(i);  i loop'da olusturulmus lacal variable'dir
        // saddece loop icerisinde kullanilabilir

        // static int sayiStatic=20; static keyword sadece class level'da kullanilabilir
        // method'larin icerisinde static variable tanimlanamaz.
    }

    public static void method1() {
        // System.out.println(sayi); sayi main method'da olusturulmus local bir variable'dir
        // ve sadece main method'da gecerlidir

        int sayiMethod = 20;
    }
}
