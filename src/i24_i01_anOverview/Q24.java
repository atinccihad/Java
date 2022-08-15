package i24_i01_anOverview;

import java.util.ArrayList;
import java.util.List;

public class Q24 {
    public static void main(String[] args) {
        /*
        24-----
        String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.

        Test Data:
        isFourLetters(["Tomato", "Potato", "Pair"])

         ["Pair"]
         */
        String[]arr={"Tomato", "Potato", "Pair"};
        System.out.println("String array dizisindeli 4 harfli kelimeler: "+dortHarflileriReturn(arr));
    }

    private static ArrayList<String> dortHarflileriReturn(String[] arr) {
        List<String> arrDortHarflileri=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()==4){
                arrDortHarflileri.add(arr[i]);
            }
        }
        return (ArrayList<String>) arrDortHarflileri;
    }
}
