package LinearSearch;

public class SearchElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,402,34};
		
		int target = 30;
		
//		System.out.println(search(arr, target)); 
		
		System.out.println(search2(arr,target));
		
	}
	public static int search(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
	
	public static boolean search2(int[] arr, int target) {
		if(arr.length==0) {
			return false;
		}
		
		for(Integer ob:arr) {
			if(ob == target){
				return true;
			}
		}
		return false;
	}
}
