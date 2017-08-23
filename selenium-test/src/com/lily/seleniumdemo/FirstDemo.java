package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
                                                                                                                                                                                  
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "D:/软件/selenium/selenium-2.42.2/chromedriver.exe");

		WebDriver driver = new ChromeDriver();//新建WebDriver对象，new ChromeDriver驱动。driver 可以调用WebDriver中的方法，即API。
		driver.get("https://www.baidu.com/");//get(String url)：打开指定网站

		// Thread.sleep(5*1000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//等待2秒

		driver.findElement(By.id("kw")).sendKeys("hello selenium");//findElement(By by):在页面中寻找一个元素
		//sendKeys(String string):向定位的text输入框输入想要输入的内容。上传文件也可以用sendKeys，string为上传文件的路径
		driver.findElement(By.id("su")).click();

		try{
			Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

		// driver.quit();//閫�鍑�
		// driver.close(); //鍏抽棴

	}

}
