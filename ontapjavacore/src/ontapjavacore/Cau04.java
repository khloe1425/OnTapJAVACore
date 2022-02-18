package ontapjavacore;

public class Cau04 {

	public static void main(String[] args) {
		System.out.println("S(n) = 1 + 2 + 3 + … + n = " + tong(13));
	}
	
	public static int tong(int n) {
		int tong = 0;
		
		for(int i = 1; i <= n; i++) {
			tong += i;
		}
		
		return tong;
	}

}
