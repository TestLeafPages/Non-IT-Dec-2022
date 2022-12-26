package week1.day2;

public class LearnbreakStatement {
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if(i==3) {
				System.out.println("Three");
				break;
			}
			System.out.println(i);
		}
		System.out.println("end of the program");
		
	}

}
