package telran.arrays.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.arrays.MyArraysInt.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MyArraysIntTests {

	@Test
	void testAddNumber() {
		int num = 10;
		int[] array = { 1, 2, 3 };
		int[] expected = { 1, 2, 3, 10 };
		assertArrayEquals(expected, addNumber(array, num));
		int num1 = -8;
		int[] expected2 = { 1, 2, 3, 10, -8 };
		assertArrayEquals(expected2, addNumber(expected, num1));
		int[] array2 = {};
		int[] expected3 = { -8 };
		assertArrayEquals(expected3, addNumber(array2, num1));
	}

	@Test
	void testRemoveNumber() {
		int[] source_arr = { 1, 2, 3, 4, 5 };
		int[] expected = { 1, 2, 3, 5 };
		int index = 3;
		assertArrayEquals(expected, removeNumber(source_arr, index));
		index = -5;
		assertArrayEquals(source_arr, removeNumber(source_arr, index));
		index = 10;
		assertArrayEquals(source_arr, removeNumber(source_arr, index));
	}

	@Test
	void testInsertNumber() {
		int[] source_arr = { 1, 2, 4, 5 };
		int[] expected = { 1, 2, 3, 4, 5 };
		int index = 2;
		int num = 3;
		assertArrayEquals(expected, insertNumber(source_arr, index, num));
		
		index = 4;
		num = 6;
		int[] expected2 = { 1, 2, 4, 5, 6 };
		assertArrayEquals(expected2, insertNumber(source_arr, index, num));
		
		index = 10;
		num = 0;
		assertArrayEquals(source_arr, insertNumber(source_arr, index, num));
		
		index = 0;
		num = 0;
		int[] expected3 = { 0, 1, 2, 4, 5 };
		assertArrayEquals(expected3, insertNumber(source_arr, index, num));
		
		index = -1;
		num = -1;
		assertArrayEquals(source_arr, insertNumber(source_arr, index, num));

	}

	@Test
	void testCopyOf() {
		int array[] = { 1, 2, 3 };
		int expected1[] = { 1, 2, 3 };
		int expected2[] = { 1 };
		int expected3[] = { 1, 2, 3, 0, 0, 0 };

		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}

	@Test
	void testArraycopy() {
		int array[] = { 1, 2, 3 };
		int expected[] = { 5, 10, 1, 2, 20 };

		int arrayDestination[] = new int[5];
		int array1[] = { 1, 5, 10 };
		System.arraycopy(array, 0, arrayDestination, 2, 2);
		System.arraycopy(array1, 1, arrayDestination, 0, 2);
		arrayDestination[4] = 20;
		assertArrayEquals(expected, arrayDestination);

	}

	@Test
	void testBinarySearchInt() {
		// Arrays.binarySearch(int[] array, int number);
		// write tests for given method taking array of ints and int number
		int[] array = { 1, 2, 3, 4, 5 };
		int number = 3;
		assertEquals(2, Arrays.binarySearch(array, number));
		
		int[] array1 = {2,-9,10,0,-1,-20,5, 50};
		Arrays.sort(array1);
		number = 5;
		assertEquals(5, Arrays.binarySearch(array1, number));	
		
		int[] array2 = { -16, 50, -25, -22 };
		Arrays.sort(array2);
		number = -15;
		assertEquals(-4, Arrays.binarySearch(array2, number));
		
		number = 100;
		assertEquals(-5, Arrays.binarySearch(array2, number));
		
		int[] array3 = { 100, 8, 100, 12, 100, 100, 100 };
		Arrays.sort(array1);
		number = 100;
		assertTrue( Arrays.binarySearch(array3, number)>0);
	}
	
	@Test
	@Disabled
	void testBinarySearchIntMultiplieElem () {
		int[] array1 = { 100, 8, 100, 12, 100, 100, 100 };
		Arrays.sort(array1);
		int number = 100;
		assertEquals(2, Arrays.binarySearch(array1, number));
		
	}

}
