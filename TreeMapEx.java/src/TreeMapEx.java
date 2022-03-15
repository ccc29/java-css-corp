import java.util.*;
public class TreeMapEx {
		public static void main(String [] args) {
			Map map= new TreeMap();
			map.put("one","1st");
			map.put("second",new Integer(2));
			map.put("third","3rd");
			map.put("third","|||");
			Set set1 = map.keySet();
			Collection collection = map.values();
			Set set2 = map.entrySet();
			System.out.println(set1 + "\n" + collection + "\n" + set2);
		}

	}

