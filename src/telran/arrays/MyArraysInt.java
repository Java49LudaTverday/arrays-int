package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int[] addNumber(int[] arr, int num) {
		// adds num at the array`s end
		// returns new array with added number
		// using standard method Arrays.copyOf
		int arrayRes[] = Arrays.copyOf(arr, arr.length + 1);
		arrayRes[arrayRes.length - 1] = num;
		return arrayRes;
	}

	public static int[] removeNumber(int[] arr, int index) {
		// removes element at a given index for right index value
		// and return new array without the removed one;
		// if a wrong index (less than 0 or greater than arr.length-1) - return a source
		// array ;
		// using the standard method: System.arraycopy
		int[] arrDest;
		if (index < 0 || index > arr.length - 1) {
			// arrDest = arr;
			arrDest = new int[arr.length];
			System.arraycopy(arr, 0, arrDest, 0, arr.length);
		} else {
			arrDest = new int[arr.length - 1];
			System.arraycopy(arr, 0, arrDest, 0, index);
			System.arraycopy(arr, index + 1, arrDest, index, arrDest.length - index);
		}
		return arrDest;
	}

	public static int[] insertNumber(int[] arr, int index, int num) {
		// inserts a given num at a given for right value of index;
		// [0 - arr.lenght];
		// before index -> index=2 add to 1
		// returns new array with the inserted number;
		// returns the sours array for a wrong index value (less than 0 or greater
		// arr.length);
		// using the standard method: System.arraycopy;
		int[] arrRes;
		if (index < 0 || index > arr.length) {
			// arrDest = arr;
			arrRes = new int[arr.length];
			System.arraycopy(arr, 0, arrRes, 0, arr.length);
		} else {
			arrRes = new int[arr.length + 1];
			arrRes[index] = num;
			System.arraycopy(arr, 0, arrRes, 0, index);
			System.arraycopy(arr, index, arrRes, index + 1, arr.length - index);
		}
		return arrRes;
	}

}
