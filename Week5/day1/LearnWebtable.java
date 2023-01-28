package week5.day1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnWebtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/table.xhtml");
		//count of row
		 List<WebElement> rowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
         System.out.println("Row Count:"+rowCount.size());
         //get column counr
         List<WebElement> columncount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr[1]/td"));
         //table[@role='grid'])[2]//th
         System.out.println("Column Count:"+columncount.size());
         //print the hearder value
         String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[1]")).getText();
         System.out.println(text);
         String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[3]/td[2]")).getText();
	     System.out.println(text2);
	     for (int i =1; i <rowCount.size(); i++) {
	    	 String text3 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td[2]")).getText();
			System.out.println(text3);
		}
	}

}
