/*
2.	You have an existing suite of tests for an New Tour application
(https://demo.guru99.com/test/newtours/). After a recent update, you need
to implement regression tests to ensure that the login process continues
to work as expected.
*/
package Que2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTouristLoginTest {
	 @Test
	    public void verifyLoginFunctionality() throws InterruptedException {
	        // Set path of Firefox driver
	        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");

	        // Create instance of FirefoxDriver
	        WebDriver driver = new FirefoxDriver();

	        // Open New Tours login page
	        driver.get("https://demo.guru99.com/test/newtours/");
	        driver.manage().window().maximize();

	        System.out.println("Opened New Tours Website successfully.");

	        // Locate username and password fields
	        WebElement usernameField = driver.findElement(By.name("userName"));
	        WebElement passwordField = driver.findElement(By.name("password"));

	        // Enter login credentials
	        usernameField.sendKeys("mercury");
	        passwordField.sendKeys("mercury");
	        Thread.sleep(2000);
	        // Click on Submit button
	        WebElement submitBtn = driver.findElement(By.name("submit"));
	        submitBtn.click();

	        Thread.sleep(2000);

	        // Get the actual title after login
	        String actualTitle = driver.getTitle();
	        String expectedTitle = "Login: Mercury Tours";

	        System.out.println("Actual Title: " + actualTitle);
	        System.out.println("Expected Title: " + expectedTitle);

	        // Validate title using Assertion
	        Assert.assertEquals(actualTitle, expectedTitle, "Login Failed - Title does not match!");

	        System.out.println("Login successful - Regression Test Passed!");

	        // Close the browser
	        driver.quit();
	 }
}
