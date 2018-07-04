package ReadFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteFile {
	public static void main(String[] args) {
//		String file = "E:\\IP.txt";
//		File file = new File("E:\\IP.txt");
//		String charset = null;
//		String res  = readFile(file, charset);
//		System.out.println(res);
//		writeToFile1();
		writeToFile3();
	}

	public static String readFile(File file, String charset) {
		if(charset == null) {
			charset = "GBK";
		}
		if(file.isFile()) {
			try {
				FileInputStream fIn = new FileInputStream(file);
				InputStreamReader input = new InputStreamReader(fIn, charset);
				BufferedReader buf = new BufferedReader(input);
				
				StringBuffer sb = new StringBuffer();
				String text = null;
				while((text = buf.readLine()) != null) {
					sb.append(text);
				}
				return sb.toString();
			}catch(Exception e){
				
			}
		}
		return null;
	}
	
	public static void writeToFile1(){
		
	    try {
	        String content = "乱码";
	        File file = new File("E:\\test1.txt");
	        if(file.exists()){
	        	writeFile(file, content);
	        }else {
	        	 file.createNewFile(); 
	        	 writeFile(file, content);
	        }
	         
	    } catch (Exception e) {
	        // TODO: handle exception
	    } 
	}
	public static void writeFile(File file, String content) throws IOException {
        FileWriter fw = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close(); fw.close();
        System.out.println("test1 done!");
	}
	
	
	

public static void writeToFile3(){    
   String content = "乱码";
   FileOutputStream fileOutputStream = null;
   File file = new File("E:\\test34.txt");
    
   try {
       if(file.exists()){
    	   writeFileOutputStream(fileOutputStream, file, content);
       }else {
    	   file.createNewFile();
    	   writeFileOutputStream(fileOutputStream, file, content);
       }
   } catch (Exception e) {
       // TODO: handle exception
   }
   System.out.println("test3 done");
}
	    
public static void writeFileOutputStream(FileOutputStream fileOutputStream, File file, String content) throws IOException {
    fileOutputStream = new FileOutputStream(file);
    fileOutputStream.write(content.getBytes());
    fileOutputStream.flush();
    fileOutputStream.close();
}
}

