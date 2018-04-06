package GenericParadigm;

import java.util.ArrayList;

public class MyUnit {
	
	public static <K,V> K getKey(KeyValue<K, V> entry) {
		K key = entry.getKey();
		return key;
	}
	
	public static <K, V> V getValue(KeyValue<K, V> entry) {
		V value = entry.getValue();
		return value;
	}
	
	public static <E> E getFirstElement(ArrayList<E> list) {
		if (list == null || list.isEmpty())
			return null;
		E first = list.get(0);
		return first;
		
	}
}
