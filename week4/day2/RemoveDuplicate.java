package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input="Testleaf";
		
		Set<Character>unique=new LinkedHashSet<Character>();
		
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {	
		if(!unique.add(charArray[i])) {
			unique.remove(charArray[i]);
		}
		
		
		}
		System.out.println(unique);
	}

}
