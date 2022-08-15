package i24_i01_anOverview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        /*
        29----
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str=scan.nextLine();
        String[] strArray=str.split(" ");
        String tersStr="";

        for (int i = strArray.length-1; i >= 0 ; i--) {
            tersStr+=strArray[i]+" ";
        }
        System.out.println(tersStr);

    }
}
