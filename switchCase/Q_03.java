package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		// Girilen bir ay numarasýna göre , ayýn kaç gün olduðunu sayý ile yazdýrýnýz
		Scanner scan=new Scanner(System.in);
		System.out.println("ay numarasi giriniz");
		int ayNumarasi=scan.nextInt();
		switch(ayNumarasi) {
		case 1: System.out.println("ocak ayi 31 ceker");
		break;
			
		case 2: System.out.println("subat ayi 28 ceker");
		break;
		
		case 3: System.out.println("mart ayi 31 ceker");
		break;
		
		case 4: System.out.println("nisan ayi 30 ceker");
		break;
		
		case 5: System.out.println("mayis ayi 31 ceker");
		break;
		
		case 6: System.out.println("haziran ayi 30 ceker");
		break;
		
		case 7: System.out.println("temmuz ayi 31 ceker");
		break;
		
		case 8: System.out.println("agustos ayi 30 ceker");
		break;
		
		case 9: System.out.println("eylul ayi 31 ceker");
		break;
		
		case 10: System.out.println("ekim ayi 30 ceker");
		break;
		
		case 11: System.out.println("kasim ayi 31 ceker");
		break;
		
		case 12: System.out.println("aralik ayi 30 ceker");
		break;
		default:
		}
		scan.close();
		
		/* Bunun yerine daha basit yontem kullanmali
		 * //        switch (ayNo)
//        {
//            case 1:   System.out.println("31");break;
//            case 2 :  System.out.println("28"); break;
//            case 3 :  System.out.println("31"); break;
//            case 4 :  System.out.println("30"); break;
//            case 5 :  System.out.println("31"); break;
//            case 6 :  System.out.println("30"); break;
//            case 7 :  System.out.println("31"); break;
//            case 8 :  System.out.println("31"); break;
//            case 9 :  System.out.println("30"); break;
//            case 10 :  System.out.println("31"); break;
//            case 11 :  System.out.println("30"); break;
//            case 12 :  System.out.println("31"); break;
//            default: System.out.println("Hatalý no");
//        }

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiðiniz ay 31 gün");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiðiniz ay 30 gün");
                break;
            case 2:
                System.out.print("yýl = ");
                int yil = oku.nextInt();
                if (yil % 4 == 0)
                    System.out.println("Girdiðiniz ay 29 gün");
                else
                    System.out.println("Girdiðiniz ay 28 gün");
                break;

            default:
                System.out.println("Hatalý giriþ yaptýnýz!!!");
        }
		 */
	}

}
