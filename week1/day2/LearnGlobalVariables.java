package week1.day2;

public class LearnGlobalVariables {
	
//Global variables num,num2
	int num=50;
	int num2=80;
	public void add() {
		//Local variable
		int num3=24;
		System.out.println(num+num2);
		System.out.println(num3);

	}
	public void sub() {
		System.out.println(num2-num);
		//System.out.println(num3);
	}
	
	public static void main(String[] args) {
		LearnGlobalVariables lg=new LearnGlobalVariables();
		lg.add();
		lg.sub();
		
	}

}
