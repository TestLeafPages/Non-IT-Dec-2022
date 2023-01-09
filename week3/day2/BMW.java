package week3.day2;


public class BMW extends Car{
	
	public void applyBreak() {
		System.out.println("ABS");
	}
	
	public void applyBreak(String name) {
		System.out.println("BMW Vehicle");
	}
	
	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.applyBreak();
	}
}
