package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int input=5;
		int fact=1;
		//5*4*3*2*1=120
		//output=120
		//Iterate through reverse for loop
		for (int i = input; i >=1; i--) {//i=1;1>=1->true
			fact=fact*i;//120*1=120
		}
		System.out.println(fact);
        //multiply the input with the iteration
		//print output in the console
	}

}
