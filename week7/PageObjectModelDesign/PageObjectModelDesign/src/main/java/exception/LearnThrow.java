package exception;

public class LearnThrow {
 public int div() throws Exception  {
	 int num1=10;
	 int num2=25;
	 int result;
	 if(num1>num2) {
		 result=num1/num2;
		 System.out.println(result);
	 }
	 else {
		 throw new Exception("Invalid input");
	 }
	 return result;
 }
 public static void main(String[] args) throws Exception {
	 LearnThrow lt=new LearnThrow();
	 lt.div();
	 
}
}
