public class fibonacci {
	
	public static void main(String[] args) {

		System.out.println(fibonacci(20));
	}

	public int fibonacci(int n) {

		if (n == 1 || n == 2) return 1;
		
		return n + fibonacci(n-1);
	}

}