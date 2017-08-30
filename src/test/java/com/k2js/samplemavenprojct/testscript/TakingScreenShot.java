package com.k2js.samplemavenprojct.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShot {
	// public static void main(String[] args) throws IOException {
	// System.setProperty("webdriver.chrome.driver",
	// "C:\\SeleniumTrainingByJit\\Downloads\\SeleniumSW\\chromedriver_win32\\chromedriver.exe");
	@Test
	public void takeScreenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile, new File("C:\\SeleniumTrainingByJit\\SaveFiles\\"+CurrentSystemDate.getSystemDate()+".png"));
	}
}
