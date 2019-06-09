package headfirst.adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestlauf {
	public static void main (String args[]) {
		Vector v = new Vector(Arrays.asList(args));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
