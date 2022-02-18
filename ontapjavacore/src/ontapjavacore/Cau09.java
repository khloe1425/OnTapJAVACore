package ontapjavacore;

public class Cau09 {

	public static void main(String[] args) {
		System.out.println("Tính Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1) = " + tong(5));
	}

	public static double tong(int n) {
		double tong = 0;
		
		for(int i = 1; i <= n; i++) {
			tong += 1.0/(i*(i+1));
		}
		
		return tong;
	}
}
