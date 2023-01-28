package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find the element to right click
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		
		//create reference for actions class
		Actions builder=new Actions(driver);
		//call the appropriate method in action class end with perform()
		builder.scrollToElement(scroll).perform();
		 //Take snapshot
	     File source = driver.getScreenshotAs(OutputType.FILE);
	     //create physical path
	     File dest=new  File("./snap/amazon.png");
	     //copy source and dest
	     FileUtils.copyFile(source, dest);

	}

}
