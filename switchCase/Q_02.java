package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 2- Girilen 3 basamaklý bir sayýyý yazý ile yazdýrýnýz

        Scanner oku = new Scanner(System.in);
        System.out.print("3 basamaklý sayý giriniz = ");
        int sayi = oku.nextInt();



        int yuzlerBasamagi = sayi / 100;
        int onlarBasamagi = (sayi / 10) % 10;
        int birlerBasamagi = sayi % 10;

        switch (yuzlerBasamagi) {
            case 1:
                System.out.println("yuz");
                break;
            case 2:
                System.out.println("ikiyuz");
                break;
            case 3:
                System.out.println("üçyuz");
                break;
            case 4:
                System.out.println("dörtyuz");
                break;
            case 5:
                System.out.println("besyuz");
                break;
            case 6:
                System.out.println("altýyuz");
                break;
            case 7:
                System.out.println("yediyuz");
                break;
            case 8:
                System.out.println("sekizyuz");
                break;
            case 9:
                System.out.println("dokuzyuz");
                break;
                default:
        }
      

        switch (onlarBasamagi) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kýrk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmýþ");
                break;
            case 7:
                System.out.println("yetmiþ");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
            default:
        }

        switch (birlerBasamagi) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beþ");
                break;
            case 6:
                System.out.println("altý");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
        }
        
	}

}
