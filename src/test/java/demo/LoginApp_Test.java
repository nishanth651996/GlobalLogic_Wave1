package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp_Test {
	WebDriver driver;
	  @Test
	  public void testLogin() throws InterruptedException {
		    
			driver.findElement(By.id("Email")).sendKeys("nishanthimmanuel6596@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Welcome@123#");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(3000);
			boolean loginLink = driver.findElement(By.xpath("//a[text()='nishanthimmanuel6596@gmail.com']")).isDisplayed();
			Assert.assertEquals(true, loginLink);
			Thread.sleep(3000);
	  }
	  
	  
	  
	  @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/login");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

}
