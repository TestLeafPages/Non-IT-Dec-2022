package week3.day2;

public class LearnOverLoading {

	
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void div(int num1,float num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1,double num2) {
		System.out.println(num1+num2);
	}
	public void sub(int num1,double num2) {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		LearnOverLoading obj=new LearnOverLoading();
		obj.add(10, 20);
		obj.add(30, 0.4f);
		obj.add(40, 40);

	}

}
