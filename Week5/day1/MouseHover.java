package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the element to do the action
		WebElement men = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
        //class
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
	}

}
