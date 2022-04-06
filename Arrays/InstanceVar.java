package day20_21_22_23_scope_arrays_MDArrays;

public class InstanceVar {
	
	int notMat=50;
	int notFen;
	// instance variable larin scope'unda main method yoktur

	public static void main(String[] args) {
		
    // System.out.println(notMat); // main metgod static oldugu icin static olmayan variable lar
                                 // main method'da direk kullanamaz veya gorunrulenemez
		
		// instance variable lara main methoddan ulasmak istersek obje olusturup obje uzerinden erisim saglayabiliriz
		
		// Scanner scan=new Scanner(System.in)
		// icinde oldugumuz class dan bir obje olusturalim
		InstanceVar celil=new InstanceVar();
		System.out.println(celil.notMat); // 50
		
		InstanceVar nihal=new InstanceVar();
		
		nihal.notMat=70;
		
		System.out.println(nihal.notMat); // 70
		// instance variable'larda deger atamazsak java instance olarak atanan degeri alir
		// bu class icin notMat=50 gibi
		// ama istersek deger de atayabiliriz,
		// bu durumda deger atadigimiz obje icin yeni deger gecerli olur
		
		System.out.println(celil.notMat); // 50
		
		// celil'in notunu degistirmek istiyorsak celil.notMat'a deger atamaliyiz
		celil.notMat=90;
		System.out.println(celil.notMat); // 90
		
		celil.method2(); // method 2 static olmadigi icin main method dan direk cagirilamaz
	}

	
	public static void sataticMethod() {
		//System.out.println(notFen); // instance variable lara static methodlardan direk ulasilamaz
		
	}
	
	public void method2() {
		System.out.println("method 2 deki notFen"+notFen); // Bu method static olmadigi icin instance variable lara ulasabilir
		// instance variable olusturulurken deger atanmasada olur
		// bu durumda java default degerler atar
		// int icin default deger 0'dir
		// method 2 deki notFen0   ciktisi aliriz
		notFen=100;
		System.out.println("method 2 deki duzeltilmis notFen"+notFen); // method 2 deki duzeltilmis notFen100
	}
}
