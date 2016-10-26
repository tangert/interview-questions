import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {

		int number = new Scanner(System.in).nextInt();

		for(int i=1; i<=number; i++){

			System.out.print(fibonacci(i) +" ");

		}
	}

	public static int fibonacci(int n) {

		if (n == 1 || n == 2) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}