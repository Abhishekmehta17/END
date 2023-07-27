package heapSortAlgo;

public class HeapSortTester {

	public static void main(String[] args) {
		int [] arr = {10,22,66,33,77,55};
		HeapSort.heapSort(arr, arr.length);
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.print(arr[i]+" | ");
//		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int[] arr = { 11, 66, 22, 77, 55, 44 };
//		System.out.println("Initially array : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " | ");
//		}
//		System.out.println("\nSorted Array: ");
//		HeapSort.heapSort(arr, arr.length);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " | ");
//		}

//	}

}
