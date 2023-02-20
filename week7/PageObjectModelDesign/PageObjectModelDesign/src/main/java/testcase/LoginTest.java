package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest  extends ProjectSpecificMethod{
@BeforeTest
	public void setup() {
		sheet="Login";
	}
	@Test(dataProvider = "fetchData")
	public void runLoginTest(String uname,String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin();
	}
}
