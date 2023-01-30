package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL 
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//click the element
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
	    visible.click();
	     //Explicit wait
	     //Create obj for WebDriverWait
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	     
	    //wait until the element to visible
	    wait.until(ExpectedConditions.visibilityOf(visible));
	    //verification
	    String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
	System.out.println(text);
	
	}

}
