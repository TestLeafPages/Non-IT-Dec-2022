package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handle the frame
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println(drag.getLocation());
		//create reference for actions class
		Actions builder=new Actions(driver);
		//call the method in action class end with perform()
		builder.dragAndDropBy(drag, 100, 100).perform();
		//verify
		System.out.println(drag.getLocation());
		
		

	}

}
