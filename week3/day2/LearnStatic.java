package week3.day2;

public class LearnStatic {
  
	 int num=10;
	
	 static int count=2;
	
	public static void add() {
		System.out.println("static method");
	}
	public  void sub() {
		System.out.println("Non method");
	}
	
	public static void main(String[] args) {
		int num=15;
		System.out.println(num);
		
		LearnStatic obj=new LearnStatic();
		System.out.println(count);//static
		System.out.println(obj.num);
		obj.sub();
		add();//static
		sub();//non static
	}

}
