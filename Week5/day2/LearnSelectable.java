package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //handle the frame
		driver.switchTo().frame(0);
        //find the element
        WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement item2= driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
        WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
       
        // Step1 : Create object for Actions class
				Actions builder = new Actions(driver);

		// step2: use appropriate method to do the action
		//builder.clickAndHold(item1).moveToElement(item6).release().perform();
				builder.keyDown(Keys.CONTROL)
				.click(item1)
				.click(item3)
				.click(item5)
				.keyUp(Keys.CONTROL).perform();
		// perform() is mandatory at the end of actions
        

	}

}
