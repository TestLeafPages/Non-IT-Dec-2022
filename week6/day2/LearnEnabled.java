package week6.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabled {
    @Ignore
	@Test
	public void createLead() {
	System.out.println("CreateLead");
}
	@Test(enabled = false)
	public void editLead() {
	System.out.println("EditLead");
}
	@Test
	public void deleteLead() {
	System.out.println("DeleteLead");
}
}
