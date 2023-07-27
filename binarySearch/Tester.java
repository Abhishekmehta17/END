package binarySearch;

public class Tester {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160 };

		System.out.println(Defination.binarySerch(arr, 10));

		System.out.print(Defination.binarySerch(arr, 170));
		System.out.println();
		System.out.print(Defination.binarySerch(arr, 150));
		System.out.println();
		System.out.print(Defination.binarySerch(arr, 80));

//		System.out.println("\nRecursion: ");
//
//		System.out.println(Defination.binarySearchRec(arr, 0, arr.length - 1, 10));
//		System.out.println(Defination.binarySearchRec(arr, 0, arr.length - 1, 130));
//		System.out.println(Defination.binarySearchRec(arr, 0, arr.length, 80));
	}

}
