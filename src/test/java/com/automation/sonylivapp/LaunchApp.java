package com.automation.sonylivapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("------------Launch App-------------");
		driver.get("https://www.sonyliv.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		System.out.println("------------Closed------------------");
		
	}

	
}
