package i18_while_doWhileLoop;

public class H06 {
    public static void main(String[] args) {
        // 'm' harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin.

        char harf = 'm';

        do {
            System.out.print(harf + " ");
            harf--;
        } while (harf != 'c');

    }

}
