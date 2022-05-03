package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 2- Girilen 3 basamakl� bir say�y� yaz� ile yazd�r�n�z

        Scanner oku = new Scanner(System.in);
        System.out.print("3 basamakl� say� giriniz = ");
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
                System.out.println("��yuz");
                break;
            case 4:
                System.out.println("d�rtyuz");
                break;
            case 5:
                System.out.println("besyuz");
                break;
            case 6:
                System.out.println("alt�yuz");
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
                System.out.println("k�rk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altm��");
                break;
            case 7:
                System.out.println("yetmi�");
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
                System.out.println("��");
                break;
            case 4:
                System.out.println("d�rt");
                break;
            case 5:
                System.out.println("be�");
                break;
            case 6:
                System.out.println("alt�");
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
