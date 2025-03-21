
package Arrays;

import java.util.Arrays;

public class MissingNumbers {
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,2,3};
		
		int sum1 = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum1+=arr[i];
		}
		
		int sum2 = 0;
		
		Arrays.sort(arr);
		
		int min = arr[0];
		
		int max = arr[arr.length-1];
		
		for(int i=min;i<=max;i++) {
			sum2 += i;
		}
		
		int missingNumber = sum2-sum1;
		
		System.out.println("The missing number is : "+ missingNumber);
		
	}
}
