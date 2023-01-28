package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find the element to right click
		WebElement rc = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
		
		//create reference for actions class
		Actions builder=new Actions(driver);
		//call the method in action class end with perform()
		builder.contextClick(rc).perform();
	}

}
