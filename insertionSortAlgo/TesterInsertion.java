package insertionSortAlgo;

public class TesterInsertion {

	public static void main(String[] args) {
		int[] arr = { 10, 60, 20, 90, 80, 100 };
		System.out.println("initial arry : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" | ");
		}
		System.out.println();
		System.out.println("sorted array: " );
		for (int i = 0; i < arr.length; i++) {
			InsertionSort.insertionSort(arr);
			System.out.print(arr[i] + " | ");
		}
	}

}
