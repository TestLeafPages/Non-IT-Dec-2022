package week3.day2;

public class SupportClass extends LearnStatic {

	public static void add() {
		System.out.println("static method");
	}
	public static void main(String[] args) {

		System.out.println(SupportClass.count);
		SupportClass.add();
		

	}
}
