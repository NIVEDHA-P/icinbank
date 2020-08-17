package com.icin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RequestChequeBook {

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
		  
		  driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul[1]/li[4]/a")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul[1]/li[4]/ul/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(" /html/body/div[2]/div/div/form/div[1]/div/span[2]/i")).click();
		driver.findElement(By.xpath(" /html/body/div[4]/div[3]/table/tbody/tr[4]/td[2]")).click();
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr/td/span[17]")).click();
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td/span[3]")).click();
				driver.findElement(By.id("description")).sendKeys("do it as soon as possible");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"submitRequestChequeBook\"]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("		/html/body/div[5]/div/div/div[3]/button[2]")).click();
		
		  

	}

}
