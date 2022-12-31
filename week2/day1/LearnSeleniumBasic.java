package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {


	public static void main(String[] args) {
		//set up the path
		//WebDriverManager.edgedriver().setup();
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//find the user name
		//To Enter username as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find the password
		//Enter the password crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login 
		driver.findElement(By.className("decorativeSubmit")).click();
		//Get the title of page(verification)
		String title1 = driver.getTitle();//ctrl+2+l
		System.out.println(title1);
		//Click CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click Lead
		driver.findElement(By.linkText("Leads")).click();
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf",Keys.ENTER);
		//Enter Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		//Enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		//To get the text
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        System.out.println(text);
        //verification
        if(text.contains("Princila")) {
			System.out.println("Name present");
		}
		else {
			System.out.println("Name not presented");
		}
      
		//close the browser
		driver.close();
		
		
		
		
		
		
		
	}
}
