package Flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstPage {
	@Test
	public void getDetailsOfIphone() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA VELOCITY 2020\\CromeDriver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		HomePage home=new HomePage(driver);
		home.HomePageCloseBtn();
		home.HomePageSearchMob();
		home.SearchIcon();
		
		Search s =new Search(driver);
		s.getDetails();
		
	}

}
