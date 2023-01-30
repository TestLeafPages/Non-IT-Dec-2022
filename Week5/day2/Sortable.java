package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //handle the frame
		driver.switchTo().frame(0);
        //find the element
        WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement item2= driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
        WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
        WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
       
        // Step1 : Create object for Actions class
				Actions builder = new Actions(driver);
				builder.dragAndDrop(item5,item1).dragAndDrop(item4,item2).perform();

	}

}
