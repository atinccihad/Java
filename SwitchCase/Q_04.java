package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Bug�ne g�re 100 g�n sonra hangi g�n oldu�unuz yazd�r�n�z.
        // pazartesi
        Scanner scan = new Scanner(System.in);
       /* int kacGunSonra=scan.nextInt();
        int gunSayisi=scan.nextInt();
        System.out.println("gun giriniz");
        gunSayisi=(gunSayisi+kacGunSonra)%7;
        
        switch(gunSayisi) {
        case 1:   System.out.println("Pazartesi");
        break;
        case 2:   System.out.println("sali");
        break;
        case 3:   System.out.println("carsamba");
        break;
        case 4:   System.out.println("Persembe");
        break;
        case 5:   System.out.println("Cuma");
        break;
        case 6:   System.out.println("Cumartesi");
        break;
        case 7:   System.out.println("Pazar");
        break;
        default:
        }
*/
		 System.out.print(
	                "Pazartesi: 1 \nSal�: 2 \n�ar�amba: 3 \nPer�embe: 4 \nCuma: 5 \nCumartesi: 6 \nPazar: 7 \nL�tfen haftan�n ka��nc� g�n�nde oldu�unuzu yaz�n: ");
	        int kanc�nc�Gun = scan.nextInt();
	        System.out.println("L�tfen ka� g�n sonras�n� merak etti�inizi yaz�n :");
	        int kacGun = scan.nextInt();
	        int hangiG�n = (kacGun % 7 + kanc�nc�Gun) % 7;
	        if (kanc�nc�Gun <= 7 && kanc�nc�Gun > 0) {
	            if (kacGun > 0) {
	                switch (hangiG�n) {
	                    case 1: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Pazartesi.");
	                        break;
	                    }
	                    case 2: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Sal�.");
	                        break;
	                    }
	                    case 3: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden �ar�amba.");
	                        break;
	                    }
	                    case 4: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Per�embe.");
	                        break;
	                    }
	                    case 5: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Cuma.");
	                        break;
	                    }
	                    case 6: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Cumartesi.");
	                        break;
	                    }
	                    case 7: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Pazar.");
	                        break;
	                    }
	                }
	            } else {
	                System.out.println("Ge�mi� ge�mi�te kald� :)");
	            }
	        } else {
	            System.out.println("Hafta 7 g�n dostum!");
	        }
	}

}
