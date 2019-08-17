package academy.learnprogramming.sort;

public class RadixSort {

	public static void main(String[] args) {
		int [] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
		radixSort(radixArray, 10, 4);
		for(int a: radixArray) {
			System.out.println(a);
		}
	}
	
	public static void radixSort(int[] input, int radix, int width) {
		for(int i=0; i<width; i++) {
			radixSingleSort(input, i, radix);
		}
	}

	private static void radixSingleSort(int[] input, int position, int radix) {
		int numItems = input.length;
		int [] countArray = new int[radix];
		for (int value: input) {
			countArray[getDigit(position, value, radix)]++;
		}
		//adust the counting array
		for (int j=1; j<radix; j++) {
			countArray[j] += countArray[j-1];
		}
		int[] temp = new int[numItems];
		for (int tempIndex =numItems-1; tempIndex >= 0;tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}
		//copying back to input array
		for(int i=0;i<numItems;i++) {
			input[i]=temp[i];
		}
		
	}

	private static int getDigit(int position, int value, int radix) {
		return (value / (int)Math.pow(radix, position)) % radix;
	}
}
