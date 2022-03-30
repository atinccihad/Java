package day18_19_whileLoop_doWhileLoop;

public class C08_odevWhileLoop {

	public static void main(String[] args) {
		// For loop ve while loop kullanarak 3 basamakli sayilardan
		// 15 20 ve 90 a  tam bolunebilen sayilari yazdirin
		
		int sayi=100;
		
		while(sayi>=100 && sayi<1000) {
			if (sayi%15==0 || sayi%20==0 || sayi%90==0) {
				System.out.print(sayi+" ");
				
			}sayi++;
		} 
		

	}

}
