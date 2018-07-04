package ReadFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {
	
	public static void main(String[] args) {
		File f = new File("D:\\");
		System.out.println(f.getName());
//		lists(f);
	}
	 public static void lists(File file) {
		 List s = new ArrayList<>();
	        if (file.isDirectory()) {
	            File[] list = file.listFiles();
	            if (list != null) {
	                for (int i = 0; i < list.length; i++) {
	                    lists(list[i]);
	                    if(list[i] != null && list[i].exists()) {
	                    	s.add(list[i]);
	                    }
	                }
	            }
//	        System.out.println(file);
//	        System.out.println(file.getPath());
//	        System.out.println(file.length());
//	            System.out.println(file.getName());
	        }
	        System.out.println(s);
	    }
//	 public void AddList(File[] list){
//		 List ls = new ArrayList<>();
//		 for
//	 }
	 
}
