package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/window.xhtml");
	//open only one window
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	System.out.println(driver.getTitle());
	
	//click the new window open
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	/*
	 * - getWindowHandles()
- Convert Set to List
- Pick the particular window using get(index)
- Switch to the window using the handle
- Close or Quit

	 */
	//- getWindowHandles()
	Set<String> windowHandles = driver.getWindowHandles();//ctrl+2+l
	System.out.println(windowHandles.size());
	//create the list
	List<String>lstWindow=new ArrayList<String>(windowHandles);
	//switch the control to window
	driver.switchTo().window(lstWindow.get(1));
	
	
	driver.close();
	driver.switchTo().window(lstWindow.get(0));
	System.out.println(driver.getTitle());
	//driver.quit();
	
	
}
}
