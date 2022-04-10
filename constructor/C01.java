package day27_28_constructor_constructorCall_staticKeyWord;

public class C01 {

	
		int x=3;
		int y=5;
		
		C01(){
			x+=1;
			System.out.println("-x"+x);
		}
        C01(int i){
        	this();
        	this.y=i;
        	x+=y;
        	System.out.println("-x"+x);
        }
        C01(int i,int i2){
        	this(3);
        	this.x-=4;
        	System.out.println("-x"+x);
        }
        
        
        
		public static void main(String[] args) {   
        	C01 c01=new C01(4,3);
        	// Constructor calismaya basladiktan sonra x ve y ile ilgili degismeler 
        	//(x ve y instance variable oldugundan ) sadece C01 objesini ilgilendirir
        	// constructor un isi bittiginde instance degerler ilk halini alir
        	
        	System.out.println("c01 icin x: "+c01.x+" c01 icin y: "+c01.y); //  c01 icin x: 3 c01 icin y: 3
        	
        	C01 c02=new C01();
        	System.out.println("c02 icin x: "+c02.x+" c02 icin y: "+c02.y); // c02 icin x: 4 c02 icin y: 5
        	
        	C01 c03=new C01(7);
        	System.out.println("c03 icin x: "+c03.x+" c03 icin y: "+c03.y); // c03 icin x: 11 c03 icin y: 7
        	
	}

}
