package i16_forLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        // Verilen pozitif bir tamsayinin
        // pozitif tam bolenlerini yazdiralim.

        int input = 20;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
