package com.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String [] args) 
    { 
     Person e = null; 
     try
     { 
       String path = (File.separator + "root" + File.separator + "z" + File.separator + "f.txt");
       FileInputStream fileIn = new FileInputStream(path); 
       ObjectInputStream in = new ObjectInputStream(fileIn); 
       e = (Person) in.readObject(); 
       in.close(); 
       fileIn.close(); 
     }catch(IOException i) 
     { 
       i.printStackTrace(); 
       return; 
     }catch(ClassNotFoundException c) 
     { 
       System.out.println("Employee class not found"); 
       c.printStackTrace(); 
       return; 
     } 
     System.out.println("Deserialized Persion..."); 
     System.out.println("Name: " + e.name); 
     System.out.println("age: " + e.age); 
    } 
}
