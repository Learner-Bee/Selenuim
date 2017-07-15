package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Lily/Dev/selenium-2.42.2/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");

		// Thread.sleep(5*1000);

		driver.findElement(By.id("kw")).sendKeys("hello selenium");
		driver.findElement(By.id("su")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.quit();//退出
		// driver.close(); //关闭

	}

}
