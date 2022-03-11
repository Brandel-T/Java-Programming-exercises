package main;

import java.util.HashMap;
import java.util.Map;

public class AssertMap {

	public static Map<String, String> getMap() 
	{
		Map<String, String> map = new HashMap<>();
		map.put("p", "python");
		map.put("c", "c++");
		map.put("j", "java");
		map.put("k", "kotlin");
		
		return map;
	}
}
