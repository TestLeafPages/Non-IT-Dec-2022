package week1.day2;

import java.util.Arrays;

public class FindOccurence {

	public static void main(String[] args) {
		  //           0  1  2   3  4  5  6 7   8  9 10
		int[] scores= {78,89,98,76,99,90,67,75,78,65,78};
		//int num=78;
		int count=0;
	   //Output=3
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			if (scores[i]==78) {//scores[i]==78
				count++;//2+1=3
			}
		}
		System.out.println(count);
		
		
		
		

	}

}
