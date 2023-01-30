package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConstructor {
	//like a method
	//no return
	//method name equal to class name
	int id;
	String name;
	public LearnConstructor() {
		System.out.println(id);
		System.out.println(name);
		System.out.println("default constructor");
	}
	static {
		System.out.println("I am the static block");
	}
	public LearnConstructor(String n,int i) {
		
		id=i;
		name=n;
		System.out.println(id);
		System.out.println(name);
		System.out.println("I  am parameter");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		LearnConstructor obj=new LearnConstructor("Testleaf",1234);
         System.out.println("After creating object");
	}

}
