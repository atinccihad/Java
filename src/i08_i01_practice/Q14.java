package i08_i01_practice;

public class Q14 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if (x++ < ++y) {
            System.out.print("hel");
        } else {
            System.out.print("Wel");
        }
        System.out.print("Log " + x + ":" + y);
    }
}
