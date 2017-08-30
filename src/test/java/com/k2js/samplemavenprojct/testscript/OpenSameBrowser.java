package com.k2js.samplemavenprojct.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class OpenSameBrowser {
	public static void main(String[] args) throws IOException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\SeleniumTrainingByJit\\Downloads\\SeleniumSW\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("user-data-dir=C:\\Users\\IBM_ADMIN\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.linkText("3.5.0"));
		ele.click();
		Runtime.getRuntime().exec("C:\\SeleniumTrainingByJit\\SaveFiles\\scite.exe");
//		Actions a = new Actions(driver);
//		a.contextClick(ele).build().perform();
//		C:\Users\IBM_ADMIN\AppData\Local\Google\Chrome\User Data\Default ---chromeoptions
//		selenium-server-standalone-3.5.0 (1).jar  ----filename
//		C:\SeleniumTrainingByJit\SaveFiles\selenium-server-standalone-3.5.0 (1).jar ----location for filename
	}
}
