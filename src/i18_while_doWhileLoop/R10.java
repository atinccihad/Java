package i18_while_doWhileLoop;

public class R10 {
    public static void main(String[] args) {
        /*

       Write a Program to find the sum of natural numbers from 1 to 100.

       OUTPUT : Sum of Natural Numbers 5050

       */
        int sum = 0;
        int startNum = 1;

        int endNum = 100;
        while (endNum >= startNum) {

            sum += startNum;
            startNum++;
        }
        System.out.println("Sum of Natural Numbers " + sum);
    }
}
