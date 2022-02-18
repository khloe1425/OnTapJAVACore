package ontapjavacore;

public class Cau02 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("abcdedcba"));
		System.out.println(isPalindrome("notpalindrome"));
	}
	
	public static boolean isPalindrome(String inputStr) {
		int len = inputStr.length();
		for(int i = 0; i < len/2; i++) {
			if(inputStr.charAt(i) != inputStr.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}

}
