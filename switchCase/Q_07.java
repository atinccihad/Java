package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz: ");
		
		int num=scan.nextInt();
		
		addDigits(num);

	}

	@SuppressWarnings("unused")
	private static void addDigits(int num) {
		for (int i = 0; i < 5; i++) {
			num=sum(num);
			break;
		}
		
	}

	private static int sum(int num) {
	
		
		return 0;
	}

}
