package ontapjavacore;

public class Cau03 {
	public static void main(String[] args) {
		
		if(packageRiceBag(5, 4, 25) == true) {
			System.out.println("Đóng gói gạo thành công");
		} else {
			System.out.println("Đóng gói gạo thất bại!");
		}

	}
	
	public static boolean packageRiceBag(int smallBagAmount, int bigBagAmount, int goal) {
		if((smallBagAmount + bigBagAmount * 5) == goal)
			return true;
		return false;
	}
}
