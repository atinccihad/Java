package i16_forLoop;

public class R10 {
    public static void main(String[] args) {
        // 'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.

        int ascii = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            ascii = i;
            System.out.println("Ascii value of "+i+" = "+ascii );
        }

    }
}
