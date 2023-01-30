package week5.day2;

public class LearnException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int[]num={10,30,20};
		int c = 0;
		try {
			System.out.println(c=a/b);
			
				try {
					System.out.println(num[3]);
				} catch (Exception e) {
					System.out.println(e);
				}
			
		} catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println(c);
		}
	
		

	}

}
