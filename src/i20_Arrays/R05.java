package i20_Arrays;

public class R05 {
    public static void main(String[] args) {
    /*
    Write a java program that calculates the average value of array elements

    input[]= {1,2,3,4,5,6,7}

    Output : 4
     */

        int sum = 0;
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        System.out.println("Verilen Arraydeki sayilarin ortalamasi= " + (sum / input.length));
    }
}
