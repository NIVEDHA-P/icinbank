package com.icin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BetweenAccounts {

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
			  driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul[1]/li[3]/ul/li[1]/a")).click();
			  
			
			  Thread.sleep(5000); 
			  Select dropdown = new  Select(driver.findElement(By.id("transferFrom")));
			  dropdown.selectByVisibleText("Primary");
			  Thread.sleep(5000); 
			  Select dropdown1= new Select(driver.findElement(By.id("transferTo")));
			  dropdown1.selectByVisibleText("Savings"); 
			  Thread.sleep(5000);
			  driver.findElement(By.name("amount")).sendKeys("100");
			  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click(); 
			  Thread.sleep(5000);
			 

	}

}
