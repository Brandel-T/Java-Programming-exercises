package Blatt10;

public class ArrayDurchlauf {

	public static void traverse(int[][] array) {
		int left = 0;
		int right = array[0].length-1;
		int top = 0;
		int bottom = array.length-1;
		int countTraverse = Math.min(array.length, array[0].length);
		
		for (int i = 0; i <= countTraverse/2; i++)
		{
			for (int j = left; j <= right; j++) {
				if (array[left][j] == 0) {
					array[left][j] = 1;
					displayArray(array);
				}
			}
			top++;
			
			for (int j = top; j <= bottom; j++) {
				if (array[j][right] == 0) {
					array[j][right] = 1;
					displayArray(array);
				}
			}
			right--;
			
			for (int j = right; j >= left; j--) {
				if (array[bottom][j] == 0) {
					array[bottom][j] = 1;
					displayArray(array);
				}
			}
			bottom--;
			
			for (int j = bottom; j >= top; j--) {
				if (array[j][left] == 0) {
					array[j][left] = 1;
					displayArray(array);
				}
			}
			left++;
		}		
	}
	
	public static void displayArray(int array[][]) {
		for(int[] arr : array) {
			for(int element : arr) {
				System.out.print(element + " ");				
			}
			System.out.println();			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int array[][] = new int[5][7];
		traverse(array);

		System.out.println("\n---------------array1--------------");
		int[][] array1 = new int[4][4];
		traverse(array1);
		System.out.println("---------------array2--------------");
		int[][] array2 = new int[3][7];
		traverse(array2);
		System.out.println("---------------array3--------------");
		int[][] array3 = new int[11][8];
		traverse(array3);
	}

}
