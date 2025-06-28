package Coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;

public class iteratorHashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "vad");
		map.put(2, "df");
		map.put(3, "fv");
		map.put(4, "dgngb");
		map.put(5, "ad");
		map.put(7, "aad");
		map.put(7, "aad");

		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
