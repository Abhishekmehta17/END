package bubbleSort;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
//	public static void bubbleSorts(int[] arr) {
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
////			System.out.println("*");
//			int count=0;
//			for (int j = 1; j < arr.length - i; j++) {
//				if (arr[j - 1] > arr[j]) {
//					temp = arr[j - 1];
//					arr[j - 1] = arr[j];
//					arr[j] = temp;
//					
//				}
//				count++;
//				System.out.println(count);
//				System.out.println();
//			}
//		}
//	}

}
