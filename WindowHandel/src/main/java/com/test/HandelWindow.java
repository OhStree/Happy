package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelWindow {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Switch\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div/a")).click();
		driver.switchTo().window(mainWindow);
	}

}
