package week4.day1;

public class ChildClass  {
	static int num=4;
	
	int a=5;
	
	public void house() {
		
	}
    public static void house1() {
		
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass ();
		System.out.println(num);//static var
		System.out.println(obj.a);
		System.out.println(GrandParent.count);
		obj.house();
		
		house1();//without create obj as a static
		GrandParent.b1();
	}

}
