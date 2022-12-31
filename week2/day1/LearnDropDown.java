package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Load the url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01f02dyrxue2jb65a4yuqganhm22015.node0");
	//find the Element
	WebElement tool = driver.findElement(By.className("ui-selectonemenu"));//ctrl+2+l
	//Create obj for Select class
	Select drop =new Select(tool);
	//Select by index
	drop.selectByIndex(1);
	//Select by value
	//drop.selectByValue("ui-selectonemenu-label");
	tool.click();
	//Select by visibleText
	drop.selectByVisibleText("Playwright");
	
	
	
}
}
