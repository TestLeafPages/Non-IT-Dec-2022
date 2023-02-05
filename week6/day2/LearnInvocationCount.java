package week6.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	@Test
	public void createLead() {
	System.out.println("CreateLead");
}
	@Test(invocationCount = 2,invocationTimeOut = 2000)
	public void editLead() throws InterruptedException {
		//Thread.sleep(2000);
	System.out.println("EditLead");
}
	@Test(invocationCount =4,threadPoolSize = 4)
	public void deleteLead() {
	System.out.println("DeleteLead");
}
}
