package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setup() {
		sheet="CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uname,String pwd,String cname,String fname,String lname) {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.enterCname(cname)
		.enterFname(fname)
		.enterLname(lname)
		.clickCreateButton().verifyLead();
	}
}
