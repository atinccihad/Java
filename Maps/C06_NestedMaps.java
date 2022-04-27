package day47_48_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_NestedMaps {

	public static void main(String[] args) {
		// Icice Map olusturacaksak en icerdekinden baslamaniz tavsiye olunur
		
		Map<String,String> ogr1Map=new HashMap<>();
		ogr1Map.put("isim ", "Ali");
		ogr1Map.put("soyisim ", "Can");
		ogr1Map.put("brans ", "J.dev");
		
		Map<String,String> ogr2Map=new HashMap<>();
		ogr2Map.put("isim ", "Veli");
		ogr2Map.put("soyisim ", "Yan");
		ogr2Map.put("brans ", "QA");
		
		Map<String,String> ogr3Map=new HashMap<>();
		ogr3Map.put("isim ", "Ali");
		ogr3Map.put("soyisim ", "Yan");
		ogr3Map.put("brans ", "C#");
		
		Map<String,String> ogr4Map=new HashMap<>();
		ogr4Map.put("isim ", "Ayse");
		ogr4Map.put("soyisim ", "Can");
		ogr4Map.put("brans ", "QA");
		
		System.out.println("1.ogrenci "+ogr1Map);// 1.ogrenci {brans =J.dev, soyisim =Can, isim =Ali}
		System.out.println("2.ogrenci "+ogr2Map);// 2.ogrenci {brans =QA, soyisim =Yan, isim =Veli}
		System.out.println("3.ogrenci "+ogr3Map);// 3.ogrenci {brans =C#, soyisim =Yan, isim =Ali}
		System.out.println("4.ogrenci "+ogr4Map);// 4.ogrenci {brans =QA, soyisim =Can, isim =Ayse}
		
		Map<Integer,Map<String,String>> sinifMap=new HashMap<>();
		
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap);// {101={brans =J.dev, soyisim =Can, isim =Ali},
		                             //  102={brans =QA, soyisim =Yan, isim =Veli}, 
		                             //  103={brans =C#, soyisim =Yan, isim =Ali}, 
		                             //  104={brans =QA, soyisim =Can, isim =Ayse}}
		
		
		
		
	}

}
