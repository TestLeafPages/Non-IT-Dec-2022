package week6.day2;

import org.testng.annotations.Test;

public class LearnTimeOut {
	@Test(timeOut = 2000)
	public void createLead() throws InterruptedException {
		
	System.out.println("CreateLead");
}
	@Test
	public void editLead() throws InterruptedException {
		Thread.sleep(2000);
	System.out.println("EditLead");
}
	@Test
	public void deleteLead() {
	System.out.println("DeleteLead");
}
}
