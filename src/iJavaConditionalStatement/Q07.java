package iJavaConditionalStatement;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını bulmak için bir Java programı yazın.

        Test Verileri
        Bir ay numarası girin: 2
        Giriş yılı: 2016
        Beklenen Çıktı :
        Şubat 2016'da 29 gün var
         */
        Scanner scan = new Scanner(System.in);
        int numberOfDaysInMonth = 0;
        String monthOfName = "Unkown";

        System.out.print("month number? ");
        int monthNumber = scan.nextInt();

        System.out.println("input a year");
        int year = scan.nextInt();

        switch (monthNumber) {
            case 1:
                monthOfName = "january";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                monthOfName = "february";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                monthOfName = "march";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                monthOfName = "april";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                monthOfName = "may";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                monthOfName = "june";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                monthOfName = "july";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                monthOfName = "agust";
                numberOfDaysInMonth = 30;
                break;
            case 9:
                monthOfName = "september";
                numberOfDaysInMonth = 31;
                break;
            case 10:
                monthOfName = "october";
                numberOfDaysInMonth = 30;
                break;
            case 11:
                monthOfName = "november";
                numberOfDaysInMonth = 31;
                break;
            case 12:
                monthOfName = "december";
                numberOfDaysInMonth = 30;
                break;
            default:
                System.out.println("please check month number");
        }
        System.out.print(monthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
    }
}
