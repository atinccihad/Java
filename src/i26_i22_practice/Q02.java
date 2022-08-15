package i26_i22_practice;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        double sumE = 0;
        double sumD = 0;
        double dolar = 3.2;
        double euro = 4.2;
        String strNum = "";
        double num;
        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    strNum = arr[i][j].replace("$", "");
                    num = Double.parseDouble(strNum);
                    num *= dolar;
                    System.out.println(arr[i][j] + " = " + num);
                    sumD += num;
                } else if (arr[i][j].contains("€")) {
                    strNum = arr[i][j].replace("€", "");
                    num = Double.parseDouble(strNum);
                    num *= euro;
                    System.out.println(arr[i][j] + " = " + num);
                    sumE += num;
                }
            }
        }
        System.out.println("$ toplamlari= " + sumD + " TL" + "\n€ toplamlari= " + sumE + " TL");
        System.out.println(Arrays.deepToString(arr));
    }
}
