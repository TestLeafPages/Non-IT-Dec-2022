package week4.day1;

public class Bank extends Axisbank implements BankInfo,RBI{
	
	public static void main(String[] args) {
		Bank obj =new Bank();
		System.out.println(rate);
		obj.deposit();
		obj.fixedDeposit();
		obj.interest();
		obj.Loan();
	}

	public void interest() {
	System.out.println();	
		
	}

	public void deposit() {
		System.out.println("5%");
	}

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		
	}

	

}
