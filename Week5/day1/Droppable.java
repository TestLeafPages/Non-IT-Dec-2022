package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find the element to be drag
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
	    //find the target element
		WebElement target = driver.findElement(By.id("form:drop_header"));
	    //Actions
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();
	
	    //verify
		System.out.println(target.getCssValue("background-color"));
	}

}
