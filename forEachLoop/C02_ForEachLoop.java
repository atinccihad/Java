package day26_forEachLoop;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir intefer array olusturunuz
		// ve bu array'deki tum sayilarin carpimini For-each loop kullanarak bulunuz.
		// Sonucu ekrana yazdiriniz.
		
		int arr[]= {1,3,45,6,7,9,11};
		int carpim=1;
		
		for (int each : arr) {
			
			carpim*=each;
		}
		System.out.println("sayilarin carpimi= "+carpim);

	}

}
