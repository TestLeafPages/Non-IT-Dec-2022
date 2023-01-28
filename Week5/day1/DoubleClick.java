package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handle the frame
		driver.switchTo().frame("iframeResult");
		//find the element to right click
		WebElement doubleClick = driver.findElement(By.xpath("//p[contains(text(),'Double-click')]"));
		
		//create reference for actions class
		Actions builder=new Actions(driver);
		//call the method in action class end with perform()
		builder.doubleClick(doubleClick).perform();
		//verify
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}

}
