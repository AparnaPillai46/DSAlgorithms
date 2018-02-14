package adhoc;

public class Palindrome {
	
	public static boolean isPalindrome(int x) {
		int ansDiv = x, isPalindrome = 0, ansMod = 0;
		while (ansDiv > 0) {
			ansMod = ansDiv % 10;
			ansDiv = ansDiv / 10;
			isPalindrome = isPalindrome * 10 + ansMod;
		}
		if (isPalindrome == x)
			return true;
		else
			return false;

	}

}
