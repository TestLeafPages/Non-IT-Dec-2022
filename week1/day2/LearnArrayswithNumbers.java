package week1.day2;

import java.util.Arrays;

public class LearnArrayswithNumbers {

	public static void main(String[] args) {
		  //           0  1  2   3  4  5  6 7   8  9 
		int[] scores= {78,89,98,76,99,90,67,75,78,65};
		//To sort an array
		Arrays.sort(scores);
		//To find the size of an array
		int length = scores.length;
        System.out.println("Length of the array is : "+length);//10
        //To print the minimum value of the array
        System.out.println("The minimum value of the array is :"+scores[0]);
        //To print the maximum value of an array
        System.out.println("The maximum value of the array is :"+scores[scores.length-1]);
        //index=9
        //To print all the values in an array
		for (int i = 0; i <scores.length; i++) {
			System.out.println(scores[i]);//scores[1]=89
		}
		
		
		

	}

}
