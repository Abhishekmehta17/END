package binarySearch;

public class Defination {
	public static int binarySerch(int [] arr ,int key ) {
		int left = 0;
		int right = arr.length - 1;
		int mid ;
		while(left <= right) {
			mid = (left + right )/2;
			if(arr[mid]== key) {
				return mid;
			}
			if(key<arr[mid]) {
				
				right= mid-1;
				
			}else {
				left= mid+1;
				
			}
			
			
			
		}//while loop
		
		
		
		
		
		
		
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static int binarySerch(int[] arr, int key) {
//		int left = 0;
//		int right = arr.length - 1;
//		int mid;
//		while (left <= right) {
//			mid = (left + right) / 2;
//			if (arr[mid] == key) {
//				return mid;
//			}
//			if (key < arr[mid]) {
//				right = mid - 1;
//			} else {
//				left = mid + 1;
//			}
//		}
//		return -1;
//	}
//
//	public static int binarySearchRec(int[] arr, int left, int right, int key) {
//		if (left > right)
//			return -78;
//		int mid = (left + right) / 2;
//		if (key == arr[mid])
//			return mid;
//		if (key < arr[mid]) {
//			return binarySearchRec(arr, left, mid - 1, key);
//		}
//		return binarySearchRec(arr, mid + 1, right, key);
//	}
}
