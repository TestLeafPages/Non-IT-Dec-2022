package week1.day2;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		int number=0;
		//Goal->Check whether the given number is positive or negative or neutral
		if(number>0) {//-50>0->false
			System.out.println(number+ "  is positive number");
	       }
		else if(number<0) {//-50<0->true
			System.out.println(number+ " is negative number");
		}
		else {
			System.out.println(number+ "is neutral number");
		}

}}
