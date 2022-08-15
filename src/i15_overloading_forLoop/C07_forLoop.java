package i15_overloading_forLoop;

public class C07_forLoop {
    public static void main(String[] args) {
        C06_StringReversing.terstenYazdir("Zekeriya");

        // 100'den 1'e kadar(sinirlar dahil) 8 ile bolunebilen sayilari yazdiralim

        for (int i = 100; i >= 1; i--) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
