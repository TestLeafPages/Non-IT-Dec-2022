package week5.day2;

public class LearnConstructorChaining {
	String cname;
	int id;
	boolean working;
	public LearnConstructorChaining(String cname,int id,boolean working) {
		this();
		this.cname=cname;
		this.id=id;
		this.working=working;
		System.out.println("Three arg constructor");
		
	}
	public LearnConstructorChaining() {
		
		System.out.println("no arg constructor");
	}
	public LearnConstructorChaining(String name) {
	this("Qeagle",1234,true);
		System.out.println("one arg constructor");
	}
	
	public static void main(String[] args) {
		LearnConstructorChaining obj=new LearnConstructorChaining("Testleaf");
  

	}

}
