package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		
	}

	public LoginPage enterUserName(String uname) {
		System.out.println(driver);
		try {
			driver.findElement(By.id("userame")).sendKeys(uname);
			throw new RuntimeException("Username not enter");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return this;
		
	}
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
         return this;
	}
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

	
		
	
	
}
