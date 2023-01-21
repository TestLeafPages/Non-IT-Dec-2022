package week4.day1;

public final class GrandParent  {//final class
   static int count=4;
  final static int cvv=123;//final variable
	
	public final static void b1() {//final method
		System.out.println("final ");
	}

	
	public static void main(String[] args) {
		System.out.println(cvv=123);//final variable
	}
}
