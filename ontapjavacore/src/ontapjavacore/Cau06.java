package ontapjavacore;

public class Cau06 {

	public static void main(String[] args) {
		System.out.println("Tính S(n) = 1 + ½ + 1/3 + … + 1/n = " + tong(5));

	}
	
	public static double tong(int n) {
		double tong = 0;
		
		for(int i = 1; i <= n; i++) {
			tong += 1.0/i;
		}
		
		return tong;
	}

}
