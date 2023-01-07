package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {

	public static void main(String[] args) {
				//will open chrome browser
				ChromeDriver driver=new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				//load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	           //Enter user name
				driver.findElement(By.xpath("(//input[@class='decorativeSubmit']/preceding::input)[1]")).sendKeys("demosalesmanager");
				//Enter password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	             //click login
				driver.findElement(By.xpath("(//label[text()='Username']/following::input)[3]")).click();
	 
				
	
	}

}
