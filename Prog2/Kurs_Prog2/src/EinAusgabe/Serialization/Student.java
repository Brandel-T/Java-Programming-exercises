package EinAusgabe.Serialization;

import java.io.Serializable;

public class Student implements Serializable
{
	private int id;
	private String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return String.format("Student [name: %s, id: %d]", name, id);
	}	
}
