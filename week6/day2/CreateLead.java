package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod {

	@Test(dataProvider = "CreateLead")
	public void runCreateLead(String cname,String firstname,String lastname)  {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="CreateLead")
	public String[][] getData() {
		String[][] data=new String[2][3];//row//column
		
		//1 st set of data
		data[0][0]="Qeagle";
		data[0][1]="Princila";
		data[0][2]="edward";
		
		//2nd set of data
		data[1][0]="Testleaf";
		data[1][1]="Hari";
		data[1][2]="R";
		return data;
	}
	
	
	
}






