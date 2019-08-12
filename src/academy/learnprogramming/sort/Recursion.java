package academy.learnprogramming.sort;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(recursiveFactorial(9));
	}
	public static int recursiveFactorial(int num) {
		if(num==0)
			return 1;
		return num * recursiveFactorial(num-1);
	}
}
