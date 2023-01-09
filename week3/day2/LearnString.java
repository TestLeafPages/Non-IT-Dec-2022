package week3.day2;

public class LearnString {
	
public static void main(String[] args) {
	int num=10;
	//literal
	String name="TestLeaf";
	
	String name1="TestLeaf";
	
	//object
	String str=new String("Testleaf");
	String str1=new String("TestLeaf");
	
	//compare two string value
	System.out.println(name.equals(name1));
	System.out.println(name.equals(str));
	//compare two string reference(memory address)
	System.out.println(name==name1);//literal
	System.out.println(str1==str);
	
	//how to length
	int len = str.length();
	System.out.println(len);
	
	//l is present or not
	//convert my string into char
	char[] charArray = str.toCharArray();
	
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	//contains(compare string with matching content)
	System.out.println(str.contains("Leaf"));
	//count how many 'e' present
	String input="Test123leaf located in chennai";
	//split my word
	String[] split = input.split(" ");
	System.out.println(split);
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	//print single char
	System.out.println(input.charAt(3));
	//index value char
	System.out.println(input.indexOf('e'));
	//find substring
	
	System.out.println(input.substring(4));
	System.out.println(input.substring(0,4));
	//regex
	String cname="T1999estleaf";
	System.out.println(cname.replace('9', 'a'));
	System.out.println(cname.replaceAll("[^0-9]", ""));
	System.out.println(cname.replaceAll("\\d", ""));//char only
	System.out.println(cname.replaceAll("\\D", ""));//digit only
	//case accept
	System.out.println(str.equalsIgnoreCase(str1));
	//convert uppercase
	System.out.println(cname.toUpperCase());
	//convert lowercase
	System.out.println(cname.toLowerCase());
	//add two string
	String s1="               hello               ";
	String s2="Testleaf";
	 
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	
	System.out.println(s1+"welcome");
	//trim
	System.out.println(s1.trim());
	
	
	
	
	
	
	
}
}
