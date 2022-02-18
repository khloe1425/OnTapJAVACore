package ontapjavacore;

public class Cau08 {

	public static void main(String[] args) {
		System.out.println("Tính S(n) = 1 + 1/3 + 1/5 + … + 1/(2n + 1) = " + tong(5));
	}

	public static double tong(int n) {
		double tong = 0;
		
		for(int i = 0; i <= n; i++) {
			tong += 1.0/(2*i+1);
		}
		
		return tong;
	}
}
