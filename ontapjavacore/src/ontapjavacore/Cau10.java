package ontapjavacore;

public class Cau10 {

	public static void main(String[] args) {
		System.out.println("T�nh S(n) = � + 2/3 + � + �. + n / n + 1 = " + tong(5));
	}

	public static double tong(int n) {
		double tong = 0;
		
		for(int i = 1; i <= n; i++) {
			tong += i/(i+1.0);
		}
		
		return tong;
	}
}
