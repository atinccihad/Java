package day27_28_constructor_constructorCall_staticKeyWord;

public class Car1 {
	int yýl=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}
	
	// ben 5 ozelligi birden degistiren bir constructor urettigimde
	// java default contructor u siler
	// bu durumda onceden yazilan ve default constructor'i kullanan tum kodlar coker
	// bu durumda kodlari duzeltmek icin Javanin sildigi default constructor yerine
	// parametresiz bir constructor olusturmaliyim

	public Car1() {
		
	}
    // parametresiz constructor uretmenin syntax'i classAdi+()+{}
	
	public Car1(int i) { // bu satirdaki int km ile class level daki int km farkli scope lardadir
		km=i;
	}

	public Car1(int km, String model, String renk, int yil) {
		//      (150000,"civic"       ,"Beyaz"     ,1999);
		this.km=km;
		this.model=model;
		this.yýl=yil;
		this.renk=renk;
	}

	public  void hiz(int hiz) {
		System.out.println("araba saatte "+hiz+" km yapar");
	}
 
	public void yakit(String yakit) {
		System.out.println("araba yakit olarak "+yakit+" kullanir");
	}

}
