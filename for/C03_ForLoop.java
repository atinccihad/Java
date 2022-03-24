package day16_17_forLoops;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 2)  10 ile 30 arasindaki(10 ve 30 dahil)
		//          sayilari aralarinda virgul olarak ayni satirda yizdirin
		
		for (int i = 10; i <= 30 ; i++) {
			if (i==30) {
				System.out.println(i);
			} else {
                System.out.println(i+","); 
			}
			  System.out.print(i+",");
		}
		
		System.out.println();// bos syso sadece alt satira gec demek icin kullanilir
		
		for (int i = 10; i <= 29 ; i++) {
			System.out.print(i+",");
			}
			System.out.println(30);  
		

			
		
	}

}
