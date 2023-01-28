package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		       // Launch the browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				// Step1: Launch the URL - https://erail.in/
				driver.get("https://erail.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        // Uncheck the check box - sort on date
				driver.findElement(By.id("chkSelectDateOnly")).click();
				// clear and type in the source station
				driver.findElement(By.id("txtStationFrom")).clear();
				driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.ENTER);
				// clear and type in the destination station
				driver.findElement(By.id("txtStationTo")).clear();
				driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.ENTER);
              List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
	             System.out.println(rowCount.size());
	             //print the train Names
	             List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
	             System.out.println("List size"+trainNames.size()); 
	             for (int i =0; i < trainNames.size(); i++) {
	            	  String names = trainNames.get(i).getText();
	             }
	            //convert List into set to check duplicate present or not
	            Set<WebElement>dup=new LinkedHashSet<WebElement>(trainNames);
	            System.out.println("set size"+dup.size());
	             
	            if(trainNames.size()==dup.size()) {
	            	System.out.println("No Duplicate");
	            }
	            else {
	            	System.out.println("Duplicate present");
	            }
	            //method used to check any specific train name present
	              //if(names.contains("EXPRESS")) {
	              // System.out.println(names);
	              //}
	             }
	
	}


