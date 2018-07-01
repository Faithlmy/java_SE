package Serializable1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTestOut {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/data.txt"));
        Person p = new Person(25,"China");
        oos.writeObject(p);
        oos.close();
	}
}
