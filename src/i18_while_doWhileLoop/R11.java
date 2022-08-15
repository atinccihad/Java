package i18_while_doWhileLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R11 {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)

        Input :

        String str=“Javaisalsoeasy”

        Output: [a, s]
         */

        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Yinelenen karakterleri dondurmesini istediginiz String'i giriniz");
        String str=scan.nextLine();
        String[]arr=str.split("");
        List<String>duplicateChars=new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==arr[i]){
                    count++;
                }
                if (count>=2){
                    duplicateChars.add(arr[i]);
                }

            }count=0;
        }
        System.out.println(duplicateChars);

    }
}
