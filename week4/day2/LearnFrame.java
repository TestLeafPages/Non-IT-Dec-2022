package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnFrame {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/frame.xhtml");
		//To switch the control to frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
	    System.out.println(text);
	     driver.switchTo().defaultContent();//switch back to the parent window or main document
	     driver.switchTo().frame(2);//index
	     driver.switchTo().frame("frame2");//id or name
	    // driver.switchTo().parentFrame();-->switch back to parent frame
	     driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	    //Take snapshot
	     File source = driver.getScreenshotAs(OutputType.FILE);
	     //create physical path
	     File dest=new  File("./snap/frame.png");
	     //copy source and dest
	     FileUtils.copyFile(source, dest);
	
	
	}

}
