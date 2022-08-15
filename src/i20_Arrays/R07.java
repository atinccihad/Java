package i20_Arrays;

public class R07 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

        Eg :

        input : {1,2,3,4,5,6,7,8};

        output: 36
         */
        int sum=0;
        int[]arr={1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum = " + sum);

    }
}
