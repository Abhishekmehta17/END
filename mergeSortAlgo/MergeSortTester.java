package mergeSortAlgo;

public class MergeSortTester {

	public static void main(String[] args) {
		int[] arr = { 33, 99, 77, 22, 11, 88 };
		System.out.println("Initial array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.print("\nsortedArray: \n");
		MergeSort.mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}

	}

}
