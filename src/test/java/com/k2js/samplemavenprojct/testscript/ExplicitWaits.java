package com.k2js.samplemavenprojct.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\SeleniumTrainingByJit\\Downloads\\SeleniumSW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebDriverWait ww = new WebDriverWait(driver, 50);
		WebElement reg_link = ww.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
		reg_link.click();

		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		fw.withTimeout(50, TimeUnit.SECONDS);// total time
		fw.pollingEvery(5, TimeUnit.SECONDS);// will chk aftr evry 5 sec fr element
		// fw.ignoreAll("");
		List<WebElement> link = fw
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//select/option")));
		for (WebElement e : link) {
			if (e.getText().trim().equalsIgnoreCase("INDIA")) {
				e.click();
			}
		}

	}
}
