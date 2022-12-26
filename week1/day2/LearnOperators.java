package week1.day2;

public class LearnOperators {
	
	public static void main(String[] args) {
//      datatype variable = value		
		int a=50;
		int b=40;
		System.out.println(a>b);//50>40->true
		System.out.println("===============");
		System.out.println(a<=b && a<=b);//50<=40->false && 50<=40->false->false
		System.out.println("===============");
		System.out.println(a<=b || a<=b);//50<=40->false || 50<=40->false->false
		System.out.println("===============");
		System.out.println(a==b);//50==40->false
		System.out.println("===============");
		System.out.println(a!=b);//50!=40->true
	}

}
