package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;


public class ProjectSpecificMethod {
	public  ChromeDriver driver;
	public String sheet;
  @BeforeMethod
	public void LaunchBrowser() {
		System.out.println(driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
  @AfterMethod
  public void tearDown() {
	  driver.close();
  }
  @DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		String[][] readData = ReadExcel.readData(sheet);
		
		return readData;
	}
}
