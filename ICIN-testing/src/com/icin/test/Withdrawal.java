package com.icin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Withdrawal {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\firefoxDriver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8009/index");
		 driver.findElement(By.name("username")).sendKeys("nivi");
		  driver.findElement(By.name("password")).sendKeys("12345");
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/a/div/span[1]")).click();
		  Select dropdown = new Select(driver.findElement(By.id("accountType")));
		  dropdown.selectByVisibleText("Savings");
		  driver.findElement(By.name("amount")).sendKeys("200");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
		 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/a/div/span[1]")).click();

	}

}
