package com.IO2;

/*
 * 二进制文件的复制
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO3 {

    public static void main(String[] args ) {  
        
		  String bin = File.separator + "root" + File.separator + "z" + File.separator + "yao.txt"; 
          
		  String copy = File.separator + "root" + File.separator + "z" + File.separator + "z.txt"; 
	   
        FileInputStream i = null;  
        FileOutputStream o = null;  
           
        try {  
            i = new FileInputStream(bin);  
            o = new FileOutputStream(copy);  
               
            //循环的方式读入写出文件，从而完成复制  
            byte[] buf = new byte[1024];  
            int temp = 0;  
            while((temp = i.read(buf)) != -1) {  
                o.write(buf, 0, temp);  
            }  
   
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if(i != null) {  
                try {  
                    i.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
            if(o != null) {  
                try {  
                    o.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}
