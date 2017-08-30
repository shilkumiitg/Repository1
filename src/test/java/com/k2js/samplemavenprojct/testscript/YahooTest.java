package com.k2js.samplemavenprojct.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YahooTest {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search_box_ele = driver.findElement(By.id("uh-search-box"));
		search_box_ele.sendKeys("test");
		
		
		List<WebElement> inputs = driver.findElements(By.className("yui3-aclist-item"));
		System.out.println("size is " + inputs.size());
		int size = inputs.size();
		if (size % 2 == 0) {
			System.out.println(inputs.get(size / 2 - 1).getText());
			System.out.println(inputs.get(size/2).getText());
			// inputs.get(size/2).getText()+ " "
		}
		else
		{
			System.out.println(inputs.get(size/2).getText());
		}

	}
}
