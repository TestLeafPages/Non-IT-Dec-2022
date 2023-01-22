package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoreAboutWindow {

	public static void main(String[] args) {
		// We have to call WDM for the browser driver !!
				WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
				
				// Launch the browser (chrome)
				ChromeDriver driver = new ChromeDriver();
				
				// Load the URL 
				driver.get("https://www.leafground.com/window.xhtml");
					
				// Maximize the browser 
				driver.manage().window().maximize();
				
				// print the window handle of the active browser/tab
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);
				
				// Click Home link to open another window
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				
				// Now, what is the window handle -- control will not move automatically
				System.out.println(driver.getWindowHandle());
				
				// How can I know the second window handle?
				Set<String> windowHandles = driver.getWindowHandles(); // that are opened in the current execution
				System.out.println("How many handles? "+windowHandles.size());
				
				// How can I get second from Set? 
				List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
				String secondWindowHandle = lstWindowHandles.get(1);
				System.out.println("Second Window "+secondWindowHandle);
				
				// How can I move the control to the second window?
				driver.switchTo().window(secondWindowHandle);
				
				// Print title
				System.out.println(driver.getTitle());
				
				// Close vs quit
				driver.quit();
				
				/*
				
				// switch to primary
				driver.switchTo().window(windowHandle);
				
				// Print title
				System.out.println(driver.getTitle());
				
				// close
				driver.close();
				
				*/

	}

}
