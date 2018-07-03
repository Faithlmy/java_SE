package dataType;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ScanFiles {
	public static void main(String[] args) throws Exception {
//		Integer a = 2;
//		Integer b = 2;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a.equals(b));
//		System.out.println(a == b);
//		String a1 = "kl";
//		String a2 = "kl";
//		System.out.println(a1.equals(a2));
//		System.out.println(a1 == a2);
//		
//		String a3 = new String("kl");
//		String a4 = new String("kl");
//		String a5 = new String();
//		System.out.println(a3 == a4);
//		System.out.println(a3.equals(a4));
//		System.out.println("b111" + a5 + "c");
//		System.out.println(a5.equals(""));
//		System.out.println(a5.equals(null ));
//		System.out.println("++++++");
//		System.out.println("bc" + (a3 == a1));
//		System.out.println("bzc" + a3.equals(a1));
//		String Path =  "D:\\eastmoney";
		String path =  "D:\\0";
		TurnRun tr = new TurnRun();
//		System.out.println(tr.scanFile(path, 0));
		System.out.println(tr.deleteFile(path));
//		System.out.println(tr.scanPathFile("D:\\0"));
		
//		System.out.println("???????");
//		String str1 = new String("hello");
//
//	    String after_str1 = "hello";
//
//	    System.out.println(str1 + after_str1);
//	    System.out.println(str1 == after_str1);
//	    System.out.println(str1.equals(after_str1));
//	    
//		System.out.println("???????");
//		
//
//	    String after_str = "hello";
//	    String str = new String("hello");
//
//	    System.out.println(str + after_str);
		
//		String s = "meng";// 在常量池中
//		String str2 = new String("meng");// 在堆上
		//假如就只有这一句String str = new String("hello")代码，并且此时的常量池的没有"hello"这个String，那么答案是两个;
		//如果此时常量池中，已经存在了"hello"，那么此时就只创建堆上str
//		String str1 = new StringBuilder("hel").append("lo").toString();

//	    String str2 = new StringBuilder("ja").append("va").toString();

//	    String s = "hello";
	    
//	    System.out.println(str1.intern());
//	    System.out.println(str2.intern());
//	    System.out.println(str1.intern() == str1); // true 
//	    System.out.println(s.intern() == "");

//	    System.out.println(str2.intern() == str2); // false
//	    System.out.println(123);

	}
}

/**
 * 
 * @author faith
 *
 */
class TurnRun{
	//递归路径下的所有文件
	static List<Object> s = new ArrayList<>();
	// isAbsolutePathNum=0只是输出路径下的所有文件，其他参数输出文件全路径 
	public static List scanFile(String Path, int isAbsolutePathNum) throws Exception{
		File dir = new File(Path);
		String res = null;
		if(!dir.isDirectory()) {
			throw new Exception("is not dir");
		}
		// dir是目录，进入
		if(dir.isDirectory()) {
			//获取路径下的文件和目录
			File[] filelist = dir.listFiles();
			for(int i = 0; i < filelist.length; i++) {
				if(filelist[i].isDirectory()) {//将目录进行递归
					if(filelist[i].isFile()) {
						s.add(filelist[i].getName());
					}
					scanFile(filelist[i].getAbsolutePath(), isAbsolutePathNum);
				}else if (filelist[i].isFile()){//是文件直接返回
					res = isAbsolutePathNum == 0?filelist[i].getName():filelist[i].getAbsolutePath();
					s.add(res);
				}
			}
		}
		return s;
	}
	
	/**
	 * 
	 * @Description：
	 * @param:
	 * @return:
	 * @throws:
	 * @date:
	 */
	public static List scanPathFile(String path) {
		List filePath = new ArrayList<>();
		File file = new  File(path);
		File[] fileArr = file.listFiles();
		for(int i = 0; i < fileArr.length; i++) {
			filePath.add(fileArr[i]);
		}
		return filePath;
	}
	/**
	 * 
	 * @Description：
	 * @param:
	 * @return:
	 * @throws:
	 * @date:
	 */
	public static int deleteFile(String path) {
		if(path == null || path.isEmpty()) return 0; 
		if(path != null && !(path.isEmpty())) {
			File file = new File(path);
			File[] filelist = file.listFiles();
			if(filelist != null  && filelist.length > 0) {
				for(int i = 0; i < filelist.length; i++) {
					if(filelist[i].isDirectory()) {//递归路径下的 路径
						deleteFile(filelist[i].getAbsolutePath());
					}else {
						filelist[i].delete();
					}
				}
			}
		}
		return 0;
	}
}


class FileOption{
	
	private String Path;
	private File dir = null;
	public FileOption() {}
	public FileOption(String path) {
		this.Path = path;
		File dir = new File(Path);
	}
}