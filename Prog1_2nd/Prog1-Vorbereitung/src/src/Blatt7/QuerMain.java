package Blatt7;

import java.util.Arrays;

public class QuerMain {
	
	public static int[] twoSum(int[] nums, int target) { 
        int i = 0, j =1;
        boolean find = false;
        while(i<nums.length-1 && !find ) {
            j = i+1;
            while(j < nums.length){
                if ((nums[i]+nums[j]) == target)
                    find = true;
                else
                	j++;
            }
            if (find != true)
            	i++;
        }
	return new int[] {i-1, j-1};
    }
    
//    public static void main(String[] args){
//        Solution s = new Solution();
//        int[] inputTab = {2,7,11,15};
//        int[] tab = s.twoSum(inputTab, 26);
//        System.out.println("le resultat est : "+tab);
//    }
	
	public static void main(String[] args) {
        int[] inputTab = {11,7,2,15};
        int[] tab = twoSum(inputTab, 9);
        System.out.println(Arrays.toString(tab));
        
//		int n1 = Integer.parseInt(args[0]);
//		System.out.printf("querSumOf(%d) = %d %n", n1, Quer.querSumOf(n1));
//
//		int n2 = Integer.parseInt(args[1]);
//		System.out.printf("%nZahlen zwischen 0 und 1000 deren Quersumme gleich %d ist, sind:%n ", n2);
//		Quer.hasQuerSum(n2);
//		
//		int n3 = Integer.parseInt(args[2]);
//		System.out.printf("%nZahlen zwischen 0 und 1000 deren Quersumme ein Vielfaches von %d ist, sind:%n ", n3);
//		Quer.querMultipleOf(n3);
//		
//		int n4 = Integer.parseInt(args[3]); 
//		System.out.printf("%nDie iterierte Quersumme von %d ist %d. %n", n4, Quer.qt(93));
//		
//		int n5 = Integer.parseInt(args[4]);
//		System.out.printf("%nquerProductOf(%d) = %d %n%n", n5, Quer.querProductOf(n5));
//		
//		Quer.querMixt();
		
 
	}

}
