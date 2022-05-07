package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.
        Scanner scan = new Scanner(System.in);
        System.out.print("pin code  giriniz : ");
        int pin=scan.nextInt();
        
        
        int systemPin=1453;
        
        while(pin!=systemPin) {
        	System.out.println("hatali pin");
        	System.out.println("tekrar deneyin");
        	pin=scan.nextInt();
        }
        
        System.out.println("basarili");
	}

}
