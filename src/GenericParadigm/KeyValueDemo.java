package GenericParadigm;

public class KeyValueDemo<G> extends GenericInterfaceIm<G> {
	
	public static void main(String[] args) {
		KeyValue<String, Integer> kv = new KeyValue<String, Integer>("faith", 100);
		Integer num = kv.getValue();
		String name = kv.getKey();
		System.out.println(num + " / " + name);
		
		//
		
		PhoneKeyValue pk = new PhoneKeyValue("huawei", 999);
		String k = pk.getKey();
		Integer v = pk.getValue();
		System.out.println(k);
		System.out.println(v);
		//
		GenericInterfaceIm gi = new GenericInterfaceIm();
//		G g = gi.doSometing();
//		System.out.println(g);
	}

}
