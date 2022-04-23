package day40_exceptions;

public class C01_exception {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		
		
	
		
		try {
			System.out.println("sayilarin bolumu: "+a/b);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Sifir a bolum yapilamaz");
			//System.out.println(e.getMessage());// / by zero   exception'un kaynagi
			e.printStackTrace();// at day40.C01_exception.main(C01_exception.java:14)
		}
		System.out.println("gorev tamamlandi");
	}

}
