package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//  STRÝNG olan PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yaziniz.
		    Scanner scan = new Scanner(System.in);
	        
	        
	        
	        String systemPin="javacanlara selam olsun";
	        int girisHakki=3;
	        
	        while(true) {
	        	System.out.print("pin code  giriniz : ");
		        String pin=scan.nextLine();
		        if (pin.equals(systemPin)) {
					System.out.println("gayet basarili");
					break;
				}else {
					System.out.println("hatali giris yapildi");
					girisHakki--;
					System.out.println("kalan deneme hakkiniz : "+girisHakki);
					if (girisHakki==0) {
						System.out.println("Giris hakkiniz tukendi");
		                break;			
					}
				}
	        }

	}

}
