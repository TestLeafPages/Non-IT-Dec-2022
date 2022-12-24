package week1.day1;

public class LearnReturnType {
	
	//int a=5;
	public void addtwoNumbers() {
		int a=5;
		int b=10;
		System.out.println(a+b);
	
	}
	
	public int addthreeNumbers(int a,int b,int c) {
		
		return a+b+c;

	}
	
	public float add(int a,float b) {
		return a+b;

	}
	
	public boolean switchOff() {
		return true;

	}
	
	
	
	public static void main(String[] args) {
		LearnReturnType lr = new LearnReturnType();
		lr.addtwoNumbers();
		//shortcut to assign a local variable->ctrl+2->l
		System.out.println(lr.addthreeNumbers(34, 45, 90));
		//System.out.println(result);
		boolean ans = lr.switchOff();
		System.out.println(ans);
	}

}
