package academy.learnprogramming.arrays;

public class Main {

	public static void main(String[] args) {
		int [] intArray = new int[5];
		intArray[0]=5;
		intArray[1]=-7;	
		intArray[2]=42;
		intArray[3]=-37;
		intArray[4]=23;
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}

}
