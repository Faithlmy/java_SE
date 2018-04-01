package GenericParadigm;

public class BeforeGeneric {
	static class ArrayList{
		private Object[] elements = new Object[0];
		public Object get(int i) {
			return elements[i];
		}
		
		public  void add(Object o) {
			int length = elements.length;
			Object[] newElements = new Object[length + 1];
			for (int i = 0; i < length; i++) {
				newElements[i] = elements[i];
			}
		newElements[length] = 0;
		elements = newElements;
		}
	}
	
	public static void main(String[] args) {
		ArrayList stringValues=new ArrayList();
		stringValues.add(1);
		String str=(String) stringValues.get(0);
	}

}
