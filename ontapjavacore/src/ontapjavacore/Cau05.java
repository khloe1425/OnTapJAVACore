package ontapjavacore;

public class Cau05 {

	public static void main(String[] args) {
		System.out.println("S(n) = 1^2 + 2^2 + … + n^2 = " + tong(5));

	}
	
	public static int tong(int n) {
		int tong = 0;
		
		for(int i = 1; i <= n; i++) {
			tong += Math.pow(i, 2);
		}
		
		return tong;
	}

}
