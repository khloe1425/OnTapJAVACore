package ontapjavacore;

import java.util.ArrayList;

public class Cau01 {

	public static void main(String[] args) {
		System.out.println(getFibonacciList(5));
		System.out.println(getFibonacciList(3));

	}
	
	public static ArrayList<Integer> getFibonacciList(int n) {
		ArrayList<Integer> fiboArr = new ArrayList<>();
		
		if(n <= 2 && n >= 0) {
			if(n == 0) {
				return fiboArr;
			} else if(n == 1) {
				fiboArr.add(1);
				return fiboArr;
			} else if(n == 2) {
				fiboArr.add(1);
				fiboArr.add(1);
				return fiboArr;
			}
		} else if(n > 2){
			fiboArr.add(1);
			fiboArr.add(1);
			for(int i = 2; i < n; i++) {
				fiboArr.add(fiboArr.get(i-1) + fiboArr.get(i-2));
			}
		}
		return fiboArr;
	}

}
