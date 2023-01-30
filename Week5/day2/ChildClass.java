package week5.day2;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super();
		System.out.println("child constrctor");
	}
	public void run() {
		
		System.out.println(super.name);
	    super.print();
	System.out.println("child class");
	
	
}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.run();
	}
}
