package academy.learnprogramming.sort;

import java.security.acl.LastOwnerException;

public class SelectionSort {

	public static void main(String[] args) {
		int [] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		for(int lastUnSortedIndex = intArray.length-1;lastUnSortedIndex>0;lastUnSortedIndex--) {
			int largest = 0;
			for (int j=0;j<=lastUnSortedIndex;j++) {
				if(intArray[j]>intArray[largest]) {
					largest=j;
				}
			}
			swap(intArray, largest, lastUnSortedIndex);
		}
		for(int a: intArray) {
			System.out.println(a);
		}
	}
	public static void swap(int [] array, int i, int j) {
		if(i==j) {
			return;
		}
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
