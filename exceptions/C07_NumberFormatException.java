package day40_exceptions;

public class C07_NumberFormatException {

	public static void main(String[] args) {
		
		String str="123a";// java.lang.NumberFormatException
		
		int sayi=Integer.parseInt(str)+4;
		
		System.out.println(sayi);// 127
		

	}

}
