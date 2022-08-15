package i17_nestedForLoop;

public class Q04 {
    public static void main(String[] args) {
        // ters eskenar ücgen
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 10; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
