package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<Integer> nums=new TreeSet<Integer>();
		//add the data set
		nums.add(10);
		nums.add(30);
		nums.add(50);
		nums.add(50);
		nums.add(30);
		nums.add(20);
		nums.add(40);
		//Remove the data
		nums.remove(30);
		//clear the set
		//nums.clear();
		//isEmpty
		System.out.println(nums.isEmpty());
		//contains
		System.out.println(nums.contains(30));
		//to get particular index
		//System.out.println(nums.get(2));-->not support
		
		//print the set
		System.out.println(nums);
		    //datatype   //variable   //value coming from
		for (Integer    output:      nums) {
			System.out.println(output);
		}
		
		
		

	}

}
