package week6.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority = 1)
	public void createLead() {
	System.out.println("CreateLead");
}
	@Test(priority = -1)
	public void editLead() {
	System.out.println("EditLead");
}
	@Test
	public void deleteLead() {
	System.out.println("DeleteLead");
}
}
