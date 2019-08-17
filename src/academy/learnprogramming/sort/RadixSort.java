package academy.learnprogramming.sort;

public class RadixSort {

	public static void main(String[] args) {
		int [] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
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
	}

	private static int getDigit(int position, int value, int radix) {
		return (value / (int)Math.pow(radix, position)) % radix;
	}
}
