package Que1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	@Test
	  public void verifyTitle() {
		  //set path of browser driver
		  System.setProperty("webdriver.gecko.driver","E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
		  //create instance of browser driver
		  WebDriver driver=new FirefoxDriver();
		  //open webpage
		  driver.get("https://www.google.com/");
		  
		  //configure expected title
		  String expectedTitle="Google";
		  
		  //get actual title
		  String actualTitle=driver.getTitle();
		  
		  System.out.println("Actual title: "+actualTitle);
		  System.out.println("Expected title: "+expectedTitle);

		  
		  //assert title i.e. verify actual title is same as expected title
		  Assert.assertEquals(actualTitle, expectedTitle,"Title is not as expected...");
		  
		  driver.quit();
	  }
}
