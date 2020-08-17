package com.icin.test;



import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Signup {

	public static void main(String[] args) throws InterruptedException {
	
		
	

		System.setProperty("webdriver.gecko.driver","F:\\firefoxDriver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8009/index");
		
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/a")).click();
		
		
		  WebElement radio = (new WebDriverWait(driver,
		  10)).until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")))
		  ; radio.sendKeys("abcdef");
		  
		  driver.findElement(By.name("lastName")).sendKeys("xyz");
		  driver.findElement(By.name("phone")).sendKeys("1234567890");
		  driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		  driver.findElement(By.name("username")).sendKeys("mivi");
		  driver.findElement(By.name("password")).sendKeys("678910");
		  driver.findElement(By.id("showPassword")).click();
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[7]/button")).click();
		  
		 
		
		
	}

}