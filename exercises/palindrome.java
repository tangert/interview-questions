class palindrome {

	public static void main(String[] args) {

		System.out.println(palindrome("wow"));
	}

	public static boolean palindrome(String str) {

		int[] letters = new int[128];

		for (char c: str.toCharArray()) {
			letters[c]++;
		}

		int oddCount = 0;

		for (int i: letters) {
			if (i%2==1) oddCount++;
			if (oddCount > 1) return false;
		}

		return true;

	}
}