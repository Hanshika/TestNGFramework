package Testng.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupingTestCases {

 @Test (groups = { "smoke Testing" })
	 
	  public void Test1() {
		 System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
	 
		  System.out.println("smokeTesting is executed");
	 
	  }
	 
	  @Test (groups = { "Sanity Testing" })
	 
	  public void Test2() {
		  System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  System.out.println("sanity Testing");
	 
	  }
	 
	  @Test (groups = { "Regression Testing" })
	 
	  public void Test3() {
		  System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  System.out.println("Regression Testing");
	 
	  }
	 
	  @Test (groups = { "smoke Tesing" })
	 
	  public void Test4() {
		  System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  System.out.println("smoke Testing exeuted");
	 
	  }
	 
	  @Test (groups = { "Sanity Testing", "Regression Testing" })
	 
	  public void Test5() {
		  WebDriver	  driver= new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  System.out.println("Sanity Testing and regression Testing exeuted");
	 
	  }

}
