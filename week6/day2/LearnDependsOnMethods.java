package week6.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {
	@Test
	public void createLead() {
	System.out.println("CreateLead");
	throw new RuntimeException("fail due to time out");
}
	@Test(dependsOnMethods = {"createLead","deleteLead"})
	public void editLead() throws InterruptedException {
		//Thread.sleep(2000);
	System.out.println("EditLead");
}
	@Test(dependsOnMethods = "createLead",alwaysRun =true)
	public void deleteLead() {
	System.out.println("DeleteLead");
}
}
