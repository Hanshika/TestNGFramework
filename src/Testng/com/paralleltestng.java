package Testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltestng {
	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	
	 
	  public void beforeTest(String browser) {
	 
	 if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
	   driver = new FirefoxDriver();
	   }else if (browser.equalsIgnoreCase("chrome")) { 
		  System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  
		driver.get("https://www.facebook.com/");  
	  
}
	  @Test
 public void function1() {
 driver.findElement(By.className("_58mt")).click();
System.out.println("radio button was clicked");
	 
Select dr=new Select(driver.findElement(By.id("month")));
dr.selectByValue("1");
Select dr1=new Select(driver.findElement(By.id("day")));
dr1.selectByValue("3");
Select dr2=new Select(driver.findElement(By.id("year")));
dr2.selectByValue("2016");
	  }

@AfterClass
public void afterTest() {
	 
	driver.quit();
}

}
