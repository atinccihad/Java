package day33_stringBuilder;

public class C01_Append_LengthCapacity {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		
		System.out.println(sb.length()); // 0 StringBuilder in uzunlugunu verir
		System.out.println(sb.capacity());// 16   sb'nin kapasitesini verir     uzunlugu belirtmezsek 16 karakterli olusturur

		StringBuilder sb2=new StringBuilder("Java candir");
		
		System.out.println(sb2.length()); // 11 StringBuilder in uzunlugu
		System.out.println(sb2.capacity());//27  sb'nin kapasitesi
		
		StringBuilder sb3=new StringBuilder(7);
		sb3.append("Mehlika");
		
		System.out.println(sb3.length()); // 7  
		System.out.println(sb3.capacity());// 7
		
		StringBuilder sb4=new StringBuilder(7);
		System.out.println(sb4.length()); // 0 
		System.out.println(sb4.capacity());// 7
		
		sb4.append("Nilgun");
		System.out.println(sb4.length()); // 6
		System.out.println(sb4.capacity());// 7
		
		sb4.append(" candir");
		System.out.println(sb4.length()); // 13
		System.out.println(sb4.capacity());// 16
		
		sb.append("Java");
		System.out.println(sb);//Java
		
		sb.append(" candir");
		System.out.println(sb);// Java candir
		
		sb.append("anlasildi mi", 3, 4);
		System.out.println(sb);//Java candira             baslangici 3. index bitisi 4. index i ekledi
		
		
		
	}

}
