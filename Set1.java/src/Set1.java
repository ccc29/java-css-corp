import java.util.*;
public class Set1 {
		public static void main(String[] args) {
			Set set = new HashSet();
			set.add("one");
			set.add("Second");
			set.add("Third");
			set.add(new Integer(4));
			set.add(new Float(5.0F));
			set.add("second");
			set.add(new Integer(4));
			System.out.println(set);
		}

	}

