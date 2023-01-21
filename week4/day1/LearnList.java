package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	  String name="Testleaf";
	  String num="Testleaf";
	  
	  String obj=new String("Testleaf");
		/*
		 * List<Object> lst =new ArrayList<Object>(); //add the data to list
		 * lst.add("HP"); lst.add(12); lst.add(10.2f); lst.add('A');
		 */
		List<String> lst =new ArrayList<String>(); 
		lst.add("TestLeaf");
		lst.add("Qeagle");
		lst.add("Testleaf");
		lst.add("HP");
		lst.add("Amazon");
		lst.add("Amazon");
		//To arrange the list
		Collections.sort(lst);
		System.out.println(lst);//print the list
		System.out.println(lst.size());//length
		System.out.println(lst.remove(2));//remove data from list
		System.out.println(lst);
	   // lst.clear();//to clear all data from list
		System.out.println(lst.isEmpty());
		System.out.println(lst.get(2));//to get particular index
		System.out.println(lst.contains("HP"));//check the data available in the list
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
}
}
