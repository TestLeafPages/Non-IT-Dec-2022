package week3.day2;

public class LetterrStartWithT {

	public static void main(String[] args) {
		String  input="Testleaf is located in twin towers teynampet";
      //split
		String[] split = input.split(" ");
		for (int i = 0; i < split.length; i++) {
			
			if(split[i].startsWith("T")|| split[i].startsWith("t")) {
				System.out.println(split[i] );
			}
			
			
		}
		
		
		
		
		
		
	}

}
