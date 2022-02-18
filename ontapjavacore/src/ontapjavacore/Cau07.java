package ontapjavacore;

public class Cau07 {

	public static void main(String[] args) {
		System.out.println("Tính S(n) = ½ + ¼ + … + 1/2n = " + tong(5));
	}

	public static double tong(int n) {
		double tong = 0;
		
		for(int i = 1; i <= n; i++) {
			tong += 1.0/(2*i);
		}
		
		return tong;
	}
}
