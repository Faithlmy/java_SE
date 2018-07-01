package Serializable1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTestIn {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	       ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
	                "d:/data.txt"));
	        Person p1 = (Person) ois.readObject();
	        System.out.println("age=" + p1.age + ";address=" + p1.name);
	           ois.close();
	}

}
