class permutation {
	

	public static void main(String[] args) {

		System.out.println(permutationCTCI("bob","bba"));

	}

	public static boolean permutationCTCI(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] letters = new int[128];

		char[] str1_array = str1.toCharArray();

		for (char c : str1_array) {
			letters[c]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			int c = (int) str2.charAt(i);
			letters[c]--;

			if(letters[c] <0) {
				return false;
			}
		}
		return true;

	}

	public static boolean TylerFirstAttempt(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		boolean char_set = new boolean[128];
		boolean truthset = new boolean[str2.length()];

		for (int i = 0; i <str1.length(); i++) {
			char_set[(int)str1.charAt(i)] = true;
		}

		for (int j = 0; j < str2.length(); j++) {
			if (char_set[(int)str2.charAt(j)] == true) {
				truthset[j] = true;
			} else return false;
		}

		for (boolean bool: truthset) {
			if (bool == true) {
				return true;
			} else {
				return false;
			}
		}

		return true;
	}


}