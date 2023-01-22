package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSet{
/*
 * ClassRoom 3:
step1:Launch the browser 
step2:Load the url-https://www.amazon.in/
step3:Enter Mobile in the search bar and pass the enter key(Like:sendKeys(Mobile,keys.Enter))
step4:Print all the price of the mobile
step5:Print the price in order
 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
		List<String> lst=new ArrayList<String>();//Store String of data into list
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < price.size(); i++) {
		String num = price.get(i).getText();
		lst.add(num);
		System.out.println(num);
		}
		Set<String>dups=new TreeSet<String>(lst);
		System.out.println(dups);
	}
}
