package com.icin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddRecipients {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","F:\\firefoxDriver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8009/index");
		 driver.findElement(By.name("username")).sendKeys("nivi");
		  driver.findElement(By.name("password")).sendKeys("12345");
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
		  
		  
			  driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul[1]/li[3]/a")).click(); 
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul[1]/li[3]/ul/li[4]/a")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.id("recipientName")).sendKeys("batman");
			  driver.findElement(By.id("recipientEmail")).sendKeys("batman@gmail.com");
			  driver.findElement(By.id("recipientPhone")).sendKeys("7337333373");
			  driver.findElement(By.id("recipientAccountNumber")).sendKeys("003007003007");
			  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/button")).click();
			  
			  Thread.sleep(5000);
			 
		  
	}

}
