package EinAusgabe.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeObjects
{
	public static void main(String[] args) {
		
//----------SERIALISATION--------------
		Student apolo = new Student("apolo", 1234);
		Student hil = new Student("Hil", 12);
		Student me = new Student("me xyz", 789);
		
		FileOutputStream fos;
		try 
		{
			fos = new FileOutputStream("student.ser"); //serialisation of a Student object
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(apolo);
			oos.writeObject(hil);
			oos.writeInt(34567);
			oos.writeObject(me);
			
			fos.close();
			oos.flush();
			oos.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
