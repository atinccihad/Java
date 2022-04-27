package day47_48_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

	public static Map<Integer,String>myMap(){
		
		Map<Integer,String>ornekMap=new HashMap<>();
		
		
		ornekMap.put(101, "Ali, Can, java");
		ornekMap.put(102, "Veli, Yan, java");
		ornekMap.put(103, "Ali, Yan, C#");
		ornekMap.put(104, "Mustafa, Kan, JAVA");
		ornekMap.put(105, "Ridvan, Tan, C#");
		ornekMap.put(106, "Kutlu, San, JAVA");
		return ornekMap;
	}
}
