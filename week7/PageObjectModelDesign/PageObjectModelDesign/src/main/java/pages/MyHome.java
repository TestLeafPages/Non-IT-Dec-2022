package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHome extends ProjectSpecificMethod{
	public MyHome(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyLead clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLead(driver);
	}
}
