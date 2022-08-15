package i24_i01_anOverview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        /*
        33-----
        Bir arrayi tersine çeviren  method yazınız.

        Test Data:

        reverse [1, 2, 3, 4]
        return  [4, 3, 2, 1]
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu tamsayi olarak giriniz");
        int arrLength = scan.nextInt();
        Integer arrStr[] = new Integer[arrLength];
        System.out.println("Array'e eklemek istediginiz elemanlari " + arrLength + " adet olarak giriniz");

        String[] arr = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Array'in " + (i + 1) + ". elmanini giriniz");
            arrStr[i] = scan.nextInt();
            //arr[i]=arrStr;
        }
        System.out.println("Girdiginiz array: " + Arrays.toString(arrStr));
        List<Integer> listTerArr = new ArrayList<>();

        for (int i = arrStr.length - 1; i >= 0; i--) {

            listTerArr.add(arrStr[i]);

        }
        System.out.println("tersArr = " + listTerArr);
    }
}
