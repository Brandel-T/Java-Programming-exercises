package Aufgabe1_one_ABNAHME;

public class Element implements Comparable<Element>
{
	private int value;
	Element(int value)
	{ 
		this.value = value;
	}

	@Override
	public int compareTo(Element o) 
	{
		if (this.getValue() > o.getValue()) {
			return 1;
		} else if (this.getValue() < o.getValue()) {
			return -1;
		} else {
			return 0;
		}
	}
 
	public String toString() {
		return "[" + value + "]";
	}
	
	public int getValue() {
		return value;
	}
}
