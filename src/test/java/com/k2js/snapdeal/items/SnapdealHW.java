package com.k2js.snapdeal.items;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class SnapdealHW {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		fw.withTimeout(50, TimeUnit.SECONDS);
		fw.pollingEvery(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Computers & Gaming']")).click();
		driver.findElement(By.xpath("//span[text()='Storage']")).click();
		
		driver.findElement(By.xpath("//label[@for='Capacity_s-1 TB']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		WebElement viewMore = driver.findElement(By.xpath("//button[@data-filtername='Capacity_s']"));
		viewMore.getText();
		// ((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView();",viewMore);
		// viewMore.click();
		// driver.findElement(By.xpath("//label[@for='Type_s-Portable']")).click();	
		
	}

}
