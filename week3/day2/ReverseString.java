package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String input="TestLeaf";//length start from1 index start from 0 arr[7] 
		//output faeltset
		char[] charArray = input.toCharArray();
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}

	}

}
