package i07_ifStatements;

import java.util.Scanner;

public class R04 {
    public static void main(String[] args) {
        /*
        1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

        Test Data:

        2

        2016

        Beklenen çıktı:

        2016 yili Subat ayi 29 gun

        Test Data:

        4

        1998

        Beklenen Çıktı:

        1998 yili Nisan ayi 30 gun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak istediginiz ayin numarasini ardindan bulundugunuz yili giriniz");
        int month = input.nextInt();
        int year = input.nextInt();
        String monthStr = "";
        switch (month) {
            case 1:
                monthStr = "Ocak";
                break;
            case 2:
                monthStr = "Subat";
                break;
            case 3:
                monthStr = "Mart";
                break;
            case 4:
                monthStr = "Nisan";
                break;
            case 5:
                monthStr = "Mayis";
                break;
            case 6:
                monthStr = "Haziran";
                break;
            case 7:
                monthStr = "Temmuz";
                break;
            case 8:
                monthStr = "Agustos";
                break;
            case 9:
                monthStr = "Eylul";
                break;
            case 10:
                monthStr = "Ekim";
                break;
            case 11:
                monthStr = "Kasim";
                break;
            case 12:
                monthStr = "Aralik";
                break;
            default:
                System.out.println("Ay icin 1 - 12 arasinda tercih yapmalisiniz");
        }


        switch (month) {
            case 1:
                System.out.println(year + " yili " + monthStr + " ayi 31 gun");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println(year + " yili " + monthStr + " ayi 29 gun");
                    break;
                } else {
                    System.out.println(year + " yili " + monthStr + " ayi 28 gun");
                    break;
                }
            case 3:
                System.out.println(year + " yili " + monthStr + " ayi 31 gun");
                break;
            case 4:
                System.out.println(year + " yili " + monthStr + " ayi 30 gun");
                break;
            case 5:
                System.out.println(year + " yili " + monthStr + " ayi 31 gun");
                break;
            case 6:
                System.out.println(year + " yili " + monthStr + " ayi 30 gun");
                break;
            case 7:
                System.out.println(year + " yili " + monthStr + " ayi 31 gun");
                break;
            case 8:
                System.out.println(year + " yili " + monthStr + " ayi 30 gun");
                break;
            case 9:
                System.out.println(year + " yili " + monthStr + " ayi 31 gun");
                break;
            case 10:
                System.out.println(year + " yili " + monthStr + " ayi 30 gun");
                break;
            case 11:
                System.out.println(year + " yili " + monthStr + " ayi 31 gun");
                break;
            case 12:
                System.out.println(year + " yili " + monthStr + " ayi 30 gun");
                break;
            default:
                System.out.println("Yanlis giris");

        }
    }
}
