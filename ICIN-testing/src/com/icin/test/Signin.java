package com.icin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signin {
	public static void main(String[] args){
		
		
		

		System.setProperty("webdriver.gecko.driver","F:\\firefoxDriver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8009/index");
		 driver.findElement(By.name("username")).sendKeys("nivi");
		  driver.findElement(By.name("password")).sendKeys("12345");
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
			/*
			 * WebElement radio = (new WebDriverWait(driver,
			 * 10)).until(ExpectedConditions.presenceOfElementLocated(By.
			 * className("fa fa-arrow-circle-right"))); radio.click();
			 * 
			 * 
			 * Select dropdown = new Select(driver.findElement(By.id("accountType")));
			 * dropdown.selectByVisibleText("Primary");
			 * driver.findElement(By.name("amount")).sendKeys("1000");
			 * driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click()
			 * ;
			 */
		  
		 

}
}
