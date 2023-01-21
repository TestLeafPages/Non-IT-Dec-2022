package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateInList {
/*
 * List
=====
 1. List - {Adam,Ben, Zara, Adam, Charlie, James, Ben} 
add the data in list and find the duplicate in the list.
Print only the duplicate - Adam, Ben 
 */
	public static void main(String[] args) {
		String[] names= {"Adam","Adam","Ben","Zara","Adam","Charlie","James","Ben"};
		//List<String>name=new ArrayList<String>(Arrays.asList(names));
		//name.add("Adam");
		List<String>name=new ArrayList<String>();
		System.out.println(name);
		for (int i = 0; i < names.length; i++) {
			name.add(names[i]);
			System.out.println(name);
		}
		Collections.sort(name);//Adam Adam Ben Ben
		for (int i = 0; i <name.size()-1; i++) {
			if(name.get(i)==name.get(i+1)) {
				System.out.println(name.get(i));
			}
			
		}

	}

}
