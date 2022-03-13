package day10_switchCase;

public class C02_switchCase {

	public static void main(String[] args) {
		// gun numarasina gore hafta ici veya haftasonu yazdiralim
		
				int gunNo=5;
				switch(gunNo) {
				
				case 1:
				case 2:
				case 3:	
				case 4:
				case 5:
					System.out.println("Hafta ici");	
					break;
				case 6:
				case 7:
					System.out.println("Hafta sonu");
					break;
				default:
				System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
				}
	}

}
