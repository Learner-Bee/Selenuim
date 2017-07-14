package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {

	public static void main(String[] args) {
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("hello selenium");
		driver.findElement(By.id("su")).click();
		
		driver.quit();//退出所有webdriver窗口
		//driver.close(); 只关闭当前页面

	}

}
