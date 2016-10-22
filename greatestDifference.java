import java.util.*;

class greatestDifference {

	public static void main(String[] args) {

		int[] list = {5,4,3,1,10,20,30,100};

		System.out.println(greatestDifference(list));
	}

	public static int greatestDifference(int[] list) {

		if (list.length == 1) {
			return list[0];
		}

		else {

			int min = list[0];
			int max = list[0];

			//notes: make sure you are getting the ith ELEMENT, not i!

			for(int i = 0; i < list.length; i++) {

				if (list[i] < min) {
					min = list[i];
				}

				else if (list[i] > max) {
					max = list[i];
				}
			}

			return max - min;
			
			}

		}

}