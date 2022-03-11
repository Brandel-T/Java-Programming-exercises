import java.util.Arrays;

public class MergeSort 
{	
	public static void mergeSort( Object[] a )
	{
		if( a.length == 1 )
			return ;
		
		int first = 0; 
		int last = a.length-1;
		int mid = (first+last)/2;
		Object[] leftArray = new Object[mid-first+1];
		Object[] rightArray = new Object[last-mid];
		
		for (int i=0; i<leftArray.length; i++)
			leftArray[i] = a[first+i];
		for (int i=0; i<rightArray.length; i++)
			rightArray[i] = a[mid+1+i];
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(a, leftArray, rightArray, first, mid, last);
	}

	private static void merge(Object[] a, Object[] leftArray, Object[] rightArray, int first, int mid, int last) 
	{
		int l = 0; //left array start index
		int r = 0; //right array start index
		
		for (int i=first; i<last+1; i++)
		{
			if (l < leftArray.length && r < rightArray.length) 
			{  
				Comparable<Object> la = (Comparable<Object>) leftArray[l];
				Comparable<Object> ra = (Comparable<Object>) rightArray[r]; 
				
				int compar = la.compareTo(ra);
				
				if ( compar < 0 ) {
					a[i] = leftArray[l];
					l++;
				}else {
					a[i] = rightArray[r];
					r++;
				}
			} else if (l < leftArray.length) {
				a[i] = leftArray[l];
				l++;	
			} else if (r < rightArray.length) {
				a[i] = rightArray[r];
				r++;
			}
		}
	}
	
	public static void main(String[] args) { 
		Object[] a = {"Brandel", "Samuel Etoo", "Mohamed Ali", "Didier Drogba", "Cpt. Price", "Yasuke", "brandel"};  
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	} 
}
