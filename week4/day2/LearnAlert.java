package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		//click simple alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
	    //switch the control to alert
		Alert a1 = driver.switchTo().alert();//ctrl+2+l
		//print the information in the alert box
		String text = a1.getText();
		System.out.println(text);
		//click ok
		a1.accept();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		//prompt alert
		//click prompt alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
	    //switch the control
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Testleaf chennai");
		//information from the alert box
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.accept();
	}

}
