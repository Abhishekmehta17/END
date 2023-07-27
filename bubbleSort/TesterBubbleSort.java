package bubbleSort;

public class TesterBubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1,2,4,3 };
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " | ");
			
		}
		BubbleSort.bubbleSort(arr);
		System.out.println( );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");		
		}
		System.out.println();

	}

}
