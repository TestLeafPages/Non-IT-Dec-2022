package week1.day2;

public class LearnConditionalStatements2 {

	public static void main(String[] args) {
		char browser='s';
		//Open the chrome browser
		if (browser=='c') {//'s'=='c'->false
			System.out.println("Open the chrome browser");
		}
		else if(browser=='d') {//'s'!='c'->true
			System.out.println("Error");
		}
		else {
			System.out.println("Open default browser");
		}
		
}}
