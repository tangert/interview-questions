import java.util.Arrays;
import java.util.*;

public class leftRotation {

//OG soln
	public static void main (String[] args) {

		System.out.println(Arrays.toString(leftRotation(5,4)));
	}

	public static int[] leftRotation(int n, int d) {


		int[] oldArray = new int[n];
		int[] newArray = new int[n];

		int i, j, k;

		//populating the original array
		for (i = 0; i < n; i++) {
			oldArray[i] = i+1;
		}

		for (j = 0; j < d; j++) {
			
			System.out.println("Old array at rotation #" + (j+1) + Arrays.toString(oldArray));

			for(k = 0; k < n-1; k++) {
				newArray[k] = oldArray[k+1];
			}

			newArray[n-1] = oldArray[0];
			
			System.arraycopy(newArray, 0, oldArray, 0, n);

			System.out.println("New array at rotation #" + (j+1) + Arrays.toString(newArray));
			System.out.println("\n");
		}

		return newArray;


	}

}