import java.util.Comparator;

public class ObjectComparison implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) { 
		if ( o1 instanceof String && o2 instanceof String ) {
			return o1.toString().compareTo(o2.toString());
		}
		else if ( o1 instanceof Integer && o2 instanceof Integer )  {
				Integer obj1 = (Integer)o1;
				Integer obj2 = (Integer)o2;
				return (obj1).compareTo(obj2);
		}
		else if (o1 instanceof Double && o2 instanceof Double) {
			Double obj1 = (Double)o1;
			Double obj2 = (Double)o2;
			return (obj1).compareTo(obj2);
		}
		return 0;
	}
	

}
