package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvisibilityOfElement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Step1: Launch the URL 
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click the element
		WebElement invisible = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
	    invisible.click();
	     //Explicit wait
	    
	  //verification
	    String text = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
	    System.out.println(text);
	    //Create obj for WebDriverWait
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	     
	    //wait until the element to visible
	    wait.until(ExpectedConditions.invisibilityOf(invisible));
	    
	
	}

}
