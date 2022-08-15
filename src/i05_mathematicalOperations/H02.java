package i05_mathematicalOperations;

public class H02 {
    public static void main(String[] args) {
        /*
        for loop ve while loop kullanarak 3 basamakli sayilardan
        15,20 ve 90'a tam bolunebilen sayilari yazdirin
         */
        // for loop
        System.out.print("3 basamakli sayilarda 15,20 ve 90'a tam bolunenler=  ");
        for (int i = 100; i <= 999; i++) {
            if (i % 90 == 0 & i % 15 == 0 & i % 20 == 0) {
                if (i == 180) {
                    System.out.print(i);
                } else
                    System.out.print(" & " + i);
            }
        }
        System.out.println("");

        // while loop
        int num1 = 100;
        int num2 = 999;
        System.out.print("3 basamakli sayilarda 15,20 ve 90'a tam bolunenler=  ");
        while (num1 < num2) {
            if (num1 % 90 == 0 & num1 % 15 == 0 & num1 % 20 == 0) {
                if (num1 == 180) {
                    System.out.print(num1);
                } else
                    System.out.print(" & " + num1);
            }
            num1++;
        }
    }
}
