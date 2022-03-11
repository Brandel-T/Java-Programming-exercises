package EinAusgabe.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeObjects 
{

	public static void main(String[] args) 
	{
		//-----------DESERIALISATION--------------
		
		FileInputStream fin ;
		
		try
		{
			fin = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			//vu que ce sont des elt de la classe Student que l'on veut obtenir 
			//on doit realiser un casting.
			Student student1 = (Student) ois.readObject();
			Student student2 = (Student) ois.readObject();
			int integer = ois.readInt();
			Student meStudent = (Student)ois.readObject();
			
			//on doit respecter l'odre defini précédemment
			System.out.println(student1);
			System.out.println(student2);
			System.out.println(integer);
			System.out.println(meStudent);
			
			fin.close();
			ois.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
