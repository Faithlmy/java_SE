package GenericExe.java;

public class Gamain {
	
	public static void main(String[] args) {
		
		GenericArrylist<String> StringGa = new GenericArrylist<String>();
		StringGa.add("faith");
		StringGa.add("hello");
		StringGa.add("yao");
		for(int i = 0; i < StringGa.size() && StringGa.get(i) != null; i++) {
			System.out.println(StringGa.size());
			System.out.println(StringGa.get(i));
		}
		
		GenericArrylist<Integer> IntegerGa = new GenericArrylist<Integer>();
		IntegerGa.add(2);
		IntegerGa.add(5);
		IntegerGa.add(6.9);
		for(int i = 0; i < IntegerGa.size() && IntegerGa.get(i) != null; i++) {
			System.out.println("origin" + IntegerGa.size());
			System.out.println(IntegerGa.get(i));
		}
		
		Integer[] in_arr = {2, 4, 1, 5};
		Gamain.<Integer>pint(in_arr);
		
	}
	
	
	public static <E> void pint(E[] arr) {
		for(int i = 0; i < arr.length;  i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
    public static void print(GenericArrylist<?> list) {
        for(int i = 0; i < list.size() && list.get(i) != null; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
